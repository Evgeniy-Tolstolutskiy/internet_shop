package com.epam.tolstolutskyi.task9.model.dao;

import java.sql.Connection;

import com.epam.tolstolutskyi.task9.model.domain.OrderItem;

public interface OrderItemDAO {
	void insert(Connection connection, OrderItem item, int orderId);
}
