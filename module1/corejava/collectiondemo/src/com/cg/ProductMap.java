package com.cg;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

import com.cg.bean.Product;

public class ProductMap {

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
		
			
		HashMap<Integer,Product> productMap = new HashMap<>();
		productMap.put(20, p3);
		productMap.put(10, p2);
		productMap.put(30, p1);
		
		System.out.println(productMap);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product id:");		
		int productId = sc.nextInt();
		
		Product product = productMap.get(productId);
		
		if(product!= null) {
			System.out.println("Product Name: "+product.getProductName());
			System.out.println("Product Price: "+product.getProductPrice());
			System.out.println("Product MFD: "+product.getMfd());
			System.out.println("Product Category: "+product.getCategory());
		}
		else {
			System.out.println("Product not existing with id: "+productId);
		}
	}

}
