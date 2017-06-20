package com.epam.tolstolutskyi.task9.listener;

import java.util.logging.Logger;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.epam.tolstolutskyi.task9.captcha.provider.AbstractCaptchaProvider;
import com.epam.tolstolutskyi.task9.captcha.provider.factory.ProviderFactory;
import com.epam.tolstolutskyi.task9.localization.provider.LocalizationProvider;
import com.epam.tolstolutskyi.task9.localization.provider.factory.LocalizationProviderFactory;
import com.epam.tolstolutskyi.task9.model.dao.GoodDAO;
import com.epam.tolstolutskyi.task9.model.dao.UserDAO;
import com.epam.tolstolutskyi.task9.model.dao.mysqldao.MySqlGoodDAO;
import com.epam.tolstolutskyi.task9.model.dao.mysqldao.MySqlOrderDAO;
import com.epam.tolstolutskyi.task9.model.dao.mysqldao.MySqlOrderItemDAO;
import com.epam.tolstolutskyi.task9.model.dao.mysqldao.MySqlPaymentDAO;
import com.epam.tolstolutskyi.task9.model.dao.mysqldao.MySqlShippingDAO;
import com.epam.tolstolutskyi.task9.model.dao.mysqldao.MySqlUserDAO;
import com.epam.tolstolutskyi.task9.model.domain.Basket;
import com.epam.tolstolutskyi.task9.model.service.GoodService;
import com.epam.tolstolutskyi.task9.model.service.OrderService;
import com.epam.tolstolutskyi.task9.model.service.UserService;
import com.epam.tolstolutskyi.task9.model.service.impl.GoodServiceImpl;
import com.epam.tolstolutskyi.task9.model.service.impl.OrderServiceImpl;
import com.epam.tolstolutskyi.task9.model.service.impl.UserServiceImpl;
import com.epam.tolstolutskyi.task9.transaction.TransactionManager;

@WebListener
public class InitAppListener implements ServletContextListener {
	private final static Logger LOGGER = Logger.getLogger("MyLogger"); 

	public void contextDestroyed(ServletContextEvent arg0) {

	}

	public void attributeReplaced(ServletContextAttributeEvent arg0) {

	}

	public void contextInitialized(ServletContextEvent servletContextEvent) {
		TransactionManager manager = new TransactionManager();
		Context ctx = null;
		try {
			ctx = new InitialContext();
			manager.setDataSource(ctx);
		} catch (NamingException e) {
			LOGGER.severe(e.getMessage());
		} catch (ClassNotFoundException e) {
			LOGGER.severe(e.getMessage());
		}

		UserDAO userDao = new MySqlUserDAO();
		UserService service = new UserServiceImpl(userDao, manager);
		servletContextEvent.getServletContext().setAttribute("userService", service);

		OrderService orderService = new OrderServiceImpl(new MySqlOrderDAO(), new MySqlOrderItemDAO(),
				new MySqlPaymentDAO(), new MySqlShippingDAO(), manager);
		servletContextEvent.getServletContext().setAttribute("orderService", orderService);

		GoodDAO goodDao = new MySqlGoodDAO();
		GoodService goodService = new GoodServiceImpl(goodDao, manager);
		servletContextEvent.getServletContext().setAttribute("goodService", goodService);

		String captchaContaining = servletContextEvent.getServletContext().getInitParameter("captchaContaining");
		AbstractCaptchaProvider provider = ProviderFactory.createProvider(captchaContaining);
		servletContextEvent.getServletContext().setAttribute("captchaProvider", provider);
		
		String cookieTimeout = servletContextEvent.getServletContext().getInitParameter("cookieTimeout");
		
		String localizationContaining = servletContextEvent.getServletContext().getInitParameter("localizationProvider");
		LocalizationProvider localizationProvider = LocalizationProviderFactory.createProvider(localizationContaining, Integer.valueOf(cookieTimeout));
		servletContextEvent.getServletContext().setAttribute("localizationProvider", localizationProvider);

		String captchaTimeout = servletContextEvent.getServletContext().getInitParameter("captchaTimeout");
		servletContextEvent.getServletContext().setAttribute("captchaTimeout", captchaTimeout);

		Basket basket = new Basket();
		servletContextEvent.getServletContext().setAttribute("basket", basket);

	}

}
