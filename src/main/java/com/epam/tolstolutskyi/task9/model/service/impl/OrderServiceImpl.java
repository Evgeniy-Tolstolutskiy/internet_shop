package com.epam.tolstolutskyi.task9.model.service.impl;

import java.sql.Connection;

import com.epam.tolstolutskyi.task9.model.dao.OrderDAO;
import com.epam.tolstolutskyi.task9.model.dao.OrderItemDAO;
import com.epam.tolstolutskyi.task9.model.dao.PaymentDAO;
import com.epam.tolstolutskyi.task9.model.dao.ShippingDAO;
import com.epam.tolstolutskyi.task9.model.domain.Order;
import com.epam.tolstolutskyi.task9.model.domain.OrderItem;
import com.epam.tolstolutskyi.task9.model.domain.Payment;
import com.epam.tolstolutskyi.task9.model.domain.Shipping;
import com.epam.tolstolutskyi.task9.model.service.OrderService;
import com.epam.tolstolutskyi.task9.transaction.TransactionManager;
import com.epam.tolstolutskyi.task9.transaction.TransactionOperation;

public class OrderServiceImpl implements OrderService {
	private OrderDAO orderDao;
	private OrderItemDAO orderItemDao;
	private PaymentDAO paymentDao;
	private ShippingDAO shippingDao;
	private TransactionManager manager;

	public OrderServiceImpl(OrderDAO orderDao, OrderItemDAO orderItemDao, PaymentDAO paymentDao,
			ShippingDAO shippingDao, TransactionManager manager) {
		this.orderDao = orderDao;
		this.orderItemDao = orderItemDao;
		this.paymentDao = paymentDao;
		this.shippingDao = shippingDao;
		this.manager = manager;
	}

	public boolean doOrder(final Order order, final Payment payment, final Shipping shipping) {
		return manager.doTransaction(new TransactionOperation<Boolean>() {
			@Override
			public Boolean execute(Connection connection) {
				orderDao.insert(connection, order);
				Order lastOrder = orderDao.selectLastInsertedOrder(connection);
				int orderId = lastOrder.getId();
				payment.setOrderId(orderId);
				shipping.setOrderId(orderId);
				for (OrderItem item : order.getOrderItems()) {
					orderItemDao.insert(connection, item, orderId);
				}
				paymentDao.insert(connection, payment);
				shippingDao.insert(connection, shipping);
				return true;
			}
		});
	}

}
