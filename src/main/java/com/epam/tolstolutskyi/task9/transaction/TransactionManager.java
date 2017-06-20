package com.epam.tolstolutskyi.task9.transaction;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Logger;

import javax.naming.Context;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class TransactionManager {
	private final static Logger LOGGER = Logger.getLogger("MyLogger"); 
	private DataSource ds;

	public void setDataSource(Context ctx) throws NamingException, ClassNotFoundException {
		ds = (DataSource) ctx.lookup("java:comp/env/jdbc/WebStore");
	}

	public <T> T doTransaction(TransactionOperation<T> transactionOperation) {
		Connection connection = null;
		try {
			connection = ds.getConnection();
			connection.setAutoCommit(false);
			T result = transactionOperation.execute(connection);
			connection.commit();
			return result;
		} catch (SQLException e) {
			rollbackTransaction(connection);
			LOGGER.severe(e.getMessage());
		} finally {
			if (connection != null) {
				closeConnection(connection);
			}
		}
		return null;
	}

	private void rollbackTransaction(Connection connection) {
		try {
			connection.rollback();
		} catch (SQLException e) {
			LOGGER.severe(e.getMessage());
		}
	}

	private void closeConnection(Connection connection) {
		try {
			connection.close();
		} catch (SQLException e) {
			LOGGER.severe(e.getMessage());
		}
	}
}
