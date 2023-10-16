package com.cg;

import java.util.Comparator;

import com.cg.bean.Product;

public class ProductIDComparator implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		int result = o1.getProductId()-o2.getProductId();
		return result;
	}

}
