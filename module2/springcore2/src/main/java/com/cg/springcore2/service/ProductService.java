package com.cg.springcore2.service;

import java.util.List;

import com.cg.springcore2.bean.Product;

public interface ProductService {

	void addProduct(Product product);
	
	Product findProductById(int productId);
	
	List<Product> findAllProducts();
}
