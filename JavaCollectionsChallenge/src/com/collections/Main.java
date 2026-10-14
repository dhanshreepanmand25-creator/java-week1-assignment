package com.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       

        ArrayList<String> books = new ArrayList<>();

        System.out.println("===== ArrayList Challenge =====");

        System.out.print("Enter first book name: ");
        String book1 = scanner.nextLine();
        books.add(book1);

        System.out.print("Enter second book name: ");
        String book2 = scanner.nextLine();
        books.add(book2);

        System.out.print("Enter third book name: ");
        String book3 = scanner.nextLine();
        books.add(book3);

        System.out.println("\nBooks in ArrayList:");
        for (String book : books) {
            System.out.println(book);
        }

       
        System.out.print("\nEnter book name to search: ");
        String searchBook = scanner.nextLine();

        if (books.contains(searchBook)) {
            System.out.println("Book found.");
        } else {
            System.out.println("Book not found.");
        }

        
        System.out.print("\nEnter book number to update (1-3): ");
        int bookNumber = scanner.nextInt();
        scanner.nextLine();

        if (bookNumber >= 1 && bookNumber <= books.size()) {

            System.out.print("Enter new book name: ");
            String newBook = scanner.nextLine();

            books.set(bookNumber - 1, newBook);
            System.out.println("Book updated successfully.");

        } else {
            System.out.println("Invalid book number.");
        }

        
        System.out.print("\nEnter book name to remove: ");
        String removeBook = scanner.nextLine();

        if (books.remove(removeBook)) {
            System.out.println("Book removed successfully.");
        } else {
            System.out.println("Book not found.");
        }

        System.out.println("\nFinal Books:");
        for (String book : books) {
            System.out.println(book);
        }


        HashMap<Integer, String> students = new HashMap<>();

        System.out.println("\n===== HashMap Challenge =====");

        System.out.print("Enter Student ID: ");
        int id1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Student Name: ");
        String name1 = scanner.nextLine();

        students.put(id1, name1);

        System.out.print("Enter another Student ID: ");
        int id2 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Student Name: ");
        String name2 = scanner.nextLine();

        students.put(id2, name2);

        System.out.println("\nStudent Details:");

        for (Integer id : students.keySet()) {
            System.out.println(id + " : " + students.get(id));
        }

        
        System.out.print("\nEnter Student ID to retrieve: ");
        int searchId = scanner.nextInt();

        if (students.containsKey(searchId)) {
            System.out.println("Student Name: " + students.get(searchId));
        } else {
            System.out.println("Student ID not found.");
        }

        
        System.out.print("\nEnter Student ID to update: ");
        int updateId = scanner.nextInt();
        scanner.nextLine();

        if (students.containsKey(updateId)) {

            System.out.print("Enter new Student Name: ");
            String newName = scanner.nextLine();

            students.put(updateId, newName);

            System.out.println("Student updated successfully.");

        } else {
            System.out.println("Student ID not found.");
        }


      
        Queue<String> queue = new LinkedList<>();

        System.out.println("\n===== Queue Challenge =====");

        System.out.print("Enter first customer name: ");
        String customer1 = scanner.nextLine();
        queue.add(customer1);

        System.out.print("Enter second customer name: ");
        String customer2 = scanner.nextLine();
        queue.add(customer2);

        System.out.print("Enter third customer name: ");
        String customer3 = scanner.nextLine();
        queue.add(customer3);

        System.out.println("\nQueue: " + queue);

        
        System.out.println("Front Customer: " + queue.peek());

        
        System.out.println("Processing Customer: " + queue.remove());

        System.out.println("Queue after processing:");
        System.out.println(queue);

        scanner.close();
    }
}