package com.cg.ecom.main;

import java.util.Scanner;

import com.cg.ecom.controller.ProductController;

public class BuyProductMain {

	public static void main(String[] args) {
		
		ProductController productController = new ProductController();
		Scanner sc = new Scanner(System.in);
				
		System.out.println("****Buy Product *****");		
		System.out.println("Enter productId:");
		int productId = sc.nextInt();
		System.out.println("Enter product Quantity:");
		int productQty = sc.nextInt();
		
		sc.close();
		
		String result = productController.buyProduct(productId, productQty);		
		System.out.println(result);
	}

}
