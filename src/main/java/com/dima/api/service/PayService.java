package com.dima.api.service;

import com.dima.api.bean.Order;
import com.dima.api.bean.PayResponse;

public interface PayService {

	PayResponse pay(Order order);
}
