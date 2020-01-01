package Assignment2;

import java.text.DateFormat.Field;

interface Person
{
	String uniqueIdentifier();
}
class Employee implements Person
{
	String id;
	public Employee(String id)
	{
		// TODO Auto-generated constructor stub
		this.id=id;
	}
	//@Override
	public String uniqueIdentifier() {
		
		return id;
	}
}
public class A
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee("E_12345");
		System.out.println("Emp ID: "+e.id);
	}

}
