package com.cdac.java.thread;

public class MyThread2 implements Runnable
{
	@Override
	public void run()
	{
		String currentThreadName = Thread.currentThread().getName();
		System.out.println(currentThreadName);
		for(int i=0;i<50;i++)
		System.out.println("My Thread2");
	}

}
