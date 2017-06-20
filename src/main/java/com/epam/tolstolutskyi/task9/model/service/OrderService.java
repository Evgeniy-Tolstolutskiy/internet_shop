package com.epam.tolstolutskyi.task9.model.service;

import com.epam.tolstolutskyi.task9.model.domain.Order;
import com.epam.tolstolutskyi.task9.model.domain.Payment;
import com.epam.tolstolutskyi.task9.model.domain.Shipping;

public interface OrderService {
	boolean doOrder(Order order, Payment payment, Shipping shipping);
}
