package com.cg.ecomapp.service;

import com.cg.ecomapp.entity.Cart;
import com.cg.ecomapp.entity.Product;

public interface CartService {

	Cart addItemToCart(Cart cart, Product product, int quantity);
}
