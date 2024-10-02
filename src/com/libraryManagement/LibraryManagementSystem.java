package com.libraryManagement;

import java.util.Scanner;

public class LibraryManagementSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Library li = new Library();

		int choice;

		do {
			System.out.println("Welcome to Library Management System........");
			System.out.println("1. Add Book");
			System.out.println("2. To get all Books");
			System.out.println("3. Isssue book");
			System.out.println("4. Exit");

			System.out.println("Select your option :");

			choice = sc.nextInt();
			sc.nextLine();

			if (choice == 1) {
				li.addBook();
			} else if (choice == 2) {
				li.BookList();
			} else if (choice == 3) {
				break;
			} else {
				System.out.println("Name is not match from Book");
			}

		} while (true);
		while (true) {
			System.out.println("1. Issue Book");
			System.out.println("2. Return Book");
			System.out.println("3. Show Borrowed Members");
			System.out.println("4. Exit");
			System.out.print("Choose an option: ");
			int option = sc.nextInt();
			sc.nextLine(); // Consume newline

			if (option == 1) {
				System.out.println("Enter Member Name: ");
				String memberName = sc.nextLine();
				System.out.println("Enter Book Title: ");
				String bookTitle = sc.nextLine();
				li.issueBook1(bookTitle, new Memberr(memberName));
			} else if (option == 2) {
				System.out.println("Enter Member Name: ");
				String memberName = sc.nextLine();
				System.out.println("Enter Book Title: ");
				String bookTitle = sc.nextLine();
				li.returnBook1(bookTitle, new Memberr(memberName));
			} else if (option == 3) {

				li.showBorrowedMembers();
			} else if (option == 4) {
				System.out.println("Exiting...");
				sc.close();
				return;
			} else {
				System.out.println("Invalid option, please try again.");
			}
		}
	}

}
