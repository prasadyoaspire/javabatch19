package com.cg.task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AutoMobile {
	
	List<Vechicle> getTwoWheelerList(List<Vechicle> list) {
		
		List<Vechicle> resultList = new ArrayList<>();
		
		Iterator<Vechicle> i = list.iterator();
		while(i.hasNext()) {
			Vechicle v = i.next();
			if(v.getType()==VechicleType.TOWWHEELER) {
				resultList.add(v);
			}
		}		
		return resultList;		
	}

	public static void main(String[] args) {
		
		Vechicle v1 = new Vechicle();
		v1.setVechileName("Honda");
		v1.setType(VechicleType.TOWWHEELER);
		
		Vechicle v2 = new Vechicle();
		v2.setVechileName("Suzuki");
		v2.setType(VechicleType.FOURWHEELER);;
		
		Vechicle v3 = new Vechicle();
		v3.setVechileName("Hero");
		v3.setType(VechicleType.TOWWHEELER);;
		
		Vechicle v4 = new Vechicle();
		v4.setVechileName("Audi");
		v4.setType(VechicleType.FOURWHEELER);;
		
		List<Vechicle> list = new ArrayList<>();
		list.add(v1);
		list.add(v2);
		list.add(v3);
		list.add(v4);
		
		AutoMobile automobile = new AutoMobile();
		List<Vechicle> result = automobile.getTwoWheelerList(list);
		
		Iterator<Vechicle> i = result.iterator();
		while(i.hasNext()) {
			Vechicle v = i.next();
			System.out.println(v.getVechileName()+" "+v.getType());			
		}

	}

}
