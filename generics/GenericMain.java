package com.cdac.java.generics;

public class GenericMain {
	public static void main(String[] args) {
		DataStore<String> stringdata = new DataStore<>();
		stringdata.setDa("Hello");
		System.out.println(stringdata.getDa());
		//
		//DataSore<T> T <-- Type (of Data)
		DataStore<Integer> integerData = new DataStore<>();
		//Does not allowed other type then specified type
		//integerData.setDa("");
		integerData.setDa(654321);
		System.out.println(integerData.getDa());
		DataStore<Object> datas = new DataStore<>();
		Object o1 = new Object();
		o1 = (Object)stringdata;
		datas.setDa(o1);
		System.out.println(" "+datas.getDa());
	}

}
