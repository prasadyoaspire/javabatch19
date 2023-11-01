package com.cg.jpademo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.jpademo.entity.Customer;

public class FindCustomerDemo {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		
		int customerId = 10001;
		
		Customer customer = em.find(Customer.class, customerId);
		
		if(customer!=null) {
			System.out.println("Name: "+customer.getCustomerName());
			System.out.println("Age: "+customer.getAge());
			System.out.println("Email: "+customer.getEmail());
			System.out.println("Mobile: "+customer.getMobile());			
		}
		else {
			System.out.println("Customer not existing");
		}
		
		em.close();
		emf.close();

	}

}
