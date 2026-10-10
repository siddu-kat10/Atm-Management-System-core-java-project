package com.cg;

public interface AtmOperation {
	public void checkBalance();
	public void deposit(double amount);
	public void withdraw(double amount)throws InsufficientFundException;
	public void miniStatement();

}
