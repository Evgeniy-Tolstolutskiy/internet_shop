package com.epam.tolstolutskyi.task9.model.dao.mysqldao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Logger;

import com.epam.tolstolutskyi.task9.model.dao.OrderItemDAO;
import com.epam.tolstolutskyi.task9.model.domain.OrderItem;

public class MySqlOrderItemDAO implements OrderItemDAO {
	private final static Logger LOGGER = Logger.getLogger("MyLogger"); 

	@Override
	public void insert(Connection connection, OrderItem item, int orderId) {
		String query = "insert into orderitems (good_id, price, order_id) values(?, ?, ?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(query);
			stmt.setInt(1, item.getGood().getId());
			stmt.setDouble(2, item.getPrice());
			stmt.setInt(3, orderId);
			stmt.executeUpdate();
		} catch (SQLException e) {
			LOGGER.severe(e.getMessage());
		}
	}

}
