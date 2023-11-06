package com.cg.ecomapp.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
	
	public static EntityManagerFactory getEntityManagerFactory() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");		
		return emf;
	}
}
