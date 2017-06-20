package com.epam.tolstolutskyi.task9.captcha;

public class Captcha {
	private String id;
	private String text;
	private long expirationTime;
	
	public Captcha(String id, String text, long expirationTime) {
		this.id = id;
		this.text = text;
		this.expirationTime = expirationTime;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public long getExpirationTime() {
		return expirationTime;
	}

	public void setExpirationTime(long expirationTime) {
		this.expirationTime = expirationTime;
	}
}
