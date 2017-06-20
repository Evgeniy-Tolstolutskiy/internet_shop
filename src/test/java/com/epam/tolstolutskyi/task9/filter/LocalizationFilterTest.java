package com.epam.tolstolutskyi.task9.filter;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Locale;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.junit.Test;
import org.mockito.Mockito;

import com.epam.tolstolutskyi.task9.localization.provider.CookiesLocalizationProvider;
import com.epam.tolstolutskyi.task9.localization.provider.LocalizationProvider;
import com.epam.tolstolutskyi.task9.localization.provider.SessionLocalizationProvider;
import com.epam.tolstolutskyi.task9.localization.requestwrapper.LocalizationRequest;
import com.epam.tolstolutskyi.task9.utils.LocalizationUtil;

public class LocalizationFilterTest extends Mockito {
	private static final String RU = "ru";
	private static final String EN = "en";
	private static final int COOKIE_TIMEOUT = 1000;
	private HttpServletRequest request = mock(HttpServletRequest.class);
	private HttpServletResponse response = mock(HttpServletResponse.class);
	private FilterChain filterChain = mock(FilterChain.class);
	private FilterConfig fConfig = mock(FilterConfig.class);
	private LocalizationFilter filter = new LocalizationFilter();
	private ServletContext context = mock(ServletContext.class);
	private HttpSession session = mock(HttpSession.class);
	private LocalizationProvider provider;

	public void init(String locale, LocalizationProvider provider) throws ServletException, IOException {
		Cookie cookie = new Cookie("locale", locale);
		doNothing().when(response).addCookie(cookie);
		when(request.getCookies()).thenReturn(new Cookie[] { cookie });
		when(request.getRequestURI()).thenReturn("WEB-INF/index.jsp");
		when(fConfig.getServletContext()).thenReturn(context);
		when(context.getAttribute("localizationProvider")).thenReturn(provider);
		when(fConfig.getInitParameter("availableLocale1")).thenReturn(EN);
		when(fConfig.getInitParameter("availableLocale2")).thenReturn(RU);
		when(fConfig.getInitParameterNames()).thenReturn(new Enumeration<String>() {
			int index = 0;
			String[] elements = new String[] { "availableLocale1", "availableLocale2" };

			@Override
			public String nextElement() {
				return elements[index++];
			}

			@Override
			public boolean hasMoreElements() {
				return index < 2;
			}
		});
		when(request.getSession()).thenReturn(session);
		when(session.getAttribute("locale")).thenReturn(locale);
		doNothing().when(session).setAttribute("locale", locale);
	}

	@Test
	public void testLocaleFromLangWithSessionEn() throws ServletException, IOException {
		String localeStr = EN;
		provider = new SessionLocalizationProvider();
		init(localeStr, provider);
		when(request.getParameter("lang")).thenReturn(EN);
		filter.init(fConfig);
		filter.doFilter(request, response, filterChain);
		Locale locale = LocalizationUtil.convertStringToLocale(provider.getLocale(request));
		LocalizationRequest reqWrapper = new LocalizationRequest(request, locale);
		assertEquals(EN, reqWrapper.getLocale().toString());
	}

	@Test
	public void testLocaleFromLangWithSessionRu() throws ServletException, IOException {
		String localeStr = RU;
		provider = new SessionLocalizationProvider();
		init(localeStr, provider);
		when(request.getParameter("lang")).thenReturn(RU);
		filter.init(fConfig);
		filter.doFilter(request, response, filterChain);
		Locale locale = LocalizationUtil.convertStringToLocale(provider.getLocale(request));
		LocalizationRequest reqWrapper = new LocalizationRequest(request, locale);
		assertEquals(RU, reqWrapper.getLocale().toString());
	}

	@Test
	public void testLocaleFromStorageWithSessionEn() throws ServletException, IOException {
		String localeStr = EN;
		provider = new SessionLocalizationProvider();
		init(localeStr, provider);
		filter.init(fConfig);
		filter.doFilter(request, response, filterChain);
		Locale locale = LocalizationUtil.convertStringToLocale(provider.getLocale(request));
		LocalizationRequest reqWrapper = new LocalizationRequest(request, locale);
		assertEquals(EN, reqWrapper.getLocale().toString());
	}

	@Test
	public void testLocaleFromStorageWithSessionRu() throws ServletException, IOException {
		String localeStr = RU;
		provider = new SessionLocalizationProvider();
		init(localeStr, provider);
		filter.init(fConfig);
		filter.doFilter(request, response, filterChain);
		Locale locale = LocalizationUtil.convertStringToLocale(provider.getLocale(request));
		LocalizationRequest reqWrapper = new LocalizationRequest(request, locale);
		assertEquals(RU, reqWrapper.getLocale().toString());
	}

	@Test
	public void testLocaleFromBrowserEn() throws ServletException, IOException {
		when(request.getLocales()).thenReturn(new Enumeration<Locale>() {
			int index = 0;
			Locale[] locales = new Locale[] { LocalizationUtil.convertStringToLocale(EN),
					LocalizationUtil.convertStringToLocale(RU) };

			@Override
			public boolean hasMoreElements() {
				return index < 2;
			}

			@Override
			public Locale nextElement() {
				return locales[index++];
			}
		});

		String localeStr = EN;
		provider = new SessionLocalizationProvider();
		init(localeStr, provider);
		when(session.getAttribute("locale")).thenReturn(null);
		filter.init(fConfig);
		filter.doFilter(request, response, filterChain);
		Locale locale = LocalizationUtil.convertStringToLocale(EN);
		LocalizationRequest reqWrapper = new LocalizationRequest(request, locale);
		assertEquals(EN, reqWrapper.getLocale().toString());
	}

	@Test
	public void testLocaleFromBrowserRu() throws ServletException, IOException {
		when(request.getLocales()).thenReturn(new Enumeration<Locale>() {
			int index = 0;
			Locale[] locales = new Locale[] { LocalizationUtil.convertStringToLocale(EN),
					LocalizationUtil.convertStringToLocale(RU) };

			@Override
			public boolean hasMoreElements() {
				return index < 2;
			}

			@Override
			public Locale nextElement() {
				return locales[index++];
			}
		});

		String localeStr = RU;
		provider = new SessionLocalizationProvider();
		init(localeStr, provider);
		when(session.getAttribute("locale")).thenReturn(null);
		filter.init(fConfig);
		filter.doFilter(request, response, filterChain);
		Locale locale = LocalizationUtil.convertStringToLocale(RU);
		LocalizationRequest reqWrapper = new LocalizationRequest(request, locale);
		assertEquals(RU, reqWrapper.getLocale().toString());
	}

	@Test
	public void testDefaultLocaleEn() throws ServletException, IOException {
		when(request.getLocales()).thenReturn(new Enumeration<Locale>() {
			@Override
			public boolean hasMoreElements() {
				return false;
			}

			@Override
			public Locale nextElement() {
				return null;
			}
		});

		String localeStr = EN;
		provider = new SessionLocalizationProvider();
		init(localeStr, provider);
		when(session.getAttribute("locale")).thenReturn(null);
		filter.init(fConfig);
		filter.doFilter(request, response, filterChain);
		Locale locale = LocalizationUtil.convertStringToLocale(EN);
		LocalizationRequest reqWrapper = new LocalizationRequest(request, locale);
		assertEquals(EN, reqWrapper.getLocale().toString());
	}

	@Test
	public void testDefaultLocaleRu() throws ServletException, IOException {
		when(request.getLocales()).thenReturn(new Enumeration<Locale>() {
			@Override
			public boolean hasMoreElements() {
				return false;
			}

			@Override
			public Locale nextElement() {
				return null;
			}
		});

		String localeStr = RU;
		provider = new SessionLocalizationProvider();
		init(localeStr, provider);
		when(session.getAttribute("locale")).thenReturn(null);
		filter.init(fConfig);
		filter.doFilter(request, response, filterChain);
		Locale locale = LocalizationUtil.convertStringToLocale(RU);
		LocalizationRequest reqWrapper = new LocalizationRequest(request, locale);
		assertEquals(RU, reqWrapper.getLocale().toString());
	}

	@Test
	public void testLocaleFromLangWithCookiesEn() throws ServletException, IOException {
		String localeStr = EN;
		provider = new CookiesLocalizationProvider(COOKIE_TIMEOUT);
		init(localeStr, provider);
		when(request.getParameter("lang")).thenReturn(EN);
		filter.init(fConfig);
		filter.doFilter(request, response, filterChain);
		Locale locale = LocalizationUtil.convertStringToLocale(provider.getLocale(request));
		LocalizationRequest reqWrapper = new LocalizationRequest(request, locale);
		assertEquals(EN, reqWrapper.getLocale().toString());
	}

	@Test
	public void testLocaleFromLangWithCookiesRu() throws ServletException, IOException {
		String localeStr = RU;
		provider = new CookiesLocalizationProvider(COOKIE_TIMEOUT);
		init(localeStr, provider);
		when(request.getParameter("lang")).thenReturn(RU);
		filter.init(fConfig);
		filter.doFilter(request, response, filterChain);
		Locale locale = LocalizationUtil.convertStringToLocale(provider.getLocale(request));
		LocalizationRequest reqWrapper = new LocalizationRequest(request, locale);
		assertEquals(RU, reqWrapper.getLocale().toString());
	}

	@Test
	public void testLocaleFromStorageWithCookiesEn() throws ServletException, IOException {
		String localeStr = EN;
		provider = new CookiesLocalizationProvider(COOKIE_TIMEOUT);
		init(localeStr, provider);
		filter.init(fConfig);
		filter.doFilter(request, response, filterChain);
		Locale locale = LocalizationUtil.convertStringToLocale(provider.getLocale(request));
		LocalizationRequest reqWrapper = new LocalizationRequest(request, locale);
		assertEquals(EN, reqWrapper.getLocale().toString());
	}

	@Test
	public void testLocaleFromStorageWithCookiesRu() throws ServletException, IOException {
		String localeStr = RU;
		provider = new CookiesLocalizationProvider(COOKIE_TIMEOUT);
		init(localeStr, provider);
		filter.init(fConfig);
		filter.doFilter(request, response, filterChain);
		Locale locale = LocalizationUtil.convertStringToLocale(provider.getLocale(request));
		LocalizationRequest reqWrapper = new LocalizationRequest(request, locale);
		assertEquals(RU, reqWrapper.getLocale().toString());
	}

}
