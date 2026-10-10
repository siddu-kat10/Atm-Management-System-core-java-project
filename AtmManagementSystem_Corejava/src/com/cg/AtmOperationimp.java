package com.cg;

import java.util.ArrayList;
import java.util.List;

public class AtmOperationimp implements AtmOperation{
	private User u;
	private List<String>transaction=new ArrayList<String>();
	
	public AtmOperationimp(User u) {
		this.u=u;
	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println("Current balance: "+u.getBalance()	);
		
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		if(amount>0) {
			u.setBalance(u.getBalance() + amount);
			transaction.add("Deposited amount: ");
			System.out.println("Successfully deposited amount"+amount);
		}
		else {
			System.out.println("Invalid deposit amount.");
		}
		
	}

	@Override
	public void withdraw(double amount) throws InsufficientFundException {
		// TODO Auto-generated method stub
		if(amount<=0) {
			System.out.println("Invalid withdrawal amount.");
		}
		if(amount > u.getBalance()) {
			throw new InsufficientFundException("Insufficient funds.");
		}
		u.setBalance(u.getBalance()-amount);
		transaction.add("Withdraw amount: ");
		System.out.println("Successfully withdrawn amount: "+amount);
		
	}

	@Override
	public void miniStatement() {
		// TODO Auto-generated method stub
		System.out.println("__Mini statement___");
		if(transaction.isEmpty()) {
			System.out.println("No transaction available");
		}else {
			transaction.stream().skip(Math.max(0, transaction.size()-5));
		}
		
	}

}
