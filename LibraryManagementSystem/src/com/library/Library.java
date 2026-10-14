package com.library;

import java.util.ArrayList;
import java.util.Iterator;

public class Library {
	private ArrayList<Book> books;
	
	public Library() {
		books = new ArrayList<>();
	}
	
	public void addBook(Book book) {
		for(Book b : books) {
			if(b.getBookId() == book.getBookId()) {
				System.out.println("Book ID already exists.");
				return;
			}
		}
		books.add(book);
		System.out.println("Book added successfully.");
	}
	public void viewBooks() {
		if(books.isEmpty()) {
			System.out.println("No books available.");
			return;
		}
		System.out.println("\n===== All Books =====");
		
		for(Book book : books) {
			System.out.println("Book ID  :"+book.getBookId());
			System.out.println("Title    :"+book.getTitle());
			System.out.println("Author   :"+book.getAuthor());
			System.out.println("Available:"+book.isAvailable());
			
			System.out.println("-----------------------");
		}
	}
	public void searchBookById(int bookId) {
		for(Book book : books) {
		  if(book.getBookId() == bookId) {
			
			System.out.println("\n===== Book Found ====="); 
			System.out.println("Book ID  :"+book.getBookId());
			System.out.println("Title    :"+book.getTitle());
			System.out.println("Author   :"+book.getAuthor());
			System.out.println("Available:"+book.isAvailable());
			
			return;
		}
	}
		
		System.out.println("Book not found.");
	}
	
		public void searchBookByTitle(String title) {
			boolean found = false;
		
			for(Book book : books) {
			  if(book.getTitle().equalsIgnoreCase(title)) {
				  
				System.out.println("\n===== Book found =====");
				System.out.println("Book ID  :"+book.getBookId());
				System.out.println("Title    :"+book.getTitle());
				System.out.println("Author   :"+book.getAuthor());
				System.out.println("Available:"+book.isAvailable());
				
				found = true;
			}
		}
			
        if(!found) {
	      System.out.println("Book not found");
       }
    }
public void issueBook(int bookId) {

	for (Book book : books) {
		if( book.getBookId() == bookId) {
		 if(book.isAvailable()) {
			book.setAvailable(false);
			System.out.println("Book issued successfully!");
		}else {
			System.out.println("Book is already issued.");
		}
		return;
	}
}
System.out.println("Book not found.");
}
public void returnBook(int bookId) {
	for(Book book : books) {
		if(book.getBookId() == bookId) {
			if(!book.isAvailable()) {
				book.setAvailable(true);
				System.out.println("Book return successfully!");
			}else {
				System.out.println("Book is already available.");
			}
			return;
		}
	}
	System.out.println("Book not found");
}
public void removeBook(int bookId) {
	Iterator<Book> iterator = books.iterator();
	while(iterator.hasNext()) {
		Book book = iterator.next();
		if(book.getBookId() == bookId) {
			iterator.remove();
			System.out.println("Book removed successfully!");
			return;
		}
	}
	System.out.println("Book not found.");
	
 }
}