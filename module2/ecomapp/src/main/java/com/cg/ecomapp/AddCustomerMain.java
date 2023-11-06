package com.cg.ecomapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.ecomapp.controller.CustomerController;
import com.cg.ecomapp.dto.Customer;

public class AddCustomerMain {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("springcontext.xml");
		
		CustomerController cController = 
				(CustomerController) context.getBean("cController");
		
		Customer customer = new Customer();
		customer.setCustomerId(99999);
		customer.setCustomerName("Sachin");
		customer.setAge(30);
		customer.setEmail("sachin@tmail.com");
		customer.setMobile("9638527410");
		
		String value = cController.saveCutomer(customer);
		System.out.println(value);
		
		context.close();
		
	}

}
