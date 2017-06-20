package com.epam.tolstolutskyi.task9.querybuilder.operation;

public class EqualsOperation implements Operation {

	public String getOperation() {
		return " = ?";
	}
	
}
