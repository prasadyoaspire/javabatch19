package com.cg.ecomapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ecomapp.entity.Product;
import com.cg.ecomapp.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductContoller {

	@Autowired
	private ProductService productService;
	

	@PostMapping("/save")
	public ResponseEntity<String> addProduct(@RequestBody Product product) {
		productService.saveProduct(product);
		return new ResponseEntity<>("product added",HttpStatus.OK);
	}
	
	@GetMapping("/get/{productId}")
	public ResponseEntity<Product> productDetailsById(@PathVariable int productId) {
		Product product = productService.findProductById(productId);
		return new ResponseEntity<>(product,HttpStatus.OK);
	}
	
	@GetMapping("/category/{categoryName}")
	public ResponseEntity<List<Product>> productDetailsByCategory(@PathVariable String categoryName) {
		List<Product> products = productService.filterProductByCategory(categoryName);
		return new ResponseEntity<>(products,HttpStatus.OK);
	}
	
	@GetMapping("/filter/{priceLimit}")
	public ResponseEntity<List<Product>> productDetailsBelowPrice(@PathVariable double priceLimit) {
		List<Product> products = productService.filterProductsUnderPrice(priceLimit);
		return new ResponseEntity<>(products,HttpStatus.OK);
	}
	
	@GetMapping("/filter/range/{lowerPrice}/{upperPrice}")
	public ResponseEntity<List<Product>> productDetailsWithInPriceRange(@PathVariable double lowerPrice,@PathVariable double upperPrice) {
		List<Product> products = productService.filterProductsBetweenRange(lowerPrice, upperPrice);
		return new ResponseEntity<>(products,HttpStatus.OK);
	}
	
}
