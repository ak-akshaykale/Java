package com.cdac.java.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflexMain {

	public static void main(String[] args) {
		try {
			Class c = Class.forName("com.cdac.java.reflection.Student");
			Field[] fields = c.getDeclaredFields();
			Method[] methods = c.getDeclaredMethods();
			
	
			System.out.println("------Fields");
			for(Field f:fields)
			{
				System.out.println(f.getName());
			}
			System.out.println("----Methods");
			for(Method m : methods)
			{
				System.out.println(m.getName());
			}
			Constructor[] con = c.getConstructors();
			System.out.println(con[1].getName()+" "+con[1].getModifiers());
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Student s1 = new Student();
		Class c1 = s1.getClass();
		Class c2 =Student.class;
		s1.setName("aj");
		s1.setRollno(10);
		
		Method m[] = c1.getDeclaredMethods();
		for(Method ms:m)
		{
			if(ms.getName().equals("setName"))
				try {
					ms.invoke(s1, "raj");
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
		}
		Field rollno=null;
		try {
			rollno = c1.getDeclaredField("rollno");
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		
		try {
			rollno.setAccessible(true); //if private then make it public 
			rollno.set(s1, 45); //change the values will be reflect
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		System.out.println(s1.getName());
		System.out.println(s1.getRollno());
	}

}
