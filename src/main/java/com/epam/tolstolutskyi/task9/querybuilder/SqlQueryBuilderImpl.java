package com.epam.tolstolutskyi.task9.querybuilder;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Logger;

import com.epam.tolstolutskyi.task9.querybuilder.operation.Operation;

public class SqlQueryBuilderImpl implements SqlQueryBuilder {
	private final static Logger LOGGER = Logger.getLogger("MyLogger"); 
	private SqlQuery query;
	private String prefix = "where";

	public SqlQueryBuilderImpl(SqlQuery query) {
		this.query = query;
	}

	public SqlQueryBuilder selectFromTable(String tableName) {
		query.getQuery().append("select * from " + tableName);
		return this;
	}

	public SqlQueryBuilder where(String fieldName, Operation operation, Object[] parameters) {
		if (!parameters[0].equals("") && !parameters[0].equals(0.0)) {
			appendOperation(fieldName, operation, parameters);
		}
		return this;
	}

	public SqlQueryBuilder limit(int from, int countOfGoodsOnPage) {
		query.addParam(from);
		query.addParam(countOfGoodsOnPage);
		query.getQuery().append(" limit ?, ?");
		return this;
	}
	
	public SqlQueryBuilder orderBy(String orderBy) {
		query.getQuery().append(" order by " + orderBy);
		return this;
	}

	private void appendOperation(String fieldName, Operation operation, Object[] parameters) {
		for (Object parameter : parameters) {
			query.addParam(parameter);
		}
		query.getQuery().append(" " + prefix + " " + fieldName);
		query.getQuery().append(operation.getOperation());
		prefix = "and";
	}

	public PreparedStatement getResult(Connection connection) {
		try {
			PreparedStatement statement = connection.prepareStatement(query.getQuery().toString());
			return statement;
		} catch (SQLException e) {
			LOGGER.severe(e.getMessage());
		}
		return null;
	}
}
