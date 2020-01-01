package com.cdac.java.thread;

public class ProducerThread extends Thread
{
	Factory factory;
	public ProducerThread(Factory factory)
	{
		this.factory = factory;
	}
	@Override
	public void run() {
		super.run();
		factory.production();
	}
}
