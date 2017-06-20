package com.epam.tolstolutskyi.task9.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/checkUser")
public class CheckUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		boolean loggedIn = request.getSession().getAttribute("user") != null;
		if (loggedIn) {
			request.getRequestDispatcher("WEB-INF/payment.jsp").forward(request, response);
			return;
		}
		request.setAttribute("errorMessage", "You are not logged in the system!");
		request.getRequestDispatcher("WEB-INF/errorPage.jsp").forward(request, response);
	}

}
