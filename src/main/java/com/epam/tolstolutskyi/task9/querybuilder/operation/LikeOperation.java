package com.epam.tolstolutskyi.task9.querybuilder.operation;

public class LikeOperation implements Operation {

	public String getOperation() {
		return " like ?";
	}

}
