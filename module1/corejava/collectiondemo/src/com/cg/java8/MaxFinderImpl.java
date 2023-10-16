package com.cg.java8;

public class MaxFinderImpl implements MaxFinder {

	@Override
	public int maximum(int a, int b) {
		int max = a > b ? a :b ;
		return max;
	}

}
