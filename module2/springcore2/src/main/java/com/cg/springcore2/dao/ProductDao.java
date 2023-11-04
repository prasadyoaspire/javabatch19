package com.cg.springcore2.dao;

import java.util.List;

import com.cg.springcore2.bean.Product;

public interface ProductDao {

	void save(Product product);
	
	Product findById(int productId);
	
	List<Product> findAll();
}
