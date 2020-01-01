package com.cdac.java.Banking;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Bank
{
	private String bank_name;
	private String bank_branch;
	private ArrayList<Account> accounts;
	private static int ACC_No=1000000; 
	Bank()
	{
		accounts = new ArrayList<>();
	}
	
	public String getBank_name() {
		return bank_name;
	}

	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	public String getBank_branch() {
		return bank_branch;
	}

	public void setBank_branch(String bank_branch) {
		this.bank_branch = bank_branch;
	}

	int createAccount(String name)
	{
		Account account = new Account();
		account.setName(name);
		account.setAccount_no(ACC_No);
		account.setAmount(0);
		ACC_No++;
		accounts.add(account);
		return account.getAccount_no();
	}
	int deposit(int acc_no,int amount)
	{
		Iterator<Account> iterator = accounts.iterator();
		while(iterator.hasNext())
		{
			Account acc = iterator.next();
			if(acc.getAccount_no()==acc_no)
			{
				int old_amt=acc.getAmount();
				acc.setAmount(old_amt+amount);
				return acc.getAmount();
			}
		}
		return -1;
	}
	int withdraw(int acc_no,int amt)
	{
		Iterator<Account> iterator  =accounts.iterator();
		while(iterator.hasNext())
		{
			Account acc = iterator.next();
			if(acc.getAccount_no()==acc_no)
			{
				int old_amt=acc.getAmount();
				if(amt<old_amt)
				{
					acc.setAmount(old_amt-amt);
					return acc.getAmount();
				}
				else
				{
					return -2;
				}
			}
		}
		return -1;
	}
	void display()
	{
		Iterator<Account> acc = accounts.iterator();
		//System.out.println(acc.next());
		while(acc.hasNext())
			System.out.println(acc.next());
	}
}
