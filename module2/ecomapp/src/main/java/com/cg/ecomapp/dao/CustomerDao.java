package com.cg.ecomapp.dao;

import java.util.List;

import com.cg.ecomapp.dto.Customer;

public interface CustomerDao {

	void save(Customer customer);
	
	Customer findById(int customerId);
	
	List<Customer> findAll();
}
