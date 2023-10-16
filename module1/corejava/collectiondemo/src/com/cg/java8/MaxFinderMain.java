package com.cg.java8;

public class MaxFinderMain {

	public static void main(String[] args) {
		
		//option1 		
		MaxFinder maxFinder = new MaxFinderImpl();
		int max = maxFinder.maximum(25, 40);
		System.out.println("Max: "+max);
		
		//option2
		MaxFinder maxFinder2 = new MaxFinder() {
			@Override
			public int maximum(int a, int b) {
				int max = a > b ? a : b;
				return max;
			}			
		};
		
		int max2 = maxFinder2.maximum(25, 40);
		System.out.println("Max2: "+max2);
		
		//option2
//		MaxFinder maxFinder3 = (a,b) -> {
//			int max3 = a > b ? a : b;
//			return max3;
//		};
		
		MaxFinder maxFinder3 = (a,b) -> a > b ? a : b;			
		
		int max3 = maxFinder3.maximum(10, 2);
		System.out.println("Max3: "+max3);
	}

}
