package oopsdemo2;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 9, 2025
* Time   : 3:03:45 PM
* Email  : Virendra.1.Kumar@coforge.com
*/

//Single Inheritance Example
//Parent Class
public class Customer {

	private String name;
	private String email;
	
	//Generate Constructor
	public Customer(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	public void display(){
        System.out.println("********** Customer Details ************");
        System.out.println("Customer Name    : "+name);
        System.out.println("Email            : "+email);
    }
	
}
