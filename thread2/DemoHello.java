package com.cdac.java.thread2;

public class DemoHello extends Thread
{
	@Override
	public void run() {
		super.run();
		printHello();
	}
	void printHello()
	{
		for(int i=0;i<100;i++)
		System.out.println("Hello");
	}
}
