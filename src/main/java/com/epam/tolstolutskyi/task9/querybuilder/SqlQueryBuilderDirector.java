package com.epam.tolstolutskyi.task9.querybuilder;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.epam.tolstolutskyi.task9.model.domain.GoodsFilter;
import com.epam.tolstolutskyi.task9.querybuilder.operation.BetweenOperation;
import com.epam.tolstolutskyi.task9.querybuilder.operation.LikeOperation;

public class SqlQueryBuilderDirector {

	public PreparedStatement getSqlQuery(GoodsFilter filter, Connection connection, int from, int countOfGoodsOnPage,
			String orderBy) throws SQLException {
		SqlQuery query = new SqlQuery();
		SqlQueryBuilder builder = new SqlQueryBuilderImpl(query);
		builder.selectFromTable("Goods").where("Name", new LikeOperation(), new Object[] { filter.getName() })
				.where("Category", new LikeOperation(), new Object[] { filter.getCategory() })
				.where("Consumer", new LikeOperation(), new Object[] { filter.getConsumer() })
				.where("Price", new BetweenOperation(), new Object[] { filter.getMinPrice(), filter.getMaxPrice() })
				.orderBy(orderBy)
				.limit(from, countOfGoodsOnPage);

		PreparedStatement stmt = builder.getResult(connection);
		int i = 0;
		for (Object parameter : query.getParams()) {
			stmt.setObject(++i, parameter);
		}
		return stmt;
	}
}
