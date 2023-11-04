package com.cg.springcore2.controller;

import java.util.List;

import com.cg.springcore2.bean.Product;
import com.cg.springcore2.service.ProductService;

public class ProductController {

	private ProductService productSerivce;

	public void setProductSerivce(ProductService productSerivce) {
		this.productSerivce = productSerivce;
	}
	
	public String saveProduct(Product product) {
		productSerivce.addProduct(product);
		return "Product Saved!";
	}
	
	public Product getProductDetails(int productId) {
		Product product = productSerivce.findProductById(productId);
		return product;
	}
	
	public List<Product> getAllProducts() {
		List<Product> products = productSerivce.findAllProducts();
		return products;
	}	
}
