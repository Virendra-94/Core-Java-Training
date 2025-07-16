package oopsdemo2;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 10, 2025
* Time   : 12:14:42 PM
* Email  : Virendra.1.Kumar@coforge.com
*/

public class Book100 {
	
	 String name;
	 int price;
	 
	 //Aggregated
	 Author author;
	 Publisher publisher;
	 
	 public Book100(String name, int price, Author author, Publisher publisher) {
		this.name = name;
		this.price = price;
		this.author = author;
		this.publisher = publisher;
	 }
	 
	 void display()
		{
			System.out.println("*************** Book Details ****************");
			System.out.println("Book Name    : "+name);
		    System.out.println("Book Price   : "+price);
		    
		    System.out.println("------------Author Details----------");
		    System.out.println("Author Name  : "+author.authorName);
		    System.out.println("Author Age   : "+author.age);
		    System.out.println("Author place : "+author.place);
		    
		    System.out.println("------------Publisher Details-------");
		    System.out.println("Publisher Name: "+publisher.name);
		    System.out.println("Publisher ID  : "+publisher.publisherID);
		    System.out.println("Publisher City: "+publisher.city);
		    
		}
	 
	
}
