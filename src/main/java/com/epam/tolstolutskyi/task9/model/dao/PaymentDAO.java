package com.epam.tolstolutskyi.task9.model.dao;

import java.sql.Connection;

import com.epam.tolstolutskyi.task9.model.domain.Payment;

public interface PaymentDAO {
	void insert(Connection connection, Payment payment);
}
