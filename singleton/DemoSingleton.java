package com.cdac.java.singleton;

public class DemoSingleton {
	private static DemoSingleton instance=null;
	private DemoSingleton() {
	
	}
	static public DemoSingleton getInstance()
	{
		if(instance==null)
		{
			instance = new DemoSingleton();
		}
		return instance;
	}
}
