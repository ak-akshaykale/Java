package com.cdac.java.collection;

import java.util.Comparator;

public class CollectionComparator implements Comparator<String>
{

	@Override
	public int compare(String o1, String o2) {
		
		return o1.compareTo(o2);
	}

}
