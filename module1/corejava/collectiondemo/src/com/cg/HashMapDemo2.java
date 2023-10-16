package com.cg;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo2 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> map = new HashMap<>();
		map.put(new Integer(10), "Operators");
		map.put(30, "strings");
		map.put(55, "objects and classes");
		map.put(110, "exceptions");
		
		//get all keys from map
		Set<Integer> keys = map.keySet();
		
		for(Integer i: keys) {
			System.out.println(i);
		}
		
		//get all values from the map
		Collection<String> values = map.values();
		for(String s: values) {
			System.out.println(s);
		}
	}

}
