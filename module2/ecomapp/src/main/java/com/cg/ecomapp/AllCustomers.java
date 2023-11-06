package com.cg.ecomapp;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.ecomapp.controller.CustomerController;
import com.cg.ecomapp.dto.Customer;

public class AllCustomers {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("springcontext.xml");
		
		CustomerController cController = 
				(CustomerController) context.getBean("cController");
		
		List<Customer> customers = cController.findAllCustomers();
		
		customers.forEach(c->System.out.println(c.getCustomerId()+" "+c.getCustomerName()+" "+c.getAge()+" "+c.getEmail()+" "+c.getMobile()));

		context.close();
	}

}
