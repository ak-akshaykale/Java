package Assignment2;
class Author
{
	String name;
	String email;
	public Author(String nm,String em) {
		// TODO Auto-generated constructor stub
		name=nm;
		email=em;
	}
}
class Book extends Author
{
	String name;
	String Author;
	int price;
	Book(String bname,String aname,String em,int pr)
	{
		super(aname, em);
		name=bname;
		price=pr;
		Author=aname;
	}
	public String toString()
	{
		/*System.out.println("Book Name: "+name);
		System.out.println("Author Name: "+Author);
		System.out.println("Email: "+email);
		System.out.println("Price: "+price);*/
		return "Book Name: "+name+
				"\nAuthor Name: "+Author+
				"\nEmail: "+email+
				"\nPrice: "+price;
	}
}
public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book("JAVA","James Gosling","jamesgosling@gmail.com",350);
		Book b2 = new Book("C","Dennis Ritchie","dennisritchie@gmail.com",280);
		//b1.toString();
		//b2.toString();
		System.out.println(b1);
		System.out.println(b2);
	}

}
