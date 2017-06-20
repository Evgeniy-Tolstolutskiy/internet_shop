package com.epam.tolstolutskyi.task9.model.dao.mysqldao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Logger;

import com.epam.tolstolutskyi.task9.model.dao.PaymentDAO;
import com.epam.tolstolutskyi.task9.model.domain.Payment;

public class MySqlPaymentDAO implements PaymentDAO {
	private final static Logger LOGGER = Logger.getLogger("MyLogger"); 

	@Override
	public void insert(Connection connection, Payment payment) {
		String query = "insert into payments (type, cardtype, cardnumber, expirationdate, cvv, orderid) values(?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(query);
			stmt.setString(1, payment.getType());
			stmt.setString(2, payment.getCardType());
			stmt.setString(3, payment.getCardNumber());
			stmt.setDate(4,
					payment.getExpirationDate() == null ? null : new Date(payment.getExpirationDate().getTime()));
			stmt.setString(5, payment.getCvv());
			stmt.setInt(6, payment.getOrderId());
			stmt.executeUpdate();
		} catch (SQLException e) {
			LOGGER.severe(e.getMessage());
		}
	}

}
