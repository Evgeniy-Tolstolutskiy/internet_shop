package com.epam.tolstolutskyi.task9.model.dao.mysqldao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

import com.epam.tolstolutskyi.task9.model.dao.GoodDAO;
import com.epam.tolstolutskyi.task9.model.domain.Good;
import com.epam.tolstolutskyi.task9.utils.Converters;

public class MySqlGoodDAO implements GoodDAO {
	private final static Logger LOGGER = Logger.getLogger("MyLogger"); 

	public Good selectGood(Connection connection, String id) {
		try {
			String query = "select * from Goods where Id=?";
			PreparedStatement stmt = connection.prepareStatement(query);
			stmt.setString(1, id);
			ResultSet set = stmt.executeQuery();
			if (set.next()) {
				Good good = Converters.convertResultSetToGood(set);
				return good;
			}
		} catch (SQLException e) {
			LOGGER.severe(e.getMessage());
		}
		return new Good();
	}

}
