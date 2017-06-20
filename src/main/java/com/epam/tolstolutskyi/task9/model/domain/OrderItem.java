package com.epam.tolstolutskyi.task9.model.domain;

public class OrderItem {
	private Good good;
	private int count;
	private double price;

	public OrderItem(Good good, int count, double price) {
		this.good = good;
		this.count = count;
		this.price = price;
	}

	public Good getGood() {
		return good;
	}

	public int getCount() {
		return count;
	}

	public double getPrice() {
		return price;
	}

}
