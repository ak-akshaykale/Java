package com.cdac.java.fileio;

import java.io.File;
import java.io.IOException;

public class BasicFileOpearation {

	public static void main(String[] args) {
		/*File file = new File("D://New.txt");
		if(file.exists()) // to check file is available for not
		{
			System.out.println("File is available");
		}
		else
		{
			System.out.println("File is Not Available");
			try {
				//create your own file
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			File f= file.getCanonicalFile();
			System.out.println(f);
			System.out.println(file.compareTo(f));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		//display all the folder or files in drive
		File file2 = new File("D:/");
		File [] files=file2.listFiles();
		int no_files=0;
		int no_dir=0;
		for(File f:files)
		{
			if(f.isFile())
			{
				System.out.println(f.getName());
				no_files++;
			}
			else if(f.isDirectory())
			{
				System.out.println("+ "+f.getName());
				no_dir++;
			}
		}
		System.out.println("Total Files: "+no_files);
		System.out.println("Total Directory: "+no_dir);
		System.out.println("Total Files & Directory: "+files.length);
	}

}
