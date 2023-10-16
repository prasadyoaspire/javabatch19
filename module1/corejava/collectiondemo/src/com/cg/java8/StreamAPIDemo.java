package com.cg.java8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.cg.bean.Product;

public class StreamAPIDemo {

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
		
		List<Product> products = new ArrayList<>();
		products.add(p3);
		products.add(p2);
		products.add(p1);
		
		String inputCategory = "Laptop";
		
		products.stream()
		.filter(p->p.getCategory().equalsIgnoreCase(inputCategory))
		.forEach(p->System.out.println(p.getProductName()+" "+p.getProductPrice()+" "+p.getCategory()));
		
		//collect all laptops and store inside another list
		List<Product> laptopList = products.stream()
		.filter(p->p.getCategory().equals("Laptop")).collect(Collectors.toList());

		//collect all the product names ans store inside another list
		List<String> namesList = products.stream()
		.map(p->p.getProductName())
		.collect(Collectors.toList());
		
		//sum of all the product prices
		double sumOfAllPrices = products.stream()
				.map(p->p.getProductPrice())
				.reduce((a,b)->a+b).get();
		
		
	}

}
