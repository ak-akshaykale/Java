package com.cdac.java.thread;

public class ThreadMain {

	public static void main(String[] args) {
		String mainTName = Thread.currentThread().getName();
		//Thread.currentThread().setName("MYPROGRAM__ROOT");
		System.out.println("->"+mainTName);
		MyThread thread = new MyThread();
		thread.setName("T1");
		MyThread2 t2 = new MyThread2();
		thread.start();
		Thread thread2 = new Thread(t2);
		thread2.start();
		for(int i=0;i<10;i++)
		System.out.println("End of the program");
	}

}
