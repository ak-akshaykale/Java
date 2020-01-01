import java.lang.*;
public class Fib
{
	
	void fibseries(int n)
	{
		int srno=0;
		int sum=1;
		System.out.print(0+" "+1);
		while(sum<n)
		{
			//srno=sum;
			sum=sum+srno;
			srno=sum-srno;
			if(sum>n)
				break;
			System.out.print(" "+sum);
		}
	}
	
	
	static int fibrecursion(int n)
	{
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else
		return fibrecursion(n-1)+fibrecursion(n-2);
	}
	
	
	
	public static void main(String[] args) {
		Fib f = new Fib();
		f.fibseries(10);
		System.out.println("\nRecur: ");
		for(int i=0;i<10;i++)
		System.out.println(" "+f.fibrecursion(i));
	}

}
