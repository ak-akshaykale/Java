package com.cdac.java.thread;

public class Factory {
	int currentItems;
	Object lock = new Object();
	void production()
	{
		synchronized (lock) {
			System.out.println("Production started");
			for(int i=0;i<5;i++)
			{
				System.out.println("Producing "+currentItems+" Items");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				currentItems++;
			}
			System.out.println("Production Completed");
			lock.notify();
		}
		
	}
	void consumer()
	{
		synchronized(lock)
		{
			if(currentItems==0)
			{
				try {
					lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Consuming started");
			for(int i=0;i<5;i++)
			{
				System.out.println("Consuming :: "+currentItems+" Items");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				currentItems--;
			}
			System.out.println("Consuming Completed");
		}
	}
}
