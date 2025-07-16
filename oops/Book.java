package oops;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 8, 2025
* Time   : 3:13:43 PM
* Email  : Virendra.1.Kumar@coforge.com
*/

/*
 * The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. 
 * To achieve this, you must:
   declare class variables/attributes as private
   provide public get and set methods to access and update the value of a private variable
   
   The get method returns the value of the variable name.

   The set method takes a parameter (newName) and assigns it to the name variable. 
 */


public class Book {
	
	//Properties
	private int bookId;
	private String bookName;
	private float price;
	private String publisher;
	
	// Generate Getters & Setters -> Place a cursor in new blank line --> Right Click
	//  --> Source ---> Generate Getters & Setters --> Select All --> Generate 

	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	void display()
	{
		System.out.println("************* Welcome to Library **************");
	}
		
	float discountPrice()
	{
		return ((this.price)-(this.price*.10f));
	}
	
	//Generate toString() method -- Converts object into string
//	if we comment it out we will get only memory address of the object

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", price=" + price + ", publisher=" + publisher
				+ "]";
	}
	
	
	

}
