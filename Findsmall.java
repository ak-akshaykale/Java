
public class Findsmall {

	int findSmallerno(int arr[],int s)
	{
		for(int i = 0;i<s-1;i++)
		{
			for(int j =0;j<s-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr[0];
	}
	int findMin(int rr[])
	{
		int min=rr[0];	
		for(int i:rr)
		{
			if(i<min)
			{
				min=i;
			}
			
		}
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {45,6,9,81,8,6,4,3,2,4,7,1,3};
		Findsmall fm = new Findsmall();
		System.out.println(fm.findMin(arr));
	}

}
