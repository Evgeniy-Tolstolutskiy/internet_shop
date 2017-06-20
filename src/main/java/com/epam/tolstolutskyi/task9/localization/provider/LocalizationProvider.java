package com.epam.tolstolutskyi.task9.localization.provider;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface LocalizationProvider {
	void saveLocale(String locale, HttpServletRequest request, HttpServletResponse response);
	
	String getLocale(HttpServletRequest request);
}
