import java.util.Scanner;

public class Armstrong {
	static int power(int n,int dig)
	{
		int  r=n;
		for(int i=1;i<dig;i++)
			r=r*n;
		return r;
	}
	public static void main(String[] args) {
		System.out.println("Enter Number: ");
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int digit=0;
		int m=n;
		while(n>0)
		{
			digit++;
			n=n/10;
		}
		int sum=0;
		n=m;
		while(n>0)
		{
			int r = n%10;
			//System.out.println(" "+power(r,digit));
			sum=sum+power(r,digit);
			n=n/10;
		}
		
		if(sum==m)
		{
			System.out.println("Armstrong No.");
		}
		else
		{
			System.out.println("Not Armstrong");
		}
	}

}
