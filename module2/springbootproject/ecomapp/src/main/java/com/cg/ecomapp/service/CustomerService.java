package com.cg.ecomapp.service;

import java.util.List;

import com.cg.ecomapp.entity.Customer;

public interface CustomerService {

	void saveCustomer(Customer customer);
	
	Customer getCustomerById(int customerId);
	
	List<Customer> getAllCustomers();	
	
	Customer updateCustomer(Customer customer);
	
	void deleteCustomer(int customerId);
	
}
