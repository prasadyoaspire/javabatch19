package com.cg.ecomapp.service;

import java.util.List;

import com.cg.ecomapp.entity.Product;

public interface ProductService {

	Product saveProduct(Product product);
	
	Product findProductById(int productId);
	
	List<Product> findAllProducts();
	
	
	Product findProductDetailsByName(String productName);
	
	List<Product> filterProductByCategory(String category);
	
	List<Product> filterProductsUnderPrice(double price);
	
	List<Product> filterProductsBetweenRange(double lowerPrice, double upperPrice);	
	
}
