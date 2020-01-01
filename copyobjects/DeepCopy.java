package com.cdac.java.copyobjects;

public class DeepCopy {
	public static void main(String[] args) {
		Book book1 = new Book("Java","Mr. James Gosling");
		Book book2=null;
		try {
			book2=(Book)book1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		book2.setBook_author("Mr. Tiwari");
		System.out.println("Book1: "+book1.getBook_author()+
				"\nBook2: "+book2.getBook_author());
	}
		
}
