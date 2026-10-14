# Banking Application

## 1. Project Title

Banking Application using Java

## 2. Objective

The objective of this project is to develop a console-based Banking Application using Java. It allows users to perform basic banking operations such as depositing money, withdrawing money, and checking their account balance. The project demonstrates Java programming concepts, input validation, and exception handling.

## 3. Features Implemented

- Deposit money into the account.
- Withdraw money from the account.
- Check the current account balance.
- Display appropriate success and error messages.
- Prevent withdrawals when the balance is insufficient.
- Validate user input and handle exceptions.
- Provide a menu-driven interface to perform banking operations.

## 4. Technologies Used

- Programming Language: Java
- IDE: Eclipse
- Concepts: Classes, Objects, Constructors, Methods, Loops, Conditional Statements, Scanner, Exception Handling, and Input Validation.

## 5. File Structure

```text
BankingApplication/
├── src/
│   └── com/
│       └── banking/
│           ├── BankAccount.java
│           ├── BankingApp.java
│           └── Main.java
└── README.md
```

### Class Responsibilities

**BankAccount.java**

- Represents a bank account.
- Manages the account balance.
- Handles deposit and withdrawal operations.

**BankingApp.java**

- Manages the banking application logic.
- Coordinates banking operations.
- Displays appropriate transaction messages.

**Main.java**

- Contains the `main()` method.
- Starts the application.
- Allows users to access the banking menu.

## 6. Steps to Compile and Run

**Using Eclipse IDE**

1. Open Eclipse IDE.
2. Open or create a Java project named `BankingApplication`.
3. Create a package named `com.banking`, if required.
4. Create the three Java classes: `BankAccount.java`, `BankingApp.java`, and `Main.java`.
5. Add the corresponding Java code.
6. Save all files.
7. Right-click `Main.java`.
8. Select **Run As → Java Application**.
9. Use the Console to enter menu choices and amounts.

## 7. Sample Input and Output

```text
=====================
   Banking Application 
=====================
1.Deposit
2.Withdraw
3.Balance Inquiry
4.Exit
=====================
Enter your choice :
1
Enter amount to deposit: 2000
Amount deposited successfully.
Current Balance2000.0

=====================
   Banking Application 
=====================
1.Deposit
2.Withdraw
3.Balance Inquiry
4.Exit
=====================
Enter your choice :
2
Enter amount to withdraw: 100
Amount withdrawn is successfully.
Current Balance: 1900.0

=====================
   Banking Application 
=====================
1.Deposit
2.Withdraw
3.Balance Inquiry
4.Exit
=====================
Enter your choice :
3
Current Balance: 1900.00

=====================
   Banking Application 
=====================
1.Deposit
2.Withdraw
3.Balance Inquiry
4.Exit
=====================
Enter your choice :
4
Thank you for using Banking Application.

```

## 8. Validation and Error Handling

- Reject invalid or non-numeric input.
- Prevent withdrawals when the balance is insufficient.
- Validate deposit and withdrawal amounts.
- Display appropriate messages for invalid operations.
- Handle exceptions to prevent unexpected program termination.

## 9. Author Details

**Name:** Dhanshree Panmand

**Project:** Banking Application

**Internship Task:** Week 1 – Task 2
