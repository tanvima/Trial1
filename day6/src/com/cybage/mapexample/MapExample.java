package com.cybage.mapexample;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		
		System.out.println("helllo");
		//Map<String,String> capitals = new HashMap<String, String>();
		Map<String,String> capitals = new TreeMap<String, String>();
		
		capitals.put("GJ", "Gandhinagar");
		capitals.put("MH", "Mumbai");
		capitals.put("TL", "Hyderabad");
		capitals.put("AP", "Hyderabad");
		capitals.put("TN", "Chennai");
		capitals.put("PB", "Chandigarh");
		capitals.put("MH", "Pune");
		capitals.put("delhi", null);
		//capitals.put(null, "Pune");
		
		System.out.println(capitals);
		System.out.println(capitals.keySet());
		System.out.println(capitals.values());
	}
}
