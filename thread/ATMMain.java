package com.cdac.java.thread;

public class ATMMain {

	public static void main(String[] args) {
		ATMCenter atm = new ATMCenter();
		ATMThread t1 = new ATMThread(atm, 1000);
		ATMThread t2 = new ATMThread(atm, 5000);
		
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);
		thread1.start();
		thread2.start();
	}

}
