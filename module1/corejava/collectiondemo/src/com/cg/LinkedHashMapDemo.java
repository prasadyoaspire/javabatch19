package com.cg;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer,String> map = new LinkedHashMap<>();
		map.put(new Integer(10), "Operators");
		map.put(30, "strings");
		map.put(55, "objects and classes");
		map.put(110, "exceptions");
				
		System.out.println(map);

	}

}
