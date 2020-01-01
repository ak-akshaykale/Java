
class A
{
	static int COUNT;
	static {main1(0);}
	static void main1(int a) {
		System.out.println("Hello "+a);
	COUNT++;
	}
}
public class StaicMembers extends A
{
	static
	{
		int A=50;
		main1(A);
	}
	static void display()
	{
		System.out.println("a");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StringMethods.display(); //= new StringMethods();
		//as.a;
		StaicMembers a=null;
		a.display();
		
	}

}
