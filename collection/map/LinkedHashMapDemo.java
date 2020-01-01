package com.cdac.java.collection.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap<Integer, Student> studentMap = new LinkedHashMap<>();
		Student s1 = new Student(5,"Aditya");
		Student s2 = new Student(10,"Akshay");
		Student s3 = new Student(24,"Deepak");
		Student s4 = new Student(25,"Aditya");
		
		studentMap.put(101,s1);
		studentMap.put(102, s2);
		studentMap.put(103, s3);
		studentMap.put(104, s4);
		Iterator<Entry<Integer, Student>> studentIterator = studentMap.entrySet().iterator();
		for(;studentIterator.hasNext();)
		{
			System.out.println(studentIterator.next().getValue());
		}
		System.out.println("Key:");
		System.out.println(
		studentMap.get(102)
				);
	}
}
