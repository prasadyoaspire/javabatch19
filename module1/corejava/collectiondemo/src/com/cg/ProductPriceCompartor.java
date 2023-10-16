package com.cg;

import java.util.Comparator;

import com.cg.bean.Product;

public class ProductPriceCompartor implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		int result = (int) (o1.getProductPrice()-o2.getProductPrice());
		return result;
	}
	
}
