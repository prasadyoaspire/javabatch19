package com.cg.springcore2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.cg.springcore2.bean.Product;
import com.cg.springcore2.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productSerivce;

//	public void setProductSerivce(ProductService productSerivce) {
//		this.productSerivce = productSerivce;
//	}
	
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
