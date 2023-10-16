package com.cg;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.cg.bean.Product;

public class SortingUsingComparatorDemo {

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
		products.add(p1);
		products.add(p2);
		products.add(p3);
		
		//Collections.sort(products);
		
		Iterator<Product> i = products.iterator();
		while(i.hasNext()) {
			Product p = i.next();
			System.out.println(p.getProductId()+" "+p.getProductName()+" "+p.getProductPrice()+" "+p.getCategory()+" "+p.getMfd());
		}
		
		System.out.println("*** Sort By Price ***");
		
//		ProductPriceCompartor priceComparator = new ProductPriceCompartor();
//		Collections.sort(products,priceComparator);
		
		Collections.sort(products,new ProductPriceCompartor());
		
		Iterator<Product> i2 = products.iterator();
		while(i2.hasNext()) {
			Product p = i2.next();
			System.out.println(p.getProductId()+" "+p.getProductName()+" "+p.getProductPrice()+" "+p.getCategory()+" "+p.getMfd());
		}
		
		System.out.println("*** Sort By Name ***");
		
//		NameComparator nameComparator = new NameComparator();
//		Collections.sort(products,nameComparator);
		
		Collections.sort(products,new NameComparator());
		
		Iterator<Product> i3 = products.iterator();
		while(i3.hasNext()) {
			Product p = i3.next();
			System.out.println(p.getProductId()+" "+p.getProductName()+" "+p.getProductPrice()+" "+p.getCategory()+" "+p.getMfd());
		}
	}

}
