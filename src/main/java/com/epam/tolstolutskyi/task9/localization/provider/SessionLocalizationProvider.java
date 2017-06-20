package com.epam.tolstolutskyi.task9.localization.provider;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SessionLocalizationProvider implements LocalizationProvider {

	public void saveLocale(String locale, HttpServletRequest request, HttpServletResponse response) {
		request.getSession().setAttribute("locale", locale);
	}

	public String getLocale(HttpServletRequest request) {
		return (String) request.getSession().getAttribute("locale");
	}

}
