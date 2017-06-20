package com.epam.tolstolutskyi.task9.model.service;

import java.util.List;

import com.epam.tolstolutskyi.task9.model.domain.Good;
import com.epam.tolstolutskyi.task9.model.domain.GoodsFilter;
import com.epam.tolstolutskyi.task9.querybuilder.SqlQueryBuilderDirector;

public interface GoodService {
	Good getGoodById(String id);

	int getGoodsCount();

	List<Good> doSelectQuery(final GoodsFilter filter, final SqlQueryBuilderDirector director, final int from,
			final int to, final String orderBy);
}
