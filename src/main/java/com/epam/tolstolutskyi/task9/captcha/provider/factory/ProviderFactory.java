package com.epam.tolstolutskyi.task9.captcha.provider.factory;

import com.epam.tolstolutskyi.task9.captcha.provider.AbstractCaptchaProvider;
import com.epam.tolstolutskyi.task9.captcha.provider.CookiesCaptchaProvider;
import com.epam.tolstolutskyi.task9.captcha.provider.HiddenFieldCaptchaProvider;
import com.epam.tolstolutskyi.task9.captcha.provider.SessionCaptchaProvider;

public class ProviderFactory {
	public static AbstractCaptchaProvider createProvider(String captchaContaining) {
		switch (captchaContaining) {
		case "session":
			return new SessionCaptchaProvider();
		case "cookies":
			return new CookiesCaptchaProvider();
		case "hidden":
			return new HiddenFieldCaptchaProvider();
		default:
			throw new IllegalArgumentException("not correct parameter");
		}
	}
}
