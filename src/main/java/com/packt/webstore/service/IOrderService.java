package com.packt.webstore.service;

public interface IOrderService {
	void processOrder(String productId, long quantity);
}
