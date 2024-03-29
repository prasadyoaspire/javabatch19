package com.cg.springcore2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springcore2.bean.Product;
import com.cg.springcore2.dao.ProductDao;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDao productDao;
	
	/*
	 * public void setProductDao(ProductDao productDao) { this.productDao =
	 * productDao; }
	 */

	@Override
	public void addProduct(Product product) {		
		productDao.save(product);
	}

	@Override
	public Product findProductById(int productId) {		
		Product product = productDao.findById(productId);
		return product;
	}

	@Override
	public List<Product> findAllProducts() {
		List<Product> products = productDao.findAll();
		return products;
	}
}
