import java.util.Scanner;
import java.lang.Math;

public class Dup
{
	public static void main(String args[])
	{
		int arr[] = new int[5];
		int arr1[] = new int[5];
		System.out.println("Enter the elements:");
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<5; i++)
		{
			arr[i] = sc.nextInt();
		}
		int c=0;
		for(int j=0; j<5; j++)
		{
			int flag=0;
			for(int k=0; k<=c;k++)
			{
				if(arr[j]==arr1[k])
					flag=1;
			}
			if(flag==0)
			{
				arr1[c]=arr[j];
				c++;
			}
		}
		System.out.println("After Removing Duplicates:");
		for(int j=0; j<c; j++)
		{
			System.out.println(arr1[j]);
		}
	}
}