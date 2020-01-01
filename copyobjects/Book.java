package com.cdac.java.copyobjects;

public class Book implements Cloneable
{
	private String book_name;
	private String book_author;
	
	public Book(String book_name, String book_author) {
		super();
		this.book_name = book_name;
		this.book_author = book_author;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getBook_author() {
		return book_author;
	}
	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
