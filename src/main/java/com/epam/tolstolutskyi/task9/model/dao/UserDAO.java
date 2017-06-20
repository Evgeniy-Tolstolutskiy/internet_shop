package com.epam.tolstolutskyi.task9.model.dao;

import java.sql.Connection;

import com.epam.tolstolutskyi.task9.model.domain.User;

public interface UserDAO {

	void insertUser(Connection connection, User user);

	void updateUser(Connection connection, User user);

	void selectUser(Connection connection, String id);

	void deleteUser(Connection connection, String id);
	
	User selectUserByLoginAndPassword(Connection connection, String login, String password);
}
