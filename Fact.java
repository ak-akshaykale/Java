
public class Fact {

	int fact(int n)
	{
		int tot=1;
		for(int i=n;i>0;i--)
		{
			tot=tot*i;
		}
		return tot;
	}
	public static void main(String[] args)
	{
		Fact fc = new Fact();
		System.out.println(fc.fact(5));
	}

}
