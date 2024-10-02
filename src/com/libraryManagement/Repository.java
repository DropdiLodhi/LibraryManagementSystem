package com.libraryManagement;

import java.util.*;

public class Repository {

	ArrayList<Book> books = new ArrayList<>();
	ArrayList<Memberr> borrowedMembers = new ArrayList<>();

	public void save(Book book) {
		books.add(book);
	}

	public void save(Memberr mem) {
		borrowedMembers.add(mem);
	}

	public void getAllBooks() {
		for (Book b : books) {

			if (books.isEmpty()) {
				System.out.println("No books available in the Library");
			} else {
				System.out.println(b);
			}
		}
	}
 //create issue book
	public void issueBook(String bookTitle, Memberr member) {
		for (Book book : books) {
			if (book.title.equals(bookTitle) && !book.isIssued) {
				book.isIssued = true;
				borrowedMembers.add(member);
				//System.out.println(member.name + " borrowed " + bookTitle);
				System.out.println("Book is successfully issued to tha name of "+member.name+" and the name of book is "+bookTitle);
				return;
			}
		}
		System.out.println("Book is either not available ...");
	}
	//return book
	public void returnBook(String bookTitle, Memberr member) {
		for (Book book : books) {
			if (book.title.equals(bookTitle) && book.isIssued) {
				book.isIssued = false;
				borrowedMembers.remove(member);
				System.out.println(member.name + " returned " + bookTitle);
				return;
			}
		}
		System.out.println("Book is either not issued or available ...");
	}

	//create  the members who have borrowed books
	public void showBorrowedMembers() {
		if (borrowedMembers.isEmpty()) {
			System.out.println("No books have been borrowed.");
		} else {
			System.out.println("Members who have borrowed books:");
			for (Memberr member : borrowedMembers) {
				System.out.println(member.name);
			}
		}
		
	}
	
}
