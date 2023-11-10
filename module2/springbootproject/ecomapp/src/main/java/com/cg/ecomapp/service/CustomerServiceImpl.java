package com.cg.ecomapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ecomapp.entity.Cart;
import com.cg.ecomapp.entity.Customer;
import com.cg.ecomapp.exception.CustomerNotFoundException;
import com.cg.ecomapp.exception.ResourceNotFoundException;
import com.cg.ecomapp.repository.CartRepository;
import com.cg.ecomapp.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private CartRepository cartRepository;

	@Override
	public void saveCustomer(Customer customer) {
		
		Cart cart = new Cart();
		//cart.setCartId(0);
		cart.setCartItems(null);
		cart.setCartTotal(0);
		cart.setCustomer(customer);	
		
		customerRepository.save(customer);
		
		customer.setCart(cart);
		cartRepository.save(cart);	
	}

	@Override
	public Customer getCustomerById(int customerId) throws CustomerNotFoundException  {
		Optional<Customer> optionalCustomer = customerRepository.findById(customerId);
		if(optionalCustomer.isEmpty()) {
			throw new ResourceNotFoundException("Customer not found with id: "+customerId);
		}
		return optionalCustomer.get();
	}

	@Override
	public List<Customer> getAllCustomers() {
		List<Customer> customers = customerRepository.findAll();
		return customers;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		
		Optional<Customer> optionalCustomer = customerRepository.findById(customer.getCustomerId());
		if(optionalCustomer.isEmpty()) {
			throw new ResourceNotFoundException("Customer not found with id: "+customer.getCustomerId());
		}		
		Customer updatedCustomer = customerRepository.save(customer);		
		return updatedCustomer;
	}

	@Override
	public void deleteCustomer(int customerId) {
		
		Optional<Customer> optionalCustomer = customerRepository.findById(customerId);
		if(optionalCustomer.isEmpty()) {
			throw new ResourceNotFoundException("Customer not found with id: "+customerId);
		}		
		Customer customer = optionalCustomer.get();		
		customerRepository.delete(customer);
		
	}

}
