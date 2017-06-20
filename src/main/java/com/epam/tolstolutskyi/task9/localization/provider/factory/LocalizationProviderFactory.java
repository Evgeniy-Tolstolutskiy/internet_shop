package com.epam.tolstolutskyi.task9.localization.provider.factory;

import com.epam.tolstolutskyi.task9.localization.provider.CookiesLocalizationProvider;
import com.epam.tolstolutskyi.task9.localization.provider.LocalizationProvider;
import com.epam.tolstolutskyi.task9.localization.provider.SessionLocalizationProvider;

public class LocalizationProviderFactory {
	public static LocalizationProvider createProvider(String providerType, int cookieTimeout) {
		switch (providerType) {
		case "session":
			return new SessionLocalizationProvider();
		case "cookie":
			return new CookiesLocalizationProvider(cookieTimeout);
		default:
			throw new IllegalArgumentException("not correct parameter");
		}
	}
}
