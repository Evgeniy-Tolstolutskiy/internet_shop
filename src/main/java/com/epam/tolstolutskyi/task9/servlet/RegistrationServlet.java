package com.epam.tolstolutskyi.task9.servlet;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.epam.tolstolutskyi.task9.captcha.Captcha;
import com.epam.tolstolutskyi.task9.captcha.provider.AbstractCaptchaProvider;
import com.epam.tolstolutskyi.task9.model.domain.User;
import com.epam.tolstolutskyi.task9.model.service.UserService;
import com.epam.tolstolutskyi.task9.servlet.bean.UserRegistrationBean;
import com.epam.tolstolutskyi.task9.utils.CaptchaUtil;
import com.epam.tolstolutskyi.task9.utils.Converters;
import com.epam.tolstolutskyi.task9.validation.Validator;

@WebServlet("/login")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final static Logger LOGGER = Logger.getLogger("MyLogger"); 
	private AbstractCaptchaProvider provider;
	private UserService userService;
	private File source;

	@Override
	public void init() throws ServletException {
		provider = Objects
				.requireNonNull((AbstractCaptchaProvider) getServletContext().getAttribute("captchaProvider"));
		userService = Objects.requireNonNull((UserService) getServletContext().getAttribute("userService"));
	}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String captchaText = CaptchaUtil.generateRandomString(4);
		String captchaId = UUID.randomUUID().toString();
		Captcha captcha = new Captcha(captchaId, captchaText, 0);
		provider.saveCaptchaInfo(captcha, request, response);
		request.getRequestDispatcher("WEB-INF/login.jsp").forward(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		UserRegistrationBean regBean = Converters.convertRequestToRegBean(request);
		String captchaToValidate = request.getParameter("captchaValue");
		Map<String, String> errors = Validator.validate(regBean);
		if (!errors.isEmpty() && provider.validateCaptcha(captchaToValidate, request)) {
			request.setAttribute("errorMessage", "Data is not correct!");
			request.getRequestDispatcher("WEB-INF/errorPage.jsp").forward(request, response);
			LOGGER.info("not a valid data from registration form");
			return;
		}
		User domainBean = Converters.convertRegBeanToDomainBean(regBean);
		if (userService.register(domainBean)) {
			System.out.println("user registered");
			String newImagePath = getServletContext().getRealPath("/WEB-INF/images/avatars/");
			int indexOfDotInEmail = domainBean.getEmail().lastIndexOf('.');
			File destination = new File(
					newImagePath + "/" + domainBean.getEmail().substring(0, indexOfDotInEmail) + ".jpg");
			createUserAvatar(source.toPath(), destination.toPath());
		} else {
			request.setAttribute("errorMessage", "User hav not been registered!");
			request.getRequestDispatcher("WEB-INF/errorPage.jsp").forward(request, response);
		}
	}

	private void createUserAvatar(Path source, Path destination) {
		try {
			Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			LOGGER.severe(e.getMessage());
		}
	}

}
