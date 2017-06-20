package com.epam.tolstolutskyi.task9.model.dao;

import java.sql.Connection;

import com.epam.tolstolutskyi.task9.model.domain.Good;

public interface GoodDAO {
	Good selectGood(Connection connection, String id);
}
