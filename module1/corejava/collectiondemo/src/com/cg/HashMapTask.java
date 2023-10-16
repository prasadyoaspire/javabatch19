package com.cg;

import java.util.HashMap;
import java.util.Map;

public class HashMapTask {
	
	public Map<Character,Integer> countChars(String st) {		
		char[] chary = st.toCharArray();		
		Map<Character,Integer> map = new HashMap<>();			
		for(Character c: chary) {
			if(map.containsKey(c)) {
				int val = map.get(c);
				map.put(c, val+1);
			}
			else {
				map.put(c,1);
			}			
		}
		return map;
	}

	public static void main(String[] args) {
		
		String str = "HelloWorld";
		
		HashMapTask task = new HashMapTask();		
		Map<Character,Integer> map = task.countChars(str);
		
		System.out.println(map);		
		
		
//		char[] chary = str.toCharArray();
//		
//		Map<Character,Integer> map = new HashMap<>();		
//		
//		for(Character c: chary) {
//			if(map.containsKey(c)) {
//				int val = map.get(c);
//				map.put(c, val+1);
//			}
//			else {
//				map.put(c,1);
//			}			
//		}		
//		System.out.println(map);
	}
}
