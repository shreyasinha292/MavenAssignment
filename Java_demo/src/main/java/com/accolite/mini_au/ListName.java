package com.accolite.mini_au;

import java.util.HashMap;

public class ListName {

	private static HashMap<Integer,String> hm1 = new HashMap<Integer,String>();
	
	
	public void insert() {
		
		hm1.put(1,"shreya");
		hm1.put(2, "eeshan");
		hm1.put(3, "dhoni");
	}
	
	public String getName(int id) {
		
		String name = hm1.get(id);
		return name;
	}
	

}
