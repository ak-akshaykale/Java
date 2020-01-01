package com.cdac.java.collection;

import java.awt.Desktop.Action;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ArrayListDemo
{
	public static void main(String[] args) {
		ArrayList<String> city = new ArrayList<>();
		city.add("Mumbai");
		city.add("Ahmednagar");
		city.add("Pune");
		city.add("Nasik");
		city.add(2, "Jalgoan"); // add(index,element)  to replace the element
		System.out.println(city.get(0)); //get element at index
		//city.clear(); //clear or remove all the Array
		city.add("Ahmednagar");
		Object obj = new Object();
		obj =city.clone(); // copy the elements to another object
		System.out.println(obj.toString());
		System.out.println(city.contains("Ahmednagar")); //contains compare & return the true when found the match
		city.set(0, "Dhule"); // to update element at index
		city.add(0, "Kolhapur"); //to add element at index
		//city.remove(1);
		Iterator<String> it = city.iterator();
		while(it.hasNext())
		{
			//it.remove();
			System.out.println(it.next());
			it.remove();
		}
		
	}

}
