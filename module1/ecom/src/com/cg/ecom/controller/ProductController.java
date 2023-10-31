package com.cg.ecom.controller;

import java.util.List;

import com.cg.ecom.dto.Product;
import com.cg.ecom.service.ProductServiceImpl;

public class ProductController {
	
	public void addNewProduct(Product product) {
		ProductServiceImpl productService = new ProductServiceImpl();
		productService.saveProduct(product);
	}

	public String buyProduct(int productId, int quantity) {
		
		ProductServiceImpl productService = new ProductServiceImpl();
		String msg = productService.generateBill(productId, quantity);
		return msg;
	}
	
	public List<Product> fetchAllProducts() {
		ProductServiceImpl productService = new ProductServiceImpl();
		List<Product> products = productService.getAllProducts();
		return products;
	}
}
