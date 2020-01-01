package com.cdac.java.ObjectDemo;

import java.util.ArrayList;
import java.util.LinkedHashSet;

import com.cdac.java.collection.Employee;

public class ObjectTest {

	public static void main(String[] args) {
		Employee e = new Employee(89765,"");
		Object s = e;
		System.out.println(s.equals(e));
		if( s instanceof Employee)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
	}

}
