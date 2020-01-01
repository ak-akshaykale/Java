
public class Remvele {

	int[] removeDupli(int ar[],int n)
	{
		int j=0;
		int cnt=0;
		int[] dp = new int[n];
		while(j<n)
		{
			int f=0;
			for(int i=0;i<cnt;i++)
			{
			if(dp[i]==ar[j])
			{
				f=1;
			}
			}
			if(f==0)
			{
				dp[cnt]=ar[j];
				cnt++;
			}
			j++;
		}
		/*for(int m:dp)
		{
			System.out.println(m);
		}*/
		return dp;
	}
	public static void main(String[] args) {
		int arr[]= {1,1,3,4,2,3,1};
		Remvele rm = new Remvele();
		arr=rm.removeDupli(arr, 7);
		for (int i : arr) {
			System.out.println(i);
		}
	}

}
