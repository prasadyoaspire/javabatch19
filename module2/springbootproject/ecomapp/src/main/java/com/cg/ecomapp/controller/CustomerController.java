package com.cg.ecomapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ecomapp.entity.Customer;
import com.cg.ecomapp.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/all")
	public List<Customer> fetchAllCustomers() {		
		List<Customer> customers = customerService.getAllCustomers();
		return customers;
	}
	
	@PostMapping("/save")
	public ResponseEntity<String> addCustomer(@RequestBody Customer customer) {
		customerService.saveCustomer(customer);
		ResponseEntity<String> responseEntity = new ResponseEntity<>("New Customer Added",HttpStatus.CREATED);
		return responseEntity;
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Customer> fetchCustomerDetails(@PathVariable("id") int customerId) {
		Customer customer = customerService.getCustomerById(customerId);		
		ResponseEntity<Customer> responseEntity = new ResponseEntity<>(customer,HttpStatus.OK);
		return responseEntity;
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteCustomer(@PathVariable("id") int customerId) {
		customerService.deleteCustomer(customerId);
		return new ResponseEntity<>("Customer Deleted.",HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Customer> modifyCustomer(@RequestBody Customer customer) {
		Customer updatedCustomer = customerService.updateCustomer(customer);
		ResponseEntity<Customer> responseEntity = new ResponseEntity<>(updatedCustomer,HttpStatus.OK);
		return responseEntity;
	}	
}
