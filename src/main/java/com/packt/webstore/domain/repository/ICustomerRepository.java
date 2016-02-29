package com.packt.webstore.domain.repository;

import java.util.List;
import com.packt.webstore.domain.Customer;
import com.packt.webstore.domain.Product;

public interface ICustomerRepository {
	List<Customer> getAllCustomers();
	public Customer getCustomerById(String customerId);
}
