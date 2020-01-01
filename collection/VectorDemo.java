package com.cdac.java.collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<String> nameVector = new Vector<>();
		nameVector.add("akshay");
		nameVector.add(1, "Mahesh");
		
		System.out.println(" "+nameVector.get(0));
		
		System.out.println(nameVector.isEmpty()
				);
		System.out.println(nameVector.listIterator().next()
				);
		System.out.println("Enumerator Interface:");
		Enumeration<String> enumvect = nameVector.elements();
		while(enumvect.hasMoreElements())
		{
			System.out.println(enumvect.nextElement());
		}
		
	}
}
