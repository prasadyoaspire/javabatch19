package com.cg.ecomapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.ecomapp.dao.CustomerDao;
import com.cg.ecomapp.dto.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDao customerDao;
	
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	
	@Transactional
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
