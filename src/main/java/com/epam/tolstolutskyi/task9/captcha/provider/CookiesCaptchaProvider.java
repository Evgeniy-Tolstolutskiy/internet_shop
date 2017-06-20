package com.epam.tolstolutskyi.task9.captcha.provider;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.epam.tolstolutskyi.task9.captcha.Captcha;

public class CookiesCaptchaProvider extends AbstractInMemoryCaptchaProvider {

	public void saveCaptchaInfo(Captcha captcha, HttpServletRequest request, HttpServletResponse response) {
		removeOldCaptchas(request);
		
		captchas.put(captcha.getId(), captcha);
		Cookie cookie = new Cookie("captchaId", captcha.getId());
		response.addCookie(cookie);
	}

	public Captcha getCaptcha(HttpServletRequest request) {

		Cookie[] cookies = request.getCookies();
		if (cookies == null) {
			throw new NullPointerException("cookies are disabled");
		}
		String captchaId = null;
		for (Cookie cookie : cookies) {
			if (cookie.getName().equals("captchaId")) {
				captchaId = cookie.getValue();
			}
		}

		return captchas.get(captchaId);
	}
}
