package com.cg.java8;

import java.util.function.Consumer;

public class MyConsumerMain {

	public static void main(String[] args) {
	
//		MyConsumerI myConsumer = (a)-> {
//			for(int i=0;i<a.length;i++) {
//				System.out.println(a[i]);
//			}
//		};
//		
//		myConsumer.dispaly(new int[] {10,20,30,40});
		
		
		Consumer<Integer[]> consumer = a-> {
			for(int i=0;i<a.length;i++) {
				System.out.println(a[i]);
			}
		};
		
		consumer.accept(new Integer[] {10,20,30,40});
		
		Consumer<String> consumer2 = a -> System.out.println("hello: "+a);
		consumer2.accept("How Are You?");
			
	}

}
