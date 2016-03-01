package com.packt.webstore.domain.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.packt.webstore.domain.Customer;
import com.packt.webstore.domain.repository.ICustomerRepository;
import com.packt.webstore.service.ICustomerService;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	ICustomerRepository customerRepository;
	
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return customerRepository.getAllCustomers();
	}

}
