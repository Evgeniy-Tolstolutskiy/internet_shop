package com.epam.tolstolutskyi.task9.querybuilder.operation;

public class BetweenOperation implements Operation {

	public String getOperation() {
		return " between ? and ?";
	}

}
