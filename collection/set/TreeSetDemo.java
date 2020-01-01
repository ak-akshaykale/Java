package com.cdac.java.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> stringTree = new TreeSet<>();
		stringTree.add("8");
		stringTree.add("+");
		stringTree.add("9");
		//NavigableSet
		System.out.println("HeadSet:");
		System.out.println(
		stringTree.headSet("9")); // retrieves the all elements till the element(9)
		
		System.out.println(
				stringTree.tailSet("+") //retrieves the all elements from element(+) to the end of set
				);
		System.out.println(
				"floor::"+
				stringTree.floor("9")); //returns immediate smaller of the given element
		System.out.println(stringTree.ceiling("+")); //returns immediate greater of given element
		System.out.println(stringTree.first()
				);
		System.out.println(stringTree.last()
				);
		System.out.println(stringTree.pollFirst() // it retrieves and also remove the element
				);
		//System.out.println(stringTree.pollLast()
				//);
		System.out.println(stringTree.pollLast());
		System.out.println("After pollFirst() method excecution:\n");
		Iterator<String> stringIterator = stringTree.iterator();
		while(stringIterator.hasNext())
		{
			System.out.println(stringIterator.next());
					
		}
	}

}
