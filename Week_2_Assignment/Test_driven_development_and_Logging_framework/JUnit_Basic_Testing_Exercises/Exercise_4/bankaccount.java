package com.dn4.junitassignment;

public class bankaccount {
	private int balance;
	
	public bankaccount(int ibalance) {
		this.balance = ibalance;
	}
	
	public void deposit(int amount) {
		balance += amount; 
	}
	
	public void withdraw(int amount) {
		if( amount > balance ) {
			throw new IllegalArgumentException("Insufficient funds");
		}
		
		balance -= amount;
	}
	
	public int getbalance() {
		return balance;
	}
	
}
