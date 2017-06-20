package com.epam.tolstolutskyi.task9.servlet.bean;

import com.epam.tolstolutskyi.task9.model.domain.Basket;
import com.epam.tolstolutskyi.task9.model.domain.Payment;
import com.epam.tolstolutskyi.task9.model.domain.Shipping;

public class OrderInfoBean {
	private Basket basket;
	private Payment payment;
	private Shipping shipping;

	public Basket getBasket() {
		return basket;
	}

	public void setBasket(Basket basket) {
		this.basket = basket;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Shipping getShipping() {
		return shipping;
	}

	public void setShipping(Shipping shipping) {
		this.shipping = shipping;
	}

}
