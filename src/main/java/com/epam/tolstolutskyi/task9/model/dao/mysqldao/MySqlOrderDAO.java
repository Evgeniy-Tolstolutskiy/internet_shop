package com.epam.tolstolutskyi.task9.model.dao.mysqldao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

import com.epam.tolstolutskyi.task9.model.dao.OrderDAO;
import com.epam.tolstolutskyi.task9.model.domain.Order;
import com.epam.tolstolutskyi.task9.utils.Converters;

public class MySqlOrderDAO implements OrderDAO {
	private final static Logger LOGGER = Logger.getLogger("MyLogger"); 

	public void insert(Connection connection, Order order) {
		try {
			String query = "insert into orders (status, details, date, user_id) values(?, ?, ?, ?)";
			PreparedStatement stmt = connection.prepareStatement(query);
			stmt.setString(1, order.getStatus());
			stmt.setString(2, order.getDetails());
			stmt.setDate(3, new Date(order.getDate().getTime()));
			stmt.setInt(4, order.getUser().getId());
			stmt.executeUpdate();
		} catch (SQLException e) {
			LOGGER.severe(e.getMessage());
		}
	}

	public Order selectLastInsertedOrder(Connection connection) {
		String query = "select * from orders order by id desc limit 1";
		try {
			PreparedStatement stmt = connection.prepareStatement(query);
			ResultSet set = stmt.executeQuery();
			if (set.next()) {
				Order order = Converters.convertResultSetToOrder(set);
				return order;
			}
		} catch (SQLException e) {
			LOGGER.severe(e.getMessage());
		}
		return new Order();
	}

}
