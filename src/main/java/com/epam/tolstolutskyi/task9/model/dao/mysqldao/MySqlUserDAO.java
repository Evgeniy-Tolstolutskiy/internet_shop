package com.epam.tolstolutskyi.task9.model.dao.mysqldao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

import com.epam.tolstolutskyi.task9.model.dao.UserDAO;
import com.epam.tolstolutskyi.task9.model.domain.User;
import com.epam.tolstolutskyi.task9.utils.Converters;

public class MySqlUserDAO implements UserDAO {
	private final static Logger LOGGER = Logger.getLogger("MyLogger"); 

	public void insertUser(Connection connection, User user) {
		try {
			String query = "insert into Users(Name, CompanyName, Email, Password, Address, Country, City, PhoneNumber) "
					+ "values(?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement stmt = connection.prepareStatement(query);
			stmt.setString(1, user.getName());
			stmt.setString(2, user.getCompanyName());
			stmt.setString(3, user.getEmail());
			stmt.setString(4, user.getPassword());
			stmt.setString(5, user.getAddress());
			stmt.setString(6, user.getCountry());
			stmt.setString(7, user.getCity());
			stmt.setString(8, user.getPhoneNumber());
			stmt.executeUpdate();
		} catch (SQLException e) {
			LOGGER.severe(e.getMessage());
		}
	}

	public void updateUser(Connection connection, User user) {

	}

	public void selectUser(Connection connection, String id) {

	}

	public void deleteUser(Connection connection, String id) {

	}

	public User selectUserByLoginAndPassword(Connection connection, String login, String password) {
		try {
			String query = "select * from Users where email=? and password=?";
			PreparedStatement stmt = connection.prepareStatement(query);
			stmt.setString(1, login);
			stmt.setString(2, password);
			ResultSet set = stmt.executeQuery();
			if (set.next()) {
				User user = Converters.convertResultSetToUser(set);
				return user;
			}
		} catch (SQLException e) {
			LOGGER.severe(e.getMessage());
		}
		return new User();
	}

}
