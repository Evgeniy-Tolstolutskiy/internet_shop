package com.epam.tolstolutskyi.task9.localization.requestwrapper;

import java.util.Enumeration;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class LocalizationRequest extends HttpServletRequestWrapper {
	private Locale locale;
	private Enumeration<Locale> locales;

	public LocalizationRequest(HttpServletRequest request, final Locale locale) {
		super(request);
		this.locale = locale;
		locales = new Enumeration<Locale>() {
			int index = 0;

			public Locale nextElement() {
				index++;
				return locale;
			}

			public boolean hasMoreElements() {
				return index < 1;
			}
		};
	}

	@Override
	public Locale getLocale() {
		return locale;
	}

	@Override
	public Enumeration<Locale> getLocales() {
		return locales;
	}

}
