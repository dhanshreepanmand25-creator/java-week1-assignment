Library Management System

1. Project Title
Library Management System using Java

2. Objective
The objective of this project is to develop a console-based Library Management System using Java. It helps manage book records and demonstrates object-oriented programming, collection handling, menu-driven interaction, and organized application flow.

3. Features Implemented
•	Add a new book with book ID, title, and author name.
•	View all books stored in the library.
•	Search for a book by ID or title.
•	Issue a book if it is available.
•	Return an issued book.
•	Remove a book from the library.
•	Prevent duplicate book IDs.
•	Display appropriate messages when a book is not found.
•	Use a menu-driven interface to perform operations.

4. Technologies Used
•	Programming Language: Java
•	IDE: Eclipse
•	Collection: ArrayList
•	Concepts: Classes, Objects, Constructors, Encapsulation, Methods, Loops, Conditional Statements, and Iterator.

5. File Structure
library_management_system/
├── src/
│   └── com/
│       └── library/
│           ├── Book.java
│           ├── Library.java
│           └── Main.java
└── README.md

Class Responsibilities
Book.java
•	Stores book ID, title, author, and availability.
•	Uses a constructor to initialize book details.
•	Provides getter methods and a method to update availability.
Library.java
•	Stores books in an ArrayList.
•	Implements add, view, search, issue, return, and remove operations.
•	Checks for duplicate book IDs and handles missing books.
Main.java
•	Displays the menu.
•	Accepts user input using Scanner.
•	Calls the appropriate Library methods.
•	Continues displaying the menu until the user exits.

6. Steps to Compile and Run
Using Eclipse IDE
1.	Open Eclipse IDE.
2.	Create a Java project named LibraryManagementSystem.
3.	Create a package named com.library.
4.	Create the classes Book, Library, and Main.
5.	Add the corresponding Java code to each class.
6.	Save all files.
7.	Right-click Main.java.
8.	Select Run As → Java Application.
9.	Use the Console to enter menu choices and book details.

7. Sample Input and Output
============================
   Library Management System  
==============================
1. Add Book
2. View Books
3. Search Book
4. Issue Book
5. Return Book
6. Remove Book
7. Exit
============================
Enter your choice: 1
Enter Book ID: 101
Enter Book Title: 
core java
Enter Author Name: 
R. Nageswara Rao
Book added successfully.

============================
   Library Management System  
==============================
1. Add Book
2. View Books
3. Search Book
4. Issue Book
5. Return Book
6. Remove Book
7. Exit
============================
Enter your choice: 2

===== All Books =====
Book ID  :101
Title    :core java
Author   :R. Nageswara Rao
Available:true
-----------------------

============================
   Library Management System  
==============================
1. Add Book
2. View Books
3. Search Book
4. Issue Book
5. Return Book
6. Remove Book
7. Exit
============================
Enter your choice: 3

1. Search by ID
2. Search by Title
Enter your choice: 
1
Enter Book ID: 101

===== Book Found =====
Book ID  :101
Title    :core java
Author   :R. Nageswara Rao
Available:true

============================
   Library Management System  
==============================
1. Add Book
2. View Books
3. Search Book
4. Issue Book
5. Return Book
6. Remove Book
7. Exit
============================
Enter your choice: 3

1. Search by ID
2. Search by Title
Enter your choice: 
2
Enter Book Title: 
core java

===== Book found =====
Book ID  :101
Title    :core java
Author   :R. Nageswara Rao
Available:true

============================
   Library Management System  
==============================
1. Add Book
2. View Books
3. Search Book
4. Issue Book
5. Return Book
6. Remove Book
7. Exit
============================
Enter your choice: 4
Enter Book ID to issue: 101
Book issued successfully!

============================
   Library Management System  
==============================
1. Add Book
2. View Books
3. Search Book
4. Issue Book
5. Return Book
6. Remove Book
7. Exit
============================
Enter your choice: 5
Enter Book ID to return: 101
Book return successfully!

============================
   Library Management System  
==============================
1. Add Book
2. View Books
3. Search Book
4. Issue Book
5. Return Book
6. Remove Book
7. Exit
============================
Enter your choice: 6
Enter Book ID to remove: 101
Book removed successfully!

============================
   Library Management System  
==============================
1. Add Book
2. View Books
3. Search Book
4. Issue Book
5. Return Book
6. Remove Book
7. Exit
============================
Enter your choice: 7
Thank you for using Library Management System! 


8. Validation and Error Handling
•	Duplicate book IDs are rejected.
•	A message is displayed if the requested book is not found.
•	Issuing an already issued book is prevented.
•	Returning a book that is already available is handled.
•	Invalid menu choices are handled with an error message.
•	Non-numeric menu input is handled by validating the input.


9. Author Details
Name: Dhanshree Panmand
Project: Library Management System
Internship Task: Week 1 – Task 1

