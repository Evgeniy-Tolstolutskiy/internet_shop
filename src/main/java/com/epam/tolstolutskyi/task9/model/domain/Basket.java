package com.epam.tolstolutskyi.task9.model.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Basket {
	private Map<Good, Integer> basket = new HashMap<>();

	public void add(Good good) {
		int count = 1;
		if (basket.containsKey(good)) {
			count = basket.get(good) + 1;
		}
		basket.put(good, count);
	}

	public void delete(Good good) {
		basket.put(good, basket.get(good) - 1);
		if (basket.get(good) == 0) {
			basket.remove(good);
		}
	}

	public List<Good> getGoodsInBasket() {
		List<Good> result = new ArrayList<>();
		result.addAll(basket.keySet());
		return result;
	}

	public int getGoodsCount() {
		int result = 0;
		for (Good good : basket.keySet()) {
			result += basket.get(good);
		}
		return result;
	}

	public double getSummaryPrice() {
		double result = 0;
		for (Good good : basket.keySet()) {
			result += good.getPrice() * basket.get(good);
		}
		return result;
	}

	public Map<Good, Integer> getBasket() {
		return basket;
	}
}
