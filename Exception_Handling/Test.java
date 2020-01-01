package Exception_Handling;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int a[] = {10,30,50,4,0,8};
		int b[] = {4,5,6,8,9,7,8};
		//int lxa = a.length;
		//int lxb = b.length;
		String strb ="za";
		String strd ="za";
		String strs = new String("ZA");
		strb.equals(strd);
		if(strb.equalsIgnoreCase(strs))
		System.out.println("match");
		else
		System.out.println("Not match");

		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		System.out.println("Hello "+str);
		
	}
}
