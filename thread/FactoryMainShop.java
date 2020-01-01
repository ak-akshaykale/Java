package com.cdac.java.thread;

public class FactoryMainShop {

	public static void main(String[] args) {
		Factory factory = new Factory();
		ProducerThread producer = new ProducerThread(factory);
		ConsumerThread consumer = new ConsumerThread(factory);
		//producer.setDaemon(true);
		consumer.start();
		producer.start();
		System.out.println("Normal Priority: "+producer.getPriority());
		System.out.println("ID: "+consumer.getId());
	}

}
