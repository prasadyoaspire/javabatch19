package com.cg.ecomapp.service;

import java.util.List;

import com.cg.ecomapp.dto.Customer;

public interface CustomerService {

	void addCustomer(Customer customer);
	
	Customer getCustomerById(int customerId);
	
	List<Customer> getAllCustomers();
}
