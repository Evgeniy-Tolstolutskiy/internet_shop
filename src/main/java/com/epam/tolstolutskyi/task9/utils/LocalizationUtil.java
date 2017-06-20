package com.epam.tolstolutskyi.task9.utils;

import java.util.Locale;

public class LocalizationUtil {
	public static Locale convertStringToLocale(String localeName){
		return new Locale(localeName);
	}
}
