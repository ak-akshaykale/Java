import java.util.Scanner;

public class Prime {

	boolean isPrime(int n)
	{
		int f=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				f++;
			}
		}
		if(f==2)
			return true;
		else
		return false;
	}
	public static void main(String[] args) {
		Prime p = new Prime();
		System.out.println("Enter the Number: ");
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		if(p.isPrime(s))
		{
			System.out.println(s+" is Prime");
		}
		else
		{

			System.out.println(s+" is Not Prime");
		}
	}

}
