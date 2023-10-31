package com.cg.ecom.service;

import java.util.List;

import com.cg.ecom.dao.ProductDaoImpl;
import com.cg.ecom.dto.Product;

public class ProductServiceImpl {
	
	public void saveProduct(Product product) {
		ProductDaoImpl productDao = new ProductDaoImpl();
		productDao.save(product);
	}
	
	public List<Product> getAllProducts() {
		ProductDaoImpl productDao = new ProductDaoImpl();
		List<Product> list = productDao.findAll();
		return list;
	}
	
	public String generateBill(int productId, int quantity) {		
		//find product details
		ProductDaoImpl productDao = new ProductDaoImpl();
		Product product = productDao.findById(productId);
		
		//if product is existing calculate bill
		if(product != null) {	
			
			//get price from product
			double price = product.getProductPrice();
			
			double total = price * quantity;
			
			double totalAmount = total + total*0.05;		
			
			return "Total bill amount :"+totalAmount;
		}		
		//if product not existing return some message
		else {
			return "Product not existing with id: "+productId;
		}		
	}
}
