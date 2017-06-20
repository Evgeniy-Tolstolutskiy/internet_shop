package com.epam.tolstolutskyi.task9.servlet.bean;

import java.util.Date;

import com.epam.tolstolutskyi.task9.validation.annotation.NotNull;
import com.epam.tolstolutskyi.task9.validation.annotation.Pattern;

public class PaymentBean {
	@NotNull
	private String type;
	private String cardType;
	private String cardNumber;
	@Pattern(pattern = "^(0[1-9]|1[012])[- /.](0[1-9]|[12][0-9]|3[01])[- /.](19|20)\\d\\d$")
	private Date expirationDate;
	@Pattern(pattern = "\\d\\d\\d")
	private String cvv;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

}
