package Exception_Handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TryCatchFinal {

	public static void main(String[] args) {
		File f;
		FileReader fr=null;
		try
		{
			System.out.println("Enter file Name: ");
			Scanner sc  = new Scanner(System.in);
			 f= new File("c:/"+sc.next());
			 fr = new FileReader(f);
			 sc = new Scanner(fr);
			 System.out.println("Content of The File:\n");
			 while(sc.hasNext())
			 System.out.println(sc.nextLine());
			 
		}
		catch(FileNotFoundException fnfe)
		{
			System.out.println("File is not found");
			//System.out.println("if You want to try again press 1: ");
		}
		catch(IOException ioe)
		{
			System.out.println("Problem minwhile reading");
		}
		finally {
			try
			{
				fr.close();
			}
			catch(Exception ess)
			{
				System.out.println("Exception");
			}
		}
		System.out.println("Program run till the end");
	}

}
