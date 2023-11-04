package com.cg.springcore2;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.springcore2.bean.Product;
import com.cg.springcore2.controller.ProductController;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = 
				new ClassPathXmlApplicationContext("appcontext.xml");

		ProductController pController = 
				(ProductController) context.getBean("pController");
		
		Product p1 = new Product();
		p1.setProductId(10);
		p1.setProductName("IPhoneX");
		p1.setProductPrice(50000);
		p1.setCategory("Mobile");
		
		Product p2 = new Product();
		p2.setProductId(20);
		p2.setProductName("IPhoneY");
		p2.setProductPrice(70000);
		p2.setCategory("Mobile");
		
		Product p3 = new Product();
		p3.setProductId(30);
		p3.setProductName("DellXP");
		p3.setProductPrice(150000);
		p3.setCategory("Laptop");
		
		String result1 = pController.saveProduct(p1);	
		System.out.println(result1);
		String result2 = pController.saveProduct(p2);
		System.out.println(result2);
		String result3 = pController.saveProduct(p3);
		System.out.println(result3);
		
		System.out.println("*** All Products ***");
		
		List<Product> products = pController.getAllProducts();
		
		products.forEach(p->System.out.println(p.getProductName()+" "+p.getProductPrice()+" "+p.getCategory()));

	}

}
