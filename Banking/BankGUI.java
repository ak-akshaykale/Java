package com.cdac.java.Banking;

import java.util.Scanner;

public class BankGUI {

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.setBank_name("IDBI Bank");
		bank.setBank_branch("Mumbai");
		Scanner scanner = new Scanner(System.in);
		boolean play=true;
		
		while(play)
		{
			int choice;System.out.println("________MENU______\n1. Create Account\n2.Deposit\n3.Withdraw\n4. Display\n5. Exit\nenter your choice: ");
		choice = scanner.nextInt();
			switch(choice)
			{
			
				case 1:
					System.out.println("Enter name: ");
					String name=scanner.next();
					int accountno =bank.createAccount(name);
					System.out.println("Account Created Successfully :: "+accountno);
					break;
				case 2:
					System.out.println("Enter Account No: ");
					int acc = scanner.nextInt();
					System.out.println("Enter amount: ");
					int amt = scanner.nextInt();
					int result =bank.deposit(acc, amt);
					if(result==-1)
					{
						System.err.println("Invalid Account!");
						break;
					}
					else
					{
						System.out.println("Amount Deposited. Updated balance is "+result);
					}
				case 3:
					System.out.println("Enter Account No: ");
					int acc2 = scanner.nextInt();
					System.out.println("Enter amount: ");
					int amt2 = scanner.nextInt();
					int result2 =bank.withdraw(acc2, amt2);
					if(result2==-1)
					{
						System.err.println("Invalid Account!");
						break;
					}
					else if(result2==-2)
					{
						System.err.println("Insufficient Balance!");
					}
					else
					{
						System.out.println("Amount Withdraw. Updated balance is "+result2);
					}
					break;
				case 4:
					bank.display();
					break;
				case 5:
					play=false;
					break;
				default:
					break;	
			}
		}
	}

}
