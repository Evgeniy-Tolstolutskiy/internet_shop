package com.epam.tolstolutskyi.task9.servlet.bean;

import com.epam.tolstolutskyi.task9.validation.annotation.MinValueValidation;
import com.epam.tolstolutskyi.task9.validation.annotation.Pattern;

public class FilterBean {
	private String name;
	private String category;
	private String consumer;
	@Pattern(pattern = "\\d+(\\.\\d+)?")
	private String minPrice;
	@Pattern(pattern = "\\d+(\\.\\d+)?")
	private String maxPrice;
	@Pattern(pattern = "\\d+")
	@MinValueValidation(value = 1)
	private String pageNumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? "" : name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category == null ? "" : category;
	}

	public String getConsumer() {
		return consumer;
	}

	public void setConsumer(String consumer) {
		this.consumer = consumer == null ? "" : consumer;
	}

	public String getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(String minPrice) {
		this.minPrice = minPrice == null ? "0" : minPrice;
	}

	public String getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(String maxPrice) {
		this.maxPrice = maxPrice == null ? "0" : maxPrice;
	}

	public String getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber == null ? "1" : pageNumber;
	}

}
