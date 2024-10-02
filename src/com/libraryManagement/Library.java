package com.libraryManagement;

import java.util.Scanner;

public class Library {
	Scanner input=new  Scanner(System.in);
	Repository repo=new Repository();
    
    public void addBook()
    {
    	System.out.println("enter the Book Name :");
		String b1=input.nextLine();
    	
		System.out.println("enter the Author Name :");
		String b2=input.nextLine();
		
		System.out.println("enter the id  :");
		int b3=input.nextInt();
		input.nextLine();
		
		Book b = new Book(b1,b2,b3, false);
		
		repo.save(b);
		
		
    	System.out.println("Book added in the Library");
    	
    	
    }

	public void BookList()
    {
    	repo.getAllBooks();
    	System.out.println(); 
    	System.out.println();
    	System.out.println();
    }
		public void showBorrowedMembers() {
		repo.showBorrowedMembers();
		System.out.println(); 
		
	}

	public void issueBook1(String bookTitle, Memberr memberr) {
		repo.issueBook(bookTitle, memberr);
		System.out.println(); 
	}
	public void returnBook1(String bookTitle, Memberr member) {
		repo.returnBook(bookTitle, member);
		System.out.println(); 

	}
}


