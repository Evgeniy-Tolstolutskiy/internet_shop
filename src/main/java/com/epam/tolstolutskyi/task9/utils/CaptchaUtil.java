package com.epam.tolstolutskyi.task9.utils;

import java.util.Random;


public class CaptchaUtil {
	public static String generateRandomString(int seed) {
		String result = "";
		Random rand = new Random();
		for (int i = 0; i < seed; i++) {
			result += rand.nextInt(9);
		}
		return result;
	}
}
