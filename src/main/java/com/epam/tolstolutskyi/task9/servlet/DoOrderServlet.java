package com.epam.tolstolutskyi.task9.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.epam.tolstolutskyi.task9.model.domain.Basket;
import com.epam.tolstolutskyi.task9.model.domain.Good;
import com.epam.tolstolutskyi.task9.model.domain.Order;
import com.epam.tolstolutskyi.task9.model.domain.OrderItem;
import com.epam.tolstolutskyi.task9.model.domain.Payment;
import com.epam.tolstolutskyi.task9.model.domain.Shipping;
import com.epam.tolstolutskyi.task9.model.domain.User;
import com.epam.tolstolutskyi.task9.model.service.OrderService;
import com.epam.tolstolutskyi.task9.servlet.bean.ShippingBean;
import com.epam.tolstolutskyi.task9.utils.Converters;
import com.epam.tolstolutskyi.task9.validation.Validator;

@WebServlet("/doOrder")
public class DoOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private OrderService orderService;

	@Override
	public void init() throws ServletException {
		orderService = (OrderService) getServletContext().getAttribute("orderService");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Basket basket = (Basket) getServletContext().getAttribute("basket");
		List<OrderItem> orderItems = new ArrayList<>();
		for (Good good : basket.getGoodsInBasket()) {
			orderItems.add(new OrderItem(good, basket.getBasket().get(good), good.getPrice()));
		}
		Order order = new Order();
		order.setDate(new Date(System.currentTimeMillis()));
		order.setOrderItems(orderItems);

		ShippingBean shippingBean = Converters.convertRequestToShippingBean(request);

		if (!Validator.validate(shippingBean).isEmpty()) {
			request.setAttribute("errorMessage", "Data is not correct!");
			request.getRequestDispatcher("WEB-INF/errorPage.jsp").forward(request, response);
			return;
		}

		Shipping shipping = Converters.convertShippingBeanToShippingDomain(shippingBean);

		Payment payment = (Payment) request.getSession().getAttribute("payment");

		User user = (User) request.getSession().getAttribute("user");
		order.setUser(user);

		if (orderService.doOrder(order, payment, shipping)) {
			response.sendRedirect("index.jsp");
			return;
		}

		request.setAttribute("errorMessage", "Order have not done!");
		request.getRequestDispatcher("WEB-INF/errorPage.jsp").forward(request, response);
	}
}
