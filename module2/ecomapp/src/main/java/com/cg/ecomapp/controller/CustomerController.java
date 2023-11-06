package com.cg.ecomapp.controller;

import java.util.List;

import com.cg.ecomapp.dto.Customer;
import com.cg.ecomapp.service.CustomerService;
import com.cg.ecomapp.service.CustomerServiceImpl;

public class CustomerController {
	
	private CustomerService customerService;
	
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}	

	public String saveCutomer(Customer customer) {
		customerService.addCustomer(customer);
		return "Customer Added";			
	}
	
	public Customer findCustomerDetails(int customerId) {		
		Customer customer = customerService.getCustomerById(customerId);		
		return customer;		
	}
	
	public List<Customer> findAllCustomers() {
		List<Customer> customers = customerService.getAllCustomers();
		return customers;		
	}
}
