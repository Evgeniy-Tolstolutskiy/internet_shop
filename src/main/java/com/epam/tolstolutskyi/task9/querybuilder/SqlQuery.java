package com.epam.tolstolutskyi.task9.querybuilder;

import java.util.ArrayList;
import java.util.List;

public class SqlQuery {
	private StringBuilder query = new StringBuilder();
	private List<Object> params = new ArrayList<>();

	public void addParam(Object param) {
		params.add(param);
	}

	public List<Object> getParams() {
		return params;
	}

	public StringBuilder getQuery() {
		return query;
	}

}
