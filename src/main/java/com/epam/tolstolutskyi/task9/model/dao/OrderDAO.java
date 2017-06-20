package com.epam.tolstolutskyi.task9.model.dao;

import java.sql.Connection;

import com.epam.tolstolutskyi.task9.model.domain.Order;

public interface OrderDAO {
	Order selectLastInsertedOrder(Connection connection);
	
	void insert(Connection connection, Order order);
}
