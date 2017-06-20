package com.epam.tolstolutskyi.task9.querybuilder;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.epam.tolstolutskyi.task9.querybuilder.operation.Operation;

public interface SqlQueryBuilder {
	SqlQueryBuilder selectFromTable(String tableName);

	SqlQueryBuilder where(String fieldName, Operation operation, Object[] parameters);

	SqlQueryBuilder limit(int from, int to);

	SqlQueryBuilder orderBy(String orderBy);

	PreparedStatement getResult(Connection connection);
}
