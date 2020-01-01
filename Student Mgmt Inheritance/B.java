package Assignment2;

class CDACStudent
{
	static int objn=0;
	int cnt=0;
	int rollNo;
	int age;
	String name;
	final String instituteName="CDAC Juhu";
	public CDACStudent(int aroll,int aage,String aname,String ainame)
	{
		rollNo=aroll;
		age=aage;
		name=aname;
		//instituteName=ainame;
		objn++;
		//cnt=a;
	//	cnt++;
	}
	int getNumberOfInstances()
	{
		return objn;
		//return cnt;
	}
	void display()
	{
		System.out.println("RollNo : "+rollNo);
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("InstituteName : "+instituteName);
	}
}
public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CDACStudent c1 = new CDACStudent(1, 22, "Akshay", "asd0");
		CDACStudent c2 = new CDACStudent(2, 21,"Deepak", "qwe1");
		CDACStudent c3 = new CDACStudent(3, 24,"Mayuresh", "poi0");
		CDACStudent c4 = new CDACStudent(4, 23,"Aditya", "zxc5");
		//CDACStudent c1;
		/*CDACStudent c2 = new CDACStudent(2, 21,"Deepak", "qwe1",0);
		System.out.println("No:"+c2.cnt);
		CDACStudent c3 = new CDACStudent(2, 21,"Deepak", "qwe1",c2.cnt);
		CDACStudent c4 = new CDACStudent(2, 21,"Deepak", "qwe1",c3.cnt);
		*/
		c2.display();
		System.out.println("No of Objects: "+c4.getNumberOfInstances());
	}

}
