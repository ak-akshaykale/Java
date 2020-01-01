package com.cdac.java.generics;

public class DataStore<T>
{
	T data;
	public DataStore() {
	}
	public T getDa() {
		return data;
	}
	public void setDa(T data)
	{
		this.data=data;
	}
}
