package com.epam.tolstolutskyi.task9.servlet.bean;

import com.epam.tolstolutskyi.task9.validation.annotation.NotNull;
import com.epam.tolstolutskyi.task9.validation.annotation.Pattern;

public class UserRegistrationBean {

	@NotNull
	@Pattern(pattern = "[A-Z][a-z]{1,20}")
	private String name;

	@NotNull
	@Pattern(pattern = "[A-Z][a-z]{1,20}")
	private String companyName;

	@NotNull
	@Pattern(pattern = "\\w{1,20}@[a-z]+\\.(com|ua|ru)")
	private String email;

	@NotNull
	@Pattern(pattern = "\\w{12,}")
	private String password;
	
	@Pattern(pattern = "[A-Z][a-z]{1,20}")
	private String address;
	
	@NotNull
	@Pattern(pattern = "[A-Z]{2}")
	private String country;
	
	@Pattern(pattern = "[A-Z][a-z]{2,20}")
	private String city;
	
	@Pattern(pattern = "[0-9]+")
	private String numCode;
	
	@Pattern(pattern = "[0-9]+")
	private String phoneNumber;
	
	private String avatarPath;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getNumCode() {
		return numCode;
	}

	public void setNumCode(String numCode) {
		this.numCode = numCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAvatarPath() {
		return avatarPath;
	}

	public void setAvatarPath(String avatarPath) {
		this.avatarPath = avatarPath;
	}
}
