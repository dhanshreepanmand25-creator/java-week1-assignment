package com.library;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Library library = new Library();
		
		int choice = 0;
		
		do {
			System.out.println("\n============================");
			System.out.println("   Library Management System  ");
			System.out.println("==============================");
			System.out.println("1. Add Book");
			System.out.println("2. View Books");
			System.out.println("3. Search Book");
			System.out.println("4. Issue Book");
			System.out.println("5. Return Book");
			System.out.println("6. Remove Book");
			System.out.println("7. Exit");
			System.out.println("============================");
			System.out.print("Enter your choice: ");
			
			
			if(!scanner.hasNextInt()) {
				System.out.println("Please Enter a valid number.");
				scanner.next();
				continue;
			}
			
			choice = scanner.nextInt();
			
			switch(choice) {
			 
			case 1:
				System.out.print("Enter Book ID: ");
				int bookId = scanner.nextInt();
				
				scanner.nextLine();
				
				System.out.println("Enter Book Title: ");
				String title = scanner.nextLine();
				
				System.out.println("Enter Author Name: ");
				String author = scanner.nextLine();
				
				Book book = new Book(bookId, title, author);
				
				library.addBook(book);
				
				break;
				
			case 2:
				
				library.viewBooks();
				
				break;
				
			case 3:
				
				System.out.println("\n1. Search by ID");
				System.out.println("2. Search by Title");
				
				System.out.println("Enter your choice: ");
				
				if(!scanner.hasNextInt()) {
					System.out.println("Invalid choice.");
					scanner.next();
					break;
				}
				
				int searchChoice = scanner.nextInt();
				
				if(searchChoice == 1) {
					System.out.print("Enter Book ID: ");
					int searchId = scanner.nextInt();
					
					library.searchBookById(searchId);
				} else if (searchChoice == 2) {
					
					scanner.nextLine();
					
					System.out.println("Enter Book Title: ");
					String searchTitle = scanner.nextLine();
					
					library.searchBookByTitle(searchTitle);
				} else {
					System.out.println("Invalid search choice.");
				}
				
				break;
				
			case 4:
				
				System.out.print("Enter Book ID to issue: ");
				
				int issueId = scanner.nextInt();
				
				library.issueBook(issueId);
				
				break;
				
           case 5:
				
				System.out.print("Enter Book ID to return: ");
				
				int returnId = scanner.nextInt();
				
				library.returnBook(returnId);
				
				break;
				
           case 6:
				
				System.out.print("Enter Book ID to remove: ");
				
				int removeId = scanner.nextInt();
				
				library.removeBook(removeId);
				
				break;
				
           case 7:
				
				System.out.print("Thank you for using Library Management System! ");
				
				break;
				
				default:
					
					System.out.println("Invalid choice. Please enter 1 to 7.");
				
			}
			
		} while(choice != 7);
		
		scanner.close();
	}

}
