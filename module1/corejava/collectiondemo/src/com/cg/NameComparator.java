package com.cg;

import java.util.Comparator;

import com.cg.bean.Product;

public class NameComparator implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		int result = o1.getProductName().compareTo(o2.getProductName());
		return result;
	}

}
