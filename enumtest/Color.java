package com.cdac.java.enumtest;

public enum Color {
	WHITE("#FFFFFF"),RED("#FF0000"),GREEN("#FFFF00");
	//public static final Color RED = new Color("#FF0000");
	public String a;
	private Color(String a)
	{
		this.a=a;
	}
	public String get()
	{
		return a;
	}
	
}
