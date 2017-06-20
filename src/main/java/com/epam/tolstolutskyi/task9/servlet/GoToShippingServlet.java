package com.epam.tolstolutskyi.task9.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.epam.tolstolutskyi.task9.model.domain.Payment;
import com.epam.tolstolutskyi.task9.servlet.bean.PaymentBean;
import com.epam.tolstolutskyi.task9.utils.Converters;
import com.epam.tolstolutskyi.task9.validation.Validator;

@WebServlet("/shipping")
public class GoToShippingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PaymentBean paymentBean = Converters.convertRequestToPaymentBean(request);

		if (!Validator.validate(paymentBean).isEmpty()) {
			request.setAttribute("errorMessage", "Data is not correct!");
			request.getRequestDispatcher("WEB-INF/errorPage.jsp").forward(request, response);
			return;
		}

		Payment payment = Converters.convertPaymentBeanToPaymentDomain(paymentBean);

		request.getSession().setAttribute("payment", payment);

		request.getRequestDispatcher("WEB-INF/shipping.jsp").forward(request, response);
	}

}
