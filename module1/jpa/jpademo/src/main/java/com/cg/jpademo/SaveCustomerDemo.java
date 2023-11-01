package com.cg.jpademo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.jpademo.entity.Customer;

public class SaveCustomerDemo {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer();
		customer1.setCustomerId(10001);
		customer1.setCustomerName("Rakesh");
		customer1.setAge(26);
		customer1.setEmail("rakesh@tmail.com");
		customer1.setMobile("9876543210");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(customer1);
		
		em.getTransaction().commit();
		
		System.out.println("Customer saved!");
		
		em.close();
		emf.close();

	}
}
