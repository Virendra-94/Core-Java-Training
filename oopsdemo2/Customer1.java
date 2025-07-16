package oopsdemo2;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 10, 2025
* Time   : 9:26:45 AM
* Email  : Virendra.1.Kumar@coforge.com
*/

public class Customer1 {

	//Hierarchical Inheritance Demo

	private String name;
	private String email;
	
	
	public Customer1(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	public void display(){
        System.out.println("********** Customer Details ************");
        System.out.println("Customer Name    : "+name);
        System.out.println("Email            : "+email);
    }
	
	
}
