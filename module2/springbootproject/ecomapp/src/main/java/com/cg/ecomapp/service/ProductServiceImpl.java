package com.cg.ecomapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ecomapp.entity.Product;
import com.cg.ecomapp.exception.ResourceNotFoundException;
import com.cg.ecomapp.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public Product saveProduct(Product product) {
		
		return productRepository.save(product);	
	
	}

	@Override
	public Product findProductById(int productId) {
		Optional<Product> optionalProduct = productRepository.findById(productId);
		if(optionalProduct.isEmpty()) {
			throw new ResourceNotFoundException("Product not found with id: "+productId);
		}
		return optionalProduct.get();
	}

	@Override
	public List<Product> findAllProducts() {
		
		return productRepository.findAll();
	}

	@Override
	public Product findProductDetailsByName(String productName) {		
		Optional<Product> optionalProduct = productRepository.findByProductName(productName);
		if(optionalProduct.isEmpty()) {
			throw new ResourceNotFoundException("Product not found with name: "+productName);
		}	
		return optionalProduct.get();
	}

	@Override
	public List<Product> filterProductByCategory(String category) {		
		List<Product> products = productRepository.findByCategory(category);
		if(products.size() == 0) {
			//throw exception
		}	
		return products;
	}

	@Override
	public List<Product> filterProductsUnderPrice(double price) {
		List<Product> products = productRepository.findProductsUnderPrice(price);
		if(products.size() == 0) {
			//throw exception
		}	
		return products;
	}

	@Override
	public List<Product> filterProductsBetweenRange(double lowerPrice, double upperPrice) {
		List<Product> products = productRepository.findProductsWithInPriceRange(lowerPrice, upperPrice);
		if(products.size() == 0) {
			//throw exception
		}	
		return products;
	}
}
