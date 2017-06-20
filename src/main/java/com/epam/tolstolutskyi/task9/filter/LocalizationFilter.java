package com.epam.tolstolutskyi.task9.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.epam.tolstolutskyi.task9.localization.provider.LocalizationProvider;
import com.epam.tolstolutskyi.task9.localization.requestwrapper.LocalizationRequest;
import com.epam.tolstolutskyi.task9.utils.LocalizationUtil;

@WebFilter(dispatcherTypes = { DispatcherType.REQUEST, DispatcherType.FORWARD }, urlPatterns = { "/*" }, initParams = {
		@WebInitParam(name = "availableLocale1", value = "en"), @WebInitParam(name = "availableLocale2", value = "ru") })
public class LocalizationFilter implements Filter {
	private LocalizationProvider provider;
	private List<String> availableLocales;

	public LocalizationFilter() {

	}

	public void destroy() {

	}

	private Locale getLocale(HttpServletRequest request) {
		Locale locale = null;
		String lang = request.getParameter("lang");
		if (lang != null) {
			if (availableLocales.contains(lang)) {
				locale = LocalizationUtil.convertStringToLocale(lang);
				return locale;
			}
		}
		String localeFromStorage = provider.getLocale(request);
		if (localeFromStorage != null) {
			locale = LocalizationUtil.convertStringToLocale(localeFromStorage);
			return locale;
		}
		Enumeration<Locale> requestLocalesIterator = request.getLocales();
		while (requestLocalesIterator.hasMoreElements()) {
			Locale browserLocale = requestLocalesIterator.nextElement();
			if (availableLocales.contains(browserLocale.getLanguage())) {
				locale = browserLocale;
				return locale;
			}
		}
		locale = Locale.getDefault();
		return locale;
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		Locale locale = getLocale(httpRequest);
		provider.saveLocale(locale.getLanguage(), httpRequest, httpResponse);
		chain.doFilter(new LocalizationRequest(httpRequest, locale), response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
		provider = (LocalizationProvider) fConfig.getServletContext().getAttribute("localizationProvider");
		availableLocales = new ArrayList<>();
		Enumeration<String> initParametersIterator = fConfig.getInitParameterNames();
		while (initParametersIterator.hasMoreElements()) {
			String parameterName = initParametersIterator.nextElement();
			if (parameterName.contains("availableLocale")) {
				availableLocales.add(fConfig.getInitParameter(parameterName));
			}
		}
	}

}
