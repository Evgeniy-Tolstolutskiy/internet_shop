package com.epam.tolstolutskyi.task9.model.dao.mysqldao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Logger;

import com.epam.tolstolutskyi.task9.model.dao.ShippingDAO;
import com.epam.tolstolutskyi.task9.model.domain.Shipping;

public class MySqlShippingDAO implements ShippingDAO {
	private final static Logger LOGGER = Logger.getLogger("MyLogger"); 

	@Override
	public void insert(Connection connection, Shipping shipping) {
		String query = "insert into shippings (type, address, orderid) values(?, ?, ?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(query);
			stmt.setString(1, shipping.getType());
			stmt.setString(2, shipping.getAddress());
			stmt.setInt(3, shipping.getOrderId());
			stmt.executeUpdate();
		} catch (SQLException e) {
			LOGGER.severe(e.getMessage());
		}
	}

}
