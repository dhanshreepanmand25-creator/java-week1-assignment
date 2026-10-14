# Java Collections Challenge

## 1. Project Title

Java Collections Challenge using Java

## 2. Objective

The objective of this project is to understand and implement Java Collections Framework concepts using a console-based Java application. It demonstrates how to store, search, update, remove, and process data using `ArrayList`, `HashMap`, and `Queue`.

## 3. Features Implemented

- Add and display book names using ArrayList.
- Search, update, and remove books.
- Store student IDs and names using HashMap.
- Retrieve and update student details.
- Manage customers using Queue.
- Display the front customer and process customers in FIFO order.
- Accept user input using Scanner.

## 4. Technologies Used

- Programming Language: Java
- IDE: Eclipse
- Concepts: ArrayList, HashMap, Queue, Classes, Methods, Loops, Conditional Statements, and Scanner.

## 5. File Structure

```text
JavaCollectionsChallenge/
├── src/
│   └── com/
│       └── collections/
│           └── Main.java
└── README.md
```

### Class Responsibilities

**Main.java**

- Contains the `main()` method.
- Accepts user input using Scanner.
- Performs ArrayList operations on book names.
- Stores and updates student details using HashMap.
- Processes customer names using Queue.
- Displays the results in the console.

## 6. Steps to Compile and Run

**Using Eclipse IDE**

1. Open Eclipse IDE.
2. Open or create a Java project named `JavaCollectionsChallenge`.
3. Create a package named `com.collections`, if required.
4. Create a Java class named `Main.java`.
5. Add the Java Collections Challenge code.
6. Save the file.
7. Right-click `Main.java`.
8. Select **Run As → Java Application**.
9. Enter the required details in the Console.

## 7. Sample Input and Output

```text
===== ArrayList Challenge =====
Enter first book name: core java
Enter second book name: advanced java
Enter third book name: cpp

Books in ArrayList:
core java
advanced java
cpp

Enter book name to search: cpp
Book found.

Enter book number to update (1-3): 3
Enter new book name: python
Book updated successfully.

Enter book name to remove: advanced java
Book removed successfully.

Final Books:
core java
python

===== HashMap Challenge =====
Enter Student ID: 1
Enter Student Name: Rahul
Enter another Student ID: 2
Enter Student Name: swati

Student Details:
1 : Rahul
2 : swati

Enter Student ID to retrieve: 1
Student Name: Rahul

Enter Student ID to update: 2
Enter new Student Name: 10
Student updated successfully.

===== Queue Challenge =====
Enter first customer name: chaitanya
Enter second customer name: pradip
Enter third customer name: mukesh

Queue: [chaitanya, pradip, mukesh]
Front Customer: chaitanya
Processing Customer: chaitanya
Queue after processing:
[pradip, mukesh]
```

## 8. Key Learning Outcomes

- Understand how ArrayList stores and manages elements.
- Learn how to search, update, and remove list elements.
- Understand HashMap key-value pairs.
- Learn how to retrieve and update student records.
- Understand Queue and FIFO (First In, First Out).
- Improve Java programming and problem-solving skills.

## 9. Author Details

**Name:** Dhanshree Panmand

**Project:** Java Collections Challenge

**Internship Task:** Week 1 – Task 3