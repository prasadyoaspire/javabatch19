package com.cg.ecomapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.ecomapp.dto.Customer;
import com.cg.ecomapp.util.JpaUtil;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	
	@PersistenceContext
	private EntityManager entityManager;

	public void save(Customer customer) {
		//EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
		//EntityManager em = emf.createEntityManager();		
		//em.getTransaction().begin();
		//em.persist(customer);
		//em.getTransaction().commit();
		
		entityManager.persist(customer);
	}

	public Customer findById(int customerId) {
//		EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
//		EntityManager em = emf.createEntityManager();	
//		Customer customer = em.find(Customer.class, customerId);		
//		return customer;
		
		Customer customer = entityManager.find(Customer.class, customerId);
		return customer;
	}

	public List<Customer> findAll() {
//		EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
//		EntityManager em = emf.createEntityManager();
		
		TypedQuery<Customer> query = 
				entityManager.createQuery("select c from Customer c",Customer.class);		
		List<Customer> customers = query.getResultList();
		return customers;
	}
}
