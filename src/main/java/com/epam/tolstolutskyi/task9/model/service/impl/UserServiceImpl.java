package com.epam.tolstolutskyi.task9.model.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

import com.epam.tolstolutskyi.task9.model.dao.UserDAO;
import com.epam.tolstolutskyi.task9.model.domain.User;
import com.epam.tolstolutskyi.task9.model.service.UserService;
import com.epam.tolstolutskyi.task9.transaction.TransactionManager;
import com.epam.tolstolutskyi.task9.transaction.TransactionOperation;

public class UserServiceImpl implements UserService {
	private final static Logger LOGGER = Logger.getLogger("MyLogger"); 
	private UserDAO userDao;
	private TransactionManager manager;

	public UserServiceImpl(UserDAO userDao, TransactionManager manager) {
		this.userDao = userDao;
		this.manager = manager;
	}

	public synchronized boolean register(final User user) {
		return manager.doTransaction(new TransactionOperation<Boolean>() {
			public Boolean execute(Connection connection) {
				try {
					PreparedStatement stmt = connection
							.prepareStatement("select exists (select * from Users where Email = ?) as exist");
					stmt.setString(1, user.getEmail());
					ResultSet set = stmt.executeQuery();
					set.next();
					String result = set.getString("exist");
					if (result.equals("0")) {
						userDao.insertUser(connection, user);
						return true;
					}
				} catch (SQLException e) {
					LOGGER.severe(e.getMessage());
				}
				return false;
			}
		});
	}

	public User selectUserByLoginAndPassword(final String login, final String password) {
		return manager.doTransaction(new TransactionOperation<User>() {
			@Override
			public User execute(Connection connection) {
				return userDao.selectUserByLoginAndPassword(connection, login, password);
			}
		});
	}

}
