package com.cg.ecom.main;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import com.cg.ecom.controller.ProductController;
import com.cg.ecom.dto.Product;

public class Main {

	public static void main(String[] args) {
		
		ProductController productController = new ProductController();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("****Available Products *****");
		List<Product> products = productController.fetchAllProducts();
		products.forEach(p->System.out.println(p.getProductId()+" "+p.getProductName()+" "+p.getProductPrice()));
		
		System.out.println("##############################");
		
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
		
		Product newProduct = new Product();
		newProduct.setProductId(pid);
		newProduct.setProductName(productName);
		newProduct.setProductPrice(productPrice);
		newProduct.setMfd(mfd);
		newProduct.setCategory(productCategory);
		
		productController.addNewProduct(newProduct);
		System.out.println("Product saved");
		
		System.out.println("#####################################");
		
		System.out.println("****Buy Product *****");
		
		
		System.out.println("Enter productId:");
		int productId = sc.nextInt();
		System.out.println("Enter product Quantity:");
		int productQty = sc.nextInt();
		
		
		
		String result = productController.buyProduct(productId, productQty);
		
		System.out.println(result);
	}

}
