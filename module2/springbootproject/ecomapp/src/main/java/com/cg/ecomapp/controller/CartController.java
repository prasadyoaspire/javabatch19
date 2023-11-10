package com.cg.ecomapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ecomapp.entity.Cart;
import com.cg.ecomapp.entity.Customer;
import com.cg.ecomapp.entity.Product;
import com.cg.ecomapp.payload.CartItemPayload;
import com.cg.ecomapp.service.CartService;
import com.cg.ecomapp.service.CustomerService;
import com.cg.ecomapp.service.ProductService;

@RestController
@RequestMapping("/cart")
public class CartController {
	
	@Autowired
	private CartService cartService;
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/addItem")
	public ResponseEntity<String> addItemToCart(@RequestBody CartItemPayload cartItemPayload) {
		
		Customer customer = customerService.getCustomerById(cartItemPayload.getCustomerId());
		Cart cart = customer.getCart();
		
		Product product = productService.findProductById(cartItemPayload.getProductId());
		
		int quantity = cartItemPayload.getQuantity();		
		
		cartService.addItemToCart(cart, product, quantity);
		
		return new ResponseEntity<>("Cart Item added.",HttpStatus.OK);
		
	}

}
