package com.cdac.java.thread;

public class ATMCenter {
synchronized void withdraw(int amount)
	{
		String currentThreadName = Thread.currentThread().getName();
		System.out.println("---------------\n"+currentThreadName+" into ATM");
		System.out.println("Transaction is processing :: "+amount);
		try {
			Thread.sleep(1000);
			System.out.println("Transaction Completed");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Exit From ATM");
	}

}
