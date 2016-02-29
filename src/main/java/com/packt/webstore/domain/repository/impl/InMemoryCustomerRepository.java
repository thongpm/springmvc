package com.packt.webstore.domain.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.packt.webstore.domain.Customer;
import com.packt.webstore.domain.repository.ICustomerRepository;

@Repository
public class InMemoryCustomerRepository implements ICustomerRepository {

	List<Customer> listOfCustomer = new ArrayList<Customer>();

	public InMemoryCustomerRepository() {
		Customer theFirst = new Customer();
		theFirst.setName("Phan Minh Thong");
		theFirst.setAddress("315 Truong Chinh");
		theFirst.setCustomerId("00001");

		listOfCustomer.add(theFirst);
	}

	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return listOfCustomer;
	}

	public Customer getCustomerById(String customerId) {
		// TODO Auto-generated method stub
		Customer customerById = null;
		for (Customer customer : listOfCustomer) {
			if (customer != null && customer.getCustomerId() != null && customer.getCustomerId().equals(customerId)) {
				customerById = customer;
				break;
			}
		}
		if (customerById == null) {
			throw new IllegalArgumentException("No products found with the product id: " + customerId);
		}
		return customerById;
	}

}
