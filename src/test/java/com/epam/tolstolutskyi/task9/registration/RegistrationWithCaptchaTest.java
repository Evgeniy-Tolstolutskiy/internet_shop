package com.epam.tolstolutskyi.task9.registration;

import static org.junit.Assert.*;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspException;

import org.junit.Test;
import org.mockito.Mockito;

import com.epam.tolstolutskyi.task9.captcha.Captcha;
import com.epam.tolstolutskyi.task9.captcha.provider.AbstractCaptchaProvider;
import com.epam.tolstolutskyi.task9.captcha.provider.CookiesCaptchaProvider;
import com.epam.tolstolutskyi.task9.captcha.provider.HiddenFieldCaptchaProvider;
import com.epam.tolstolutskyi.task9.captcha.provider.SessionCaptchaProvider;
import com.epam.tolstolutskyi.task9.model.service.UserService;
import com.epam.tolstolutskyi.task9.servlet.CaptchaServlet;
import com.epam.tolstolutskyi.task9.servlet.RegistrationServlet;

public class RegistrationWithCaptchaTest extends Mockito {

	private HttpServletRequest request = mock(HttpServletRequest.class);
	private HttpServletResponse response = mock(HttpServletResponse.class);
	private CaptchaServlet captchaServlet = mock(CaptchaServlet.class);
	private AbstractCaptchaProvider provider;
	private RegistrationServlet reg = mock(RegistrationServlet.class);
	private UserService service = mock(UserService.class);
	private ServletOutputStream output = mock(ServletOutputStream.class);
	private HttpSession session = mock(HttpSession.class);
	private ServletContext context = mock(ServletContext.class);
	private RequestDispatcher dispatcher = mock(RequestDispatcher.class);
	private Captcha captcha = new Captcha("12345", "1234", 50);
	
	public void init(AbstractCaptchaProvider concreteProvider) throws IOException, ServletException {
		
		
		provider = concreteProvider;
		doCallRealMethod().when(captchaServlet).init();
		doCallRealMethod().when(captchaServlet).createImage("1234");
		doCallRealMethod().when(captchaServlet).doGet(request, response);
		when(captchaServlet.getServletContext()).thenReturn(context);
		when(context.getAttribute("captchaProvider")).thenReturn(provider);
		when(request.getParameter("captchaId")).thenReturn(null);
		doNothing().when(response).setContentType("image/png");
		when(response.getOutputStream()).thenReturn(output);
		when(request.getSession()).thenReturn(session);
		when(session.getServletContext()).thenReturn(context);
		when(session.getAttribute("captcha")).thenReturn(captcha);
		when(context.getAttribute("captchaTimeout")).thenReturn(0);
		
		doCallRealMethod().when(reg).init();
		doCallRealMethod().when(reg).doGet(request, response);
		when(reg.getServletContext()).thenReturn(context);
		when(context.getAttribute("userService")).thenReturn(service);
		when(request.getRequestDispatcher("WEB-INF/login.jsp")).thenReturn(dispatcher);
		doNothing().when(dispatcher).forward(request, response);
		
		Cookie[] cookies = new Cookie[1];
		Cookie fakeCookie = new Cookie("captchaId", "12345");
		cookies[0] = fakeCookie;
		when(request.getCookies()).thenReturn(cookies);
		
		when(request.getParameter("hiddenCaptchaId")).thenReturn("12345");
	}

	@Test
	public void testRegistrationWithSessionCaptchaProvider() throws JspException, IOException, ServletException {
		
		init(new SessionCaptchaProvider());
		
		reg.init();
		reg.doGet(request, response);
		
		captchaServlet.init();
		captchaServlet.doGet(request, response);
		
		reg.doPost(request, response);
		
		assertEquals(true, provider.validateCaptcha("1234", request));
	}
	
	@Test
	public void testRegistrationWithCookiesCaptchaProvider() throws JspException, IOException, ServletException {
		
		init(new CookiesCaptchaProvider());
		
		reg.init();
		reg.doGet(request, response);
		
		provider.saveCaptchaInfo(captcha, request, response);
		
		captchaServlet.init();
		captchaServlet.doGet(request, response);
		
		reg.doPost(request, response);

		assertEquals(true, provider.validateCaptcha("1234", request));
	}
	
	@Test
	public void testRegistrationWithHiddenCaptchaProvider() throws JspException, IOException, ServletException {
		
		init(new HiddenFieldCaptchaProvider());
		
		reg.init();
		reg.doGet(request, response);
		
		provider.saveCaptchaInfo(captcha, request, response);
		
		captchaServlet.init();
		captchaServlet.doGet(request, response);

		assertEquals(true, provider.validateCaptcha("1234", request));
	}

}
