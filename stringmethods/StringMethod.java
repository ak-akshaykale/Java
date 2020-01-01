package com.cdac.java.stringmethods;

import java.util.Locale;
import java.util.stream.IntStream;

public class StringMethod {
	static int getUnicodeCal(String a,int key)
	{
		int result=0;
		for(int i=0;i<a.length();i++)
		{
			result+=a.codePointAt(i)+key;
			System.out.println(result);
		}
		return result+key;
	}
	static void codePoint(String a)
	{
		System.out.println(
				//getUnicodeCal(a,7)
				//a.codePointBefore(1)
				//a.codePointAt(0)
				//a.codePointCount(0,a.length())
				a.concat("ab")
		);
	}
	static void allStringComparing()
	{
		String a =  new String("akshay");
		
		System.out.println(
		a.compareTo("ask") //return 0 if equals else return diff betn them - or + values
		+"\n"+
		a.compareToIgnoreCase(a+"Aa") // compare with ignoring case		
		+"\n"+
		a.contains(a+0)  // return true if equals else false
		+"\n"+
		a.contentEquals(a+"1") //return true if equals else false
		+"\n"+
		a.endsWith("ay") // if end chars match then true else false
		+"\n"+
		a.startsWith("ak") //if start chars match then true else false
		+"\n"+
		a.equals(a+6) //if equals true  else false
		+"\n"+
		a.equalsIgnoreCase(a) //ignore the case if equals then true else false
		);
	}
	public static void main(String[] args) {
		//String a="akshay";
		String a =  new String("akshay");
		// we can change the reference of the String but can not modify it;
		
		//a=""+a.charAt(5); // which may throw StringIndexOutOfBoundsException
		
		//codePoint(a);
		 //returns the Unicode value of at that index value
		
		System.out.println(a.concat(a)); //to concat to String return String
		
		
		System.out.println(
				a.intern() //return containing string from unique pool
		);
		
		System.out.println(
				a.compareTo("ask") //return 0 if equals else return diff betn them - or + values
				+
				a.compareToIgnoreCase(a+"Aa") // compare with ignoring case		
						);
				
		System.out.println(
				a.contains(a+0)  // return true if equals else false
				);
		
		//a..charAt(5); // which may throw StringIndexOutOfBoundsException
		
		//codePoint(a);
		 //returns the Unicode value of at that index value
		
		System.out.println(a.concat(a)); //to concat to String return String
		
		
		//System.out.println(
		//a.charAt(5); // which may throw StringIndexOutOfBoundsException
		
		//codePoint(a);
		 //returns the Unicode value of at that index value
		
		System.out.println(a.concat(a)); //to concat to String return String

		
		System.out.println(
				a.intern() //return containing string from unique pool
		);
		
		
		System.out.println(
				a.contentEquals(a+"1") //return true if equals else false
		);
		
		System.out.println(
				a.endsWith("ay") // if end chars match then true else false
				);
		
		System.out.println(
				a.equals(a+6) //if equals true  else false
				);
		
		System.out.println(
				a.equalsIgnoreCase(a) //ignore the case if equals then true else false
				);
			//a.matches(a) // if equals then true else false
		
		System.out.println(
				a.replace("a","kk") //replace all a with k
				);
		
		System.out.println(
				a.replaceAll("a","ko") //replace all a with ko
				);
		
		System.out.println(
				a.replaceFirst("a","k") //replace first a with k
				);
		
		System.out.println(
				a.indexOf("y") //return int (index) of any char (first occurrence)
				+""+
				a.indexOf("a",1) //return index of char after index (1) (next occurrence)
				
				);
		
		System.out.println(
				a.substring(4)// return string from the (0) index
				+"\n"+
				a.substring(0, 3) // return from startIndex to <endIndex
				);
		
		System.out.println(
				a.toLowerCase() // String to lowerCase
				+""+
				a.toLowerCase(Locale.CHINA) //lowerCase with  Local languages
				);
		
		System.out.println(
				a.toUpperCase() //String to upperCase
				);

		
		a=" akshaykale ";
		System.out.println(
				a.trim() //remove the white space from both side
				);
		
		a="akshaykale";
		System.out.println(
				a.hashCode() // return int hash values of String
				);
		
		System.out.println(
				a.isEmpty() //to check empty or not if empty then true
				);
		
		System.out.println(
				a.length() // to return int length of the String 
				);
		
		System.out.println(
				a.lastIndexOf("e") //return last occurrence of char if not in that then -1
				);
		
		System.out.println(
				a.toCharArray() // returns char[] 
				);
		
		
		String as="trs";
		//char arr[] =''+as; 
		for(int i=2;i>=0;i--)
		{
			//System.out.println(as[0]);
		}
	}

}
