package com.epam.tolstolutskyi.task9.captcha.provider;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.epam.tolstolutskyi.task9.captcha.Captcha;

public class SessionCaptchaProvider extends AbstractCaptchaProvider {

	private static final String CAPTCHA = "captcha";

	public void saveCaptchaInfo(Captcha captcha, HttpServletRequest request, HttpServletResponse response) {
		request.getSession().setAttribute(CAPTCHA, captcha);
	}

	public Captcha getCaptcha(HttpServletRequest request) {
		return (Captcha) request.getSession().getAttribute(CAPTCHA);
	}

	public boolean validateCaptcha(String enteredCaptcha, HttpServletRequest request) {
		Captcha captcha = (Captcha) request.getSession().getAttribute(CAPTCHA);
		String captchaText = captcha.getText();
		return captchaText.equals(enteredCaptcha);
	}

}
