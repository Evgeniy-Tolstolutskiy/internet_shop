package com.epam.tolstolutskyi.task9.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.epam.tolstolutskyi.task9.model.domain.Good;
import com.epam.tolstolutskyi.task9.model.domain.GoodsFilter;
import com.epam.tolstolutskyi.task9.model.service.GoodService;
import com.epam.tolstolutskyi.task9.querybuilder.SqlQueryBuilderDirector;
import com.epam.tolstolutskyi.task9.servlet.bean.FilterBean;
import com.epam.tolstolutskyi.task9.utils.Converters;
import com.epam.tolstolutskyi.task9.validation.Validator;

@WebServlet("/GoodsPageServlet")
public class GoodsPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private GoodService service;

	public void init() throws ServletException {
		service = (GoodService) getServletContext().getAttribute("goodService");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		FilterBean filterBean = Converters.convertRequestToFilterBean(request);
		if (!Validator.validate(filterBean).isEmpty()) {
			request.setAttribute("errorMessage", "Filters are not correct!");
			request.getRequestDispatcher("WEB-INF/errorPage.jsp").forward(request, response);
			return;
		}
		request.setAttribute("name", filterBean.getName());
		request.setAttribute("category", filterBean.getCategory());
		request.setAttribute("consumer", filterBean.getConsumer());
		request.setAttribute("minPrice", filterBean.getMinPrice());
		request.setAttribute("maxPrice", filterBean.getMaxPrice());
		request.setAttribute("pageNumber", filterBean.getPageNumber());

		GoodsFilter filter = Converters.convertFilterBeanToDomainFilter(filterBean);

		String countOnPage = request.getParameter("countOnPage");

		int countOfGoodsOnPage = countOnPage == null ? 4 : Integer.valueOf(countOnPage);
		request.setAttribute("countOnPage", countOfGoodsOnPage);

		int countOfPages = (int) ((service.getGoodsCount() / countOfGoodsOnPage) + 0.5);
		request.setAttribute("countOfPages", countOfPages);

		String url = "name=" + filterBean.getName() + "&category=" + filterBean.getCategory() + "&consumer="
				+ filterBean.getConsumer() + "&minPrice=" + filterBean.getMinPrice() + "&maxPrice="
				+ filterBean.getMaxPrice() + "&countOnPage=" + countOfGoodsOnPage;
		request.setAttribute("url", url);

		int from = (filter.getPageNumber() - 1) * countOfGoodsOnPage;

		String orderBy = request.getParameter("orderBy") == null ? "Id asc" : request.getParameter("orderBy");
		request.setAttribute("orderBy", orderBy);

		SqlQueryBuilderDirector director = new SqlQueryBuilderDirector();
		List<Good> goods = service.doSelectQuery(filter, director, from, countOfGoodsOnPage, orderBy);
		request.setAttribute("goods", goods);
		request.getRequestDispatcher("WEB-INF/products.jsp").forward(request, response);
	}

}
