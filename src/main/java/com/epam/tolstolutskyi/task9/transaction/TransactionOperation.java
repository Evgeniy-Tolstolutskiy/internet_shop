package com.epam.tolstolutskyi.task9.transaction;

import java.sql.Connection;

public interface TransactionOperation <T> {
	T execute(Connection connection);
}
