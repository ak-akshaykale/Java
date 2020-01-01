package com.cdac.java.thread2;

public class DemoDeadLock {
  public static void main(String[] args) {
	Thread thread = Thread.currentThread();
		try {
			thread.join(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
