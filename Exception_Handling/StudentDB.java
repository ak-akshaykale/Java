package Exception_Handling;

import java.util.Scanner;

public class StudentDB {
	Student s[];
	public StudentDB(int n) {
		s = new Student[n];
		loadStudentRecords();
	}
	private void loadStudentRecords() {
		s[0] = new Student(10,"AK","NGR");
		s[1] = new Student(11,"AK","NSK");
		s[2] = new Student(13,"DS","DSK");
	}
	public Student getStudent(int id) throws StudentIdNotFound
	{
		for(int i=0;i<s.length;i++)
		{
			if(s[i].getId()==id)
			{
				return s[i];
			}
		}
		throw new StudentIdNotFound();
	}
	public static void main(String[] args) {
		StudentDB s1 = new StudentDB(3);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student id: ");
		int id=sc.nextInt();
		try
		{
		Student result = s1.getStudent(id);
		System.out.println("Name: "+result.getName()+"\nCity: "+result.getCity());
		}
		catch (StudentIdNotFound e) {
			System.err
			
			
			.println(e.getMessage());
		}
		
	}

}
