package com.epam.tolstolutskyi.task9.utils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import com.epam.tolstolutskyi.task9.model.domain.Good;
import com.epam.tolstolutskyi.task9.model.domain.GoodsFilter;
import com.epam.tolstolutskyi.task9.model.domain.Order;
import com.epam.tolstolutskyi.task9.model.domain.Payment;
import com.epam.tolstolutskyi.task9.model.domain.Shipping;
import com.epam.tolstolutskyi.task9.model.domain.User;
import com.epam.tolstolutskyi.task9.servlet.bean.FilterBean;
import com.epam.tolstolutskyi.task9.servlet.bean.PaymentBean;
import com.epam.tolstolutskyi.task9.servlet.bean.ShippingBean;
import com.epam.tolstolutskyi.task9.servlet.bean.UserRegistrationBean;

public class Converters {

	public static UserRegistrationBean convertRequestToRegBean(HttpServletRequest request) {
		UserRegistrationBean bean = new UserRegistrationBean();
		bean.setName(request.getParameter("name"));
		bean.setCompanyName(request.getParameter("companyName"));
		bean.setEmail(request.getParameter("email"));
		bean.setPassword(request.getParameter("password"));
		bean.setAddress(request.getParameter("address"));
		bean.setCountry(request.getParameter("country"));
		bean.setCity(request.getParameter("city"));
		bean.setNumCode(request.getParameter("numCode"));
		bean.setPhoneNumber(request.getParameter("phoneNumber"));
		bean.setAvatarPath(request.getParameter("image"));
		return bean;
	}

	public static User convertRegBeanToDomainBean(UserRegistrationBean regBean) {
		User bean = new User();
		bean.setName(regBean.getName());
		bean.setCompanyName(regBean.getCompanyName());
		bean.setEmail(regBean.getEmail());
		bean.setPassword(regBean.getPassword());
		bean.setAddress(regBean.getAddress());
		bean.setCountry(regBean.getCountry());
		bean.setCity(regBean.getCity());
		bean.setPhoneNumber(regBean.getNumCode() + regBean.getPhoneNumber());
		bean.setAvatarPath(regBean.getAvatarPath());
		return bean;
	}

	public static FilterBean convertRequestToFilterBean(HttpServletRequest request) {
		FilterBean filter = new FilterBean();
		filter.setName(request.getParameter("name"));
		filter.setCategory(request.getParameter("category"));
		filter.setConsumer(request.getParameter("consumer"));
		filter.setMinPrice(request.getParameter("minPrice"));
		filter.setMaxPrice(request.getParameter("maxPrice"));
		filter.setPageNumber(request.getParameter("pageNumber"));
		return filter;
	}

	public static GoodsFilter convertFilterBeanToDomainFilter(FilterBean bean) {
		GoodsFilter filter = new GoodsFilter();
		filter.setName(bean.getName());
		filter.setCategory(bean.getCategory());
		filter.setConsumer(bean.getConsumer());
		filter.setMinPrice(Double.valueOf(bean.getMinPrice()));
		filter.setMaxPrice(Double.valueOf(bean.getMaxPrice()));
		filter.setPageNumber(Integer.valueOf(bean.getPageNumber()));
		return filter;
	}

	public static Good convertResultSetToGood(ResultSet set) throws SQLException {
		Good good = new Good();
		good.setId(set.getInt("Id"));
		good.setName(set.getString("Name"));
		good.setCategory(set.getString("Category"));
		good.setConsumer(set.getString("Consumer"));
		good.setPrice(set.getDouble("Price"));
		good.setImagePath(set.getString("ImagePath"));
		return good;
	}

	public static User convertResultSetToUser(ResultSet set) throws SQLException {
		User user = new User();
		user.setId(set.getInt("id"));
		user.setName(set.getString("name"));
		user.setAddress(set.getString("address"));
		user.setAvatarPath(set.getString("avaterpath"));
		user.setCity(set.getString("city"));
		user.setCompanyName(set.getString("companyname"));
		user.setCountry(set.getString("country"));
		user.setEmail(set.getString("email"));
		user.setPassword(set.getString("password"));
		user.setPhoneNumber(set.getString("phonenumber"));
		return user;
	}

	@SuppressWarnings("deprecation")
	public static PaymentBean convertRequestToPaymentBean(HttpServletRequest request) {
		PaymentBean bean = new PaymentBean();
		bean.setType(request.getParameter("type").equals("") ? null : request.getParameter("type"));
		bean.setCardType(request.getParameter("cardType").equals("") ? null : request.getParameter("cardType"));
		bean.setCardNumber(request.getParameter("cardNumber").equals("") ? null : request.getParameter("cardNumber"));
		bean.setExpirationDate(request.getParameter("cardExpirationDate").equals("") ? null
				: new Date(request.getParameter("cardExpirationDate")));
		bean.setCvv(request.getParameter("cardCvv").equals("") ? null : request.getParameter("cardCvv"));
		return bean;
	}

	public static Payment convertPaymentBeanToPaymentDomain(PaymentBean bean) {
		Payment payment = new Payment();
		payment.setCardType(bean.getCardType());
		payment.setCardNumber(bean.getCardNumber());
		payment.setType(bean.getType());
		payment.setExpirationDate(bean.getExpirationDate());
		payment.setCvv(bean.getCvv());
		return payment;
	}

	public static ShippingBean convertRequestToShippingBean(HttpServletRequest request) {
		ShippingBean bean = new ShippingBean();
		bean.setType(request.getParameter("type"));
		bean.setAddress(request.getParameter("address"));
		return bean;
	}

	public static Shipping convertShippingBeanToShippingDomain(ShippingBean bean) {
		Shipping shipping = new Shipping();
		shipping.setAddress(bean.getAddress());
		shipping.setType(bean.getType());
		return shipping;
	}

	public static Order convertResultSetToOrder(ResultSet set) throws SQLException {
		Order order = new Order();
		order.setId(set.getInt("id"));
		order.setDate(set.getDate("date"));
		order.setStatus(set.getString("status"));
		order.setDetails(set.getString("details"));
		return order;
	}
}
