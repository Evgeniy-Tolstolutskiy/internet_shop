package com.epam.tolstolutskyi.task9.captcha.provider;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.epam.tolstolutskyi.task9.captcha.Captcha;

public abstract class AbstractInMemoryCaptchaProvider extends AbstractCaptchaProvider {
	protected Map<String, Captcha> captchas = new HashMap<>();

	public void deleteCaptchaInfo(String id) {
		captchas.remove(id);
	}
	
	protected void removeOldCaptchas(HttpServletRequest request) {
		long currentTime = System.currentTimeMillis();
		int timeout = Integer.valueOf(request.getSession().getServletContext().getAttribute("captchaTimeout").toString());
		for (Captcha captcha : captchas.values()) {
			if (currentTime - captcha.getExpirationTime() >= timeout) {
				deleteCaptchaInfo(captcha.getId());
			}
		}
	}

	public boolean validateCaptcha(String enteredCaptcha, HttpServletRequest request) {
		Captcha captcha = getCaptcha(request);
		String captchaText = captcha.getText();
		return captchaText.equals(enteredCaptcha);
	}
}
