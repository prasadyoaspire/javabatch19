package com.cg.ecomapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.ecomapp.controller.CustomerController;
import com.cg.ecomapp.dto.Customer;

public class SearchCustomerMain {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("springcontext.xml");
		
		CustomerController cController = 
				(CustomerController) context.getBean("cController");
		
		int customerId = 10002;
		
		Customer customer = cController.findCustomerDetails(customerId);
		if(customer != null) {
			System.out.println("Id: "+customer.getCustomerId());
			System.out.println("Name: "+customer.getCustomerName());
			System.out.println("Age: "+customer.getAge());
			System.out.println("Email: "+customer.getEmail());
			System.out.println("Mobile: "+customer.getMobile());
		}
		else {
			System.out.println("customer not existing");
		}

		context.close();
	}
}
