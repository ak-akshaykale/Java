package com.cdac.java.thread;

public class MyThread extends Thread
{
	@Override
	public void run() {
		super.run();
		Thread currentThread = Thread.currentThread();
		System.out.println(currentThread.getName());
		for(int i=0;i<20;i++)
		System.out.println("Good Morning");
	}
}
