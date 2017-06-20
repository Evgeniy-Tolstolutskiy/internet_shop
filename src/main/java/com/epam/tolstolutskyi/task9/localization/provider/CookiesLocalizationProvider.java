package com.epam.tolstolutskyi.task9.localization.provider;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookiesLocalizationProvider implements LocalizationProvider {
	private int cookieTimeout;
	
	public CookiesLocalizationProvider(int cookieTimeout) {
		this.cookieTimeout = cookieTimeout;
	}

	public void saveLocale(String locale, HttpServletRequest request, HttpServletResponse response) {
		Cookie cookie = new Cookie("locale", locale);
		cookie.setMaxAge(cookieTimeout);
		response.addCookie(cookie);
	}

	public String getLocale(HttpServletRequest request) {
		Cookie[] cookies = request.getCookies();
		if (cookies == null) {
			throw new NullPointerException("cookies are disabled");
		}
		String locale = "";
		for (Cookie cookie : cookies) {
			if (cookie.getName().equals("locale")) {
				locale = cookie.getValue();
			}
		}

		return locale;
	}

}
