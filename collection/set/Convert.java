package com.cdac.java.collection.set;

public class Convert {
	static String convertToBinary(int a)
	{
		String binarya="";
		while(a>0)
		{
			int i = a%2;
			binarya=i+binarya;
			a=a/2;
		}
		return binarya;
	}
	static double convertToDecimal(String binarya)
	{
		Integer a = Integer.parseInt(binarya);
		double sum=0;
		int count=0;
		while(a>0)
		{
			int r = a%10;
			sum=sum+(r*Math.pow(2,count));
			count++;
			a=a/10;
		}
		return sum; 
	}
	public static void main(String[] args) {
		Integer a =7;
		System.out.println(convertToBinary(a));
		System.out.println(""+convertToDecimal("1101"));
		
}
}