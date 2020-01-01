package com.cdac.java.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	static void display(LinkedList<String> a)
	{
		System.out.println("Retrieving Element By index:\n");
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
	}
	public static void main(String[] args) {
		LinkedList<String> country = new LinkedList<>();
		country.add("India");
		country.add("US");
		country.add("China");
		System.out.println(country.getFirst());
		System.out.println(country.getLast());
		System.out.println(country.get(1));
		//display(country);
		country.add("India"); //duplicate allowed
		country.add(null); //multiple nulls are allowed
		//country.add(null);
		
		
		System.out.println("Using Iterator Interface");
		Iterator<String> iterator = country.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next()); //print in inserted Order
			//iterator.remove();
		}
		System.out.println("Top element: "+country.peek()); //it returns the top element
		System.out.println("No. of Countries: "+country.size()); //it returns the top element
	
		System.out.println("Using ListIterator Interface: ");
		ListIterator<String> litravel = country.listIterator(2); //start from second index
		litravel = country.listIterator(); //
		// we can add,updae,remove through ListIterator
		
		//litravel.add();
		while(litravel.hasNext())
		{
			System.out.println(litravel.next());
			if(!litravel.hasNext())
			litravel.add("Japan");
			//slitravel.add("Thailand");
			if(litravel.hasNext())
			litravel.remove();
			
			//litravel.set("ROOT OF ALL COUNTRY IS INDIA");
		}
		//
		System.out.println("Reverse LinkedList");
		while(litravel.hasPrevious())
		{
			System.out.println(litravel.previous());
		}
	}

}
