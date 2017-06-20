package com.epam.tolstolutskyi.task9.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.epam.tolstolutskyi.task9.model.domain.Basket;
import com.epam.tolstolutskyi.task9.model.domain.Good;
import com.epam.tolstolutskyi.task9.model.service.GoodService;

@WebServlet("/addToBasket")
public class AddToBasketServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private GoodService goodService;

	public void init() throws ServletException {
		goodService = (GoodService) getServletContext().getAttribute("goodService");
	}

	public AddToBasketServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Basket basket = (Basket) getServletContext().getAttribute("basket");
		String goodId = request.getParameter("goodId");
		Good good = goodService.getGoodById(goodId);
		basket.add(good);
		String url = request.getHeader("referer");
		response.sendRedirect(url);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
