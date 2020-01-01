package com.cdac.java.enumtest;

public class EnumMain {
	public static void main(String[] args) {
		//Direction dleft = new
		//enum can not be created by enum keyword
		Direction dleft = Direction.LEFT;
		Direction dright = Direction.RIGHT;
		Direction ddown = Direction.DOWN;
		Direction dup = Direction.UP;
		System.out.println("LEFT (Constant String): "+dleft);
		
		switch(ddown)
		{
		 case DOWN:
			 System.out.println("Down");
			 break;
			case LEFT:
				System.out.println("left");
				break;
			case RIGHT:
				System.out.println("Right");
				break;
			case UP:
				System.out.println("Up");
				break;
		}
		
	}

}
