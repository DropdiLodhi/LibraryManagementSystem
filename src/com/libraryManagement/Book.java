package com.libraryManagement;

public class Book {
	String title;   // instance variable
	String author;
	int id;
	boolean isIssued;


	public Book(String title, String author, int id,boolean isIssued) {
		this.title = title;
		this.author = author;
		this.id = id;
		this.isIssued=false;
		
	}

	@Override
	public String toString() {
		return "Book [tital=" + title + ", author=" + author + ", id=" + id +  "]";
	}
}
