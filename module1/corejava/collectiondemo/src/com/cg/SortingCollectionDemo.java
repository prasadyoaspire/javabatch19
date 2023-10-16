package com.cg;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.cg.bean.Product;

public class SortingCollectionDemo {

	public static void main(String[] args) {		

		Product p1 = new Product();
		p1.setProductId(30);
		p1.setProductName("IphoneX");
		p1.setProductPrice(98000);
		p1.setMfd(LocalDate.of(2022, 10, 10));
		p1.setCategory("Mobile");
		
		Product p2 = new Product();
		p2.setProductId(10);
		p2.setProductName("LenovoX");
		p2.setProductPrice(78000);
		p2.setMfd(LocalDate.of(2021, 10, 10));
		p2.setCategory("Laptop");
		
		Product p3 = new Product();
		p3.setProductId(20);
		p3.setProductName("Dell XP");
		p3.setProductPrice(128000);
		p3.setMfd(LocalDate.of(2021, 10, 10));
		p3.setCategory("Laptop");
		
			
//		List<Product> products = new ArrayList<>();
		
//		Set<Product> products = new HashSet<>();
		
		Set<Product> products = new TreeSet<>();
		
		products.add(p1);
		products.add(p2);
		products.add(p3);
		
		
		
		Iterator<Product> i = products.iterator();
		while(i.hasNext()) {
			Product product = i.next();
			System.out.println("ProductId: "+product.getProductId());
			System.out.println("Name: "+product.getProductName());
			System.out.println("Price: "+product.getProductPrice());
			System.out.println("MFD: "+product.getMfd());
			System.out.println("Category: "+product.getCategory());
			System.out.println("================================");
		}
		

	}

}
