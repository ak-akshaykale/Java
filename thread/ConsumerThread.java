package com.cdac.java.thread;

public class ConsumerThread extends Thread
{
	Factory factory;	
	public ConsumerThread(Factory factory) {
		this.factory=factory;
	}
	
	@Override
	public void run() {
		super.run();
		factory.consumer();
	}
	
	
}
