package oopsdemo2;

import java.util.List;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 10, 2025
* Time   : 12:44:26 PM
* Email  : Virendra.1.Kumar@coforge.com
*/


//Composition Example
public class Library {

	List<Book> books; //Object Reference -- Composition

	//Constructor to initialize books in library
	public Library(List<Book> books) {
		this.books = books;
	}

	//Functionality of Setter and Constructor is same because of that we don't create setter only getter
	//getter() method to getBook in Library
	public List<Book> getBooks() {
		return books;
	}

}
