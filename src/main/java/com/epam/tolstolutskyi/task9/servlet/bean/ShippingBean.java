package com.epam.tolstolutskyi.task9.servlet.bean;

import com.epam.tolstolutskyi.task9.validation.annotation.NotNull;

public class ShippingBean {
	@NotNull
	private String type;
	@NotNull
	private String address;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
