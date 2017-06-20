package com.epam.tolstolutskyi.task9.captcha.provider;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.epam.tolstolutskyi.task9.captcha.Captcha;

public abstract class AbstractCaptchaProvider {
	public abstract void saveCaptchaInfo(Captcha captcha, HttpServletRequest request, HttpServletResponse response);

	public abstract Captcha getCaptcha(HttpServletRequest request);

	public abstract boolean validateCaptcha(String enteredCaptcha, HttpServletRequest request);
}
