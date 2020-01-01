package com.cdac.java.thread2;

public class DemoHelloAgain extends Thread
{
	@Override
	public void run() {
		super.run();
		printHello();
	}
	void printHello()
	{
		for(int i=0;i<30;i++)
		System.out.println("Hello again...");
	}
}
