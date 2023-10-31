package com.cg.ecom.main;

import java.time.LocalDate;
import java.util.Scanner;

import com.cg.ecom.controller.ProductController;
import com.cg.ecom.dto.Product;

public class SaveProductMain {

	public static void main(String[] args) {
		
		ProductController productController = new ProductController();
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("****Add New Product *****");
		
		System.out.println("Enter ProductId: ");
		int pid = sc.nextInt();
		System.out.println("Enter ProductName: ");
		String productName = sc.next();
		System.out.println("Enter ProductPrice: ");
		double productPrice = sc.nextDouble();
		System.out.println("Enter Manufacture Date:(yyyy-MM-dd) ");
		String sDate  = sc.next();		
		LocalDate mfd = LocalDate.parse(sDate);
		System.out.println("Enter ProductCategory: ");
		String productCategory = sc.next();
		
		sc.close();
		
		Product newProduct = new Product();
		newProduct.setProductId(pid);
		newProduct.setProductName(productName);
		newProduct.setProductPrice(productPrice);
		newProduct.setMfd(mfd);
		newProduct.setCategory(productCategory);
		
		productController.addNewProduct(newProduct);
		System.out.println("Product saved");
		
		System.out.println("#####################################");

	}

}
