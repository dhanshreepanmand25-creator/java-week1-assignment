package com.bank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankingApp {
	
	private BankAccount account;
	private Scanner scanner;
	
	public BankingApp() {
		account = new BankAccount();
		scanner = new Scanner(System.in);
	}
	
	public void start() {
		
		int choice = 0;
		
		do {
			
			System.out.println("\n=====================");
			System.out.println("   Banking Application ");
			System.out.println("=====================");
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Balance Inquiry");
			System.out.println("4.Exit");
			System.out.println("=====================");
			
			
			System.out.println("Enter your choice :");
			
			try {
				
				choice = scanner.nextInt();
				
				switch (choice) {
				
				case 1:
					depositMoney();
					break;
					
				case 2:
					withdrawMoney();
					break;
					
				case 3:
					showBalance();
					break;
					
				case 4:
					System.out.println("Thank you for using Banking Application.");
					break;
					
					default:
						System.out.println("Invalid choice.Please enter 1 to 4.");
				} 
				}catch (InputMismatchException e) {
					System.out.println("Invalid input.please enter a number.");
					scanner.nextLine();
			}
		} while (choice != 4);
		
		scanner.close();
	}
	
	private void depositMoney() {
		try {
			System.out.print("Enter amount to deposit: ");
			double amount = scanner.nextDouble();
			
			account.deposit(amount);
			}catch (InputMismatchException e) {
				System.out.println("Invalid amount. Please enter a numeric value.");
				scanner.nextLine();
			}catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
	}
	private void withdrawMoney() {
		try {
			System.out.print("Enter amount to withdraw: ");
			double amount = scanner.nextDouble();
			
			account.withdraw(amount);
			}catch (InputMismatchException e) {
				System.out.println("Invalid amount. Please enter a numeric value.");
				scanner.nextLine();
			}catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
	}
	private void showBalance() {
	
		System.out.printf("Current Balance: %.2f%n", account.getBalance());
	}


}
