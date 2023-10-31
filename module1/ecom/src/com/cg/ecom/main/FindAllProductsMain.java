package com.cg.ecom.main;

import java.util.List;

import com.cg.ecom.controller.ProductController;
import com.cg.ecom.dto.Product;

public class FindAllProductsMain {

	public static void main(String[] args) {
		
		ProductController productController = new ProductController();
		
		System.out.println("****Available Products *****");
		List<Product> products = productController.fetchAllProducts();
		products.forEach(p->System.out.println(p.getProductId()+" "+p.getProductName()+" "+p.getProductPrice()));
		
		System.out.println("##############################");

	}

}
