package com.bank;

public class BankAccount {

	private double balance;
	
	public BankAccount() {
		balance = 0.0;
	}
	public void deposit(double amount) {
		if(amount <= 0) {
			throw new IllegalArgumentException("Deposit amount must be positive.");
		}
		balance = balance + amount;
		System.out.println("Amount deposited successfully.");
		System.out.println("Current Balance"+ balance);
	}
	
	public void withdraw(double amount) {
		
		if(amount <= 0) {
			throw new IllegalArgumentException("Withdrawal amount must be positive.");
		}
		if(amount > balance) {
			throw new IllegalArgumentException("Insufficient balance.");
		}
		
		balance = balance - amount;
		System.out.println("Amount withdrawn is successfully.");
		System.out.println("Current Balance: " + balance);
	}
	public double getBalance() {
		return balance;
	}

	
}
