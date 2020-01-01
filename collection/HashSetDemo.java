package com.cdac.java.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo
{

	public static void main(String[] args) {
		HashSet<String> subjects = new HashSet<>();
		subjects.add("Java");
		subjects.add("C++");
		subjects.add("Data Structure");
		subjects.add("DataBase");
		
		System.out.println(
		subjects.size()
		);
		
		Iterator<String> si = subjects.iterator();
		
		while(si.hasNext())
		{
			System.out.println(si.next());
		}
		
		
		
	}

}
