package com.epam.tolstolutskyi.task9.servlet;

import java.io.IOException;
import java.util.Objects;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.epam.tolstolutskyi.task9.model.domain.User;
import com.epam.tolstolutskyi.task9.model.service.UserService;

@WebServlet("/signin")
public class LogInServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService userService;

	@Override
	public void init() throws ServletException {
		userService = Objects.requireNonNull((UserService) getServletContext().getAttribute("userService"));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		User user = userService.selectUserByLoginAndPassword(login, password);
		if (user != null) {
			request.getSession().setAttribute("user", user);
		}
		String url = request.getHeader("referer");
		response.sendRedirect(url);
		return;
	}

}
