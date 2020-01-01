package com.cdac.java.thread2;

public class ThreadMain 
{

	public static void main(String[] args) {
		DemoHello dh = new DemoHello();
		DemoHelloAgain dha = new DemoHelloAgain();
		//dh.printHello();
		//dha.printHello();
		dha.start();
		try {
			dha.join(2000);
		} catch (InterruptedException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
		dh.start();
		System.out.println("hihhhhhhhhhhhhh");
		
	}
	
}
