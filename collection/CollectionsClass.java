package com.cdac.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionsClass {
	public static void main(String[] args) {
		ArrayList<String> newstr = new ArrayList<>();
		newstr.add("abc");
		newstr.add("xyz");
		newstr.add("dgt");
		newstr.add("jkl");
		//sorting method
		System.out.println("Before Sort: "+newstr);
		Collections.sort(newstr);
		System.out.println("After Natural Sort: "+newstr);
		Collections.sort(newstr,Collections.reverseOrder());
		System.out.println("After Sorting reverser: "+newstr);
		CollectionComparator cmp = new CollectionComparator();
		Collections.sort(newstr,cmp);
		System.out.println(newstr);
		
		//min
		String min=Collections.min(newstr);
		System.out.println("min: "+min);
		
		//MAX
		String max= Collections.max(newstr);
		System.out.println("MAX: "+max);
		
		//binary search- on sorted data
		int index = Collections.binarySearch(newstr, "dgt");
		System.out.println("Searching Element "+newstr.get(index)+" Found at index "+index);
		
		//shuffle -random sequence changing of collection
		Collections.shuffle(newstr);
		System.out.println(newstr);
		
		//To get (convert) collection into synchronized Collection
		Collection<String> collect = Collections.synchronizedCollection(newstr);
		ArrayList<String> rls = new ArrayList<>(collect);
		Iterator<String> it = rls.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			rls.add("ut");
		}
		
		//emptyList() return inmutable empty list can not modify
		//java.util.ConcurrentModificationException
		List<Object> in = Collections.emptyList();
		//in.add(100);
		
		//single object is used only one object is allowed
		Collection cp = Collections.singletonList(newstr);
		cp.add(100);
		
		
		
	}

}
