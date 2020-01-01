package com.cdac.java.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> country = new HashMap<>();
		country.put(91, "India");
		country.put(1, "US");
		country.put(100, "Japan");
		if(country.containsKey(1))
		{
			System.out.println(country);
		}
		//To display the HashMap elements called as entry also
		//Entry<Integer, String> countryEntries; //= country.entrySet()//.iterator();
		
		Iterator<Entry<Integer, String>> countryEntries = country.entrySet().iterator();
		
		while(countryEntries.hasNext())
			System.out.println(countryEntries.next());
	}

}
