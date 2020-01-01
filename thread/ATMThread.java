package com.cdac.java.thread;

public class ATMThread implements Runnable
{
	ATMCenter atmcenter;
	int amount;
	public ATMThread(ATMCenter atmcenter,int amount)
	{
		this.atmcenter=atmcenter;
		this.amount=amount;
	}
	@Override
	public void run()
	{
		atmcenter.withdraw(amount);
	}
}
