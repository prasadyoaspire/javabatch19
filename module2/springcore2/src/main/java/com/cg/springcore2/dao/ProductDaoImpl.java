package com.cg.springcore2.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.springcore2.bean.Product;

@Repository
public class ProductDaoImpl implements ProductDao {
	
	private List<Product> list = new ArrayList<>();

	@Override
	public void save(Product product) {
		list.add(product);		
	}

	@Override
	public Product findById(int productId) {
		
		for(Product p : list) {
			if(p.getProductId()==productId) {
				return p;
			}
		}
		return null;
	}

	@Override
	public List<Product> findAll() {		
		return list;
	}	
}
