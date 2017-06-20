package com.epam.tolstolutskyi.task9.captcha.provider;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.epam.tolstolutskyi.task9.captcha.Captcha;

public class HiddenFieldCaptchaProvider extends AbstractInMemoryCaptchaProvider {

	private static final String HIDDEN_FIELD = "hiddenField";
	private static final String HIDDEN_CAPTCHA_ID = "hiddenCaptchaId";

	public void saveCaptchaInfo(Captcha captcha, HttpServletRequest request,
			HttpServletResponse response) {
		removeOldCaptchas(request);
		
		request.setAttribute(HIDDEN_FIELD, true);
		request.setAttribute(HIDDEN_CAPTCHA_ID, captcha.getId());		
		captchas.put(captcha.getId(), captcha);
	}

	public Captcha getCaptcha(HttpServletRequest request) {
		String captchaId = request.getParameter(HIDDEN_CAPTCHA_ID);
		return captchas.get(captchaId);
	}
}
