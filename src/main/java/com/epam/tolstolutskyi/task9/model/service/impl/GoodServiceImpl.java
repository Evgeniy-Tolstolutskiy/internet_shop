package com.epam.tolstolutskyi.task9.model.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.epam.tolstolutskyi.task9.model.dao.GoodDAO;
import com.epam.tolstolutskyi.task9.model.domain.Good;
import com.epam.tolstolutskyi.task9.model.domain.GoodsFilter;
import com.epam.tolstolutskyi.task9.model.service.GoodService;
import com.epam.tolstolutskyi.task9.querybuilder.SqlQueryBuilderDirector;
import com.epam.tolstolutskyi.task9.transaction.TransactionManager;
import com.epam.tolstolutskyi.task9.transaction.TransactionOperation;
import com.epam.tolstolutskyi.task9.utils.Converters;

public class GoodServiceImpl implements GoodService {
	private final static Logger LOGGER = Logger.getLogger("MyLogger"); 
	private GoodDAO goodDao;
	private TransactionManager manager;

	public GoodServiceImpl(GoodDAO goodDao, TransactionManager manager) {
		this.goodDao = goodDao;
		this.manager = manager;
	}

	public Good getGoodById(final String id) {
		return manager.doTransaction(new TransactionOperation<Good>() {
			public Good execute(Connection connection) {
				return goodDao.selectGood(connection, id);
			}
		});
	}

	public int getGoodsCount() {
		return manager.doTransaction(new TransactionOperation<Integer>() {
			public Integer execute(Connection connection) {
				try {
					PreparedStatement statement = connection.prepareStatement("select count(*) from Goods");
					ResultSet set = statement.executeQuery();
					set.next();
					return set.getInt(1);
				} catch (SQLException e) {
					LOGGER.severe(e.getMessage());
				}
				return 0;
			}
		});
	}

	public List<Good> doSelectQuery(final GoodsFilter filter, final SqlQueryBuilderDirector director, final int from,
			final int countOfGoodsOnPage, final String orderBy) {
		return manager.doTransaction(new TransactionOperation<List<Good>>() {
			public List<Good> execute(Connection connection) {
				try {
					PreparedStatement statement = director.getSqlQuery(filter, connection, from, countOfGoodsOnPage,
							orderBy);
					List<Good> result = new ArrayList<>();
					ResultSet set = statement.executeQuery();
					while (set.next()) {
						Good good = Converters.convertResultSetToGood(set);
						result.add(good);
					}
					return result;
				} catch (SQLException e) {
					e.printStackTrace();
				}
				return new ArrayList<>();
			}
		});
	}
}
