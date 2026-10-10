package com.cg;

public class User {
	private String UserId;
	private String Pin;
	private double balance;
	
	
	
	
	public User(String userId, String pin, double balance) {
		super();
		UserId = userId;
		Pin = pin;
		this.balance = balance;
	}
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getPin() {
		return Pin;
	}
	public void setPin(String pin) {
		Pin = pin;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

}
