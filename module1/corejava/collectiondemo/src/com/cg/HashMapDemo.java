package com.cg;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer,String> map = new HashMap<>();
		map.put(new Integer(10), "Operators");
		map.put(30, "strings");
		map.put(55, "objects and classes");
		map.put(110, "exceptions");
		map.put(30, "abc");
		map.put(null, null);
		map.put(40, null);
		map.put(null, "abc");
				
		System.out.println(map);
		
		int pageNo = 110;
		
		String topicName = map.get(pageNo);
		System.out.println("topic: "+topicName);
		
		
		
	}

}
