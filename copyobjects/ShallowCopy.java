package com.cdac.java.copyobjects;

public class ShallowCopy {

	public static void main(String[] args) {
		Book book1 = new Book("JAVA","James Gosling");
		// Shallow Copy
		Book book2 = book1;
		book2.setBook_author("Mr. Tiwari");
		System.out.println("Book1: "+book1.getBook_author()+
				"\nBook2: "+book2.getBook_author());
		//both book1 and book2 will set as display as Mr. Tiwari
		//because they are using same memory
		
	}

}
