package com.cg.ecomapp.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ecomapp.entity.Cart;
import com.cg.ecomapp.entity.CartItem;
import com.cg.ecomapp.entity.Product;
import com.cg.ecomapp.repository.CartItemsRepository;
import com.cg.ecomapp.repository.CartRepository;
import com.cg.ecomapp.repository.ProductRepository;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private CartRepository cartRepository;

	@Autowired
	private CartItemsRepository cartItemsRepository;

	@Autowired
	private ProductRepository productRepository;

	@Override
	public Cart addItemToCart(Cart cart, Product product, int quantity) {

		CartItem cartItem = new CartItem();
		cartItem.setCartItemId(1);
		cartItem.setProduct(product);
		cartItem.setQuantity(quantity);
		
		double itemTotal = product.getProductPrice()*quantity;
		cartItem.setItemTotal(itemTotal);

		cartItem.setCart(cart);

		cartItemsRepository.save(cartItem);
		
		//todo : update cart table total_amount

		return cart;
	}

}
