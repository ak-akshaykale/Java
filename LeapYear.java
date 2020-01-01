import java.util.Scanner;

public class LeapYear {

	boolean checkLeapYear(int yr)
	{
		if(yr%4==0)
		{
			//to conditions
			if(yr%100==0)
			{
				if(yr%400==0)
				{
					//leap
					return true;
				}
				else
				{
					//not leap
					return false;
				}
			}
			else
			{
				//leap
				return true;
			}
		}
		else
		{
			//not leap
			return false;
		}
	}
	boolean checkLeap(int yr)
	{
		if(yr%4==0)
			if(yr%100==0)
				if(yr%400==0)
					return true;
				else
					return false;
			else
				return true;
		else
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeapYear ly = new LeapYear();
		Scanner sr = new Scanner(System.in);
		int yr=sr.nextInt();
		boolean ln = ly.checkLeapYear(yr);
		if(ln)
		{
			System.out.println(yr+" is Leap Year");
		}
		else
		{
			System.out.println(yr+" is not leap year");
		}
	}

}
