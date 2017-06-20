package com.epam.tolstolutskyi.task9.model.dao;

import java.sql.Connection;

import com.epam.tolstolutskyi.task9.model.domain.Shipping;

public interface ShippingDAO {
	void insert(Connection connection, Shipping shipping);
}
