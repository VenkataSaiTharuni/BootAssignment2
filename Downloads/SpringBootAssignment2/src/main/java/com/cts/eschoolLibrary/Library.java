package com.cts.eschoolLibrary;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Library {
	
	@Autowired
	private Book book;
	
	List<Book> books= new ArrayList<Book>();
	
	public void displayBookDetails() {
		System.out.println("\n\n>>The title of the book is: "+book.getTitle()+"  "
				+ "and the author is :"+book.getAuthor());
	}
	

}
