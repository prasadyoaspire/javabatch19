package com.cg.ecomapp.service;

import java.util.List;

import com.cg.ecomapp.dao.CustomerDao;
import com.cg.ecomapp.dto.Customer;


public class CustomerServiceImpl implements CustomerService {
	
	private CustomerDao customerDao;
	
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	
	public void addCustomer(Customer customer) {
		
		customerDao.save(customer);		
	}
	
	public Customer getCustomerById(int customerId) {
		//CustomerDaoImpl customerDao = new CustomerDaoImpl();
		Customer customer = customerDao.findById(customerId);		
		return customer;		
	}
	
	public List<Customer> getAllCustomers() {
		List<Customer> customerList = customerDao.findAll();
		return customerList;		
	}
}
