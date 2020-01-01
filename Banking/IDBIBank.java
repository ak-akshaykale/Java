package com.cdac.java.Banking;

import java.util.Scanner;

public class IDBIBank
{
	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.setBank_name("IDBI Bank");
		bank.setBank_branch("Mumbai");
		System.out.println("Enter name: ");
		Scanner scanner = new Scanner(System.in);
		String name=scanner.nextLine();
		int accountno =bank.createAccount(name);
		System.out.println("Enter amount: ");
		int amt = scanner.nextInt();
		bank.deposit(accountno, amt);
		bank.display();
	}
}
