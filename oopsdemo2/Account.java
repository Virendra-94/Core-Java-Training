package oopsdemo2;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 9, 2025
* Time   : 4:24:13 PM
* Email  : Virendra.1.Kumar@coforge.com
*/

public class Account {

	//Multilevel Inheritance
	int accNo;
	String name;
    
	
  
   public Account(int accNo, String name) {
		this.accNo = accNo;
		this.name = name;
	}


  	void display()
	{
		System.out.println("************ Account Details ************");
		System.out.println("Account Number :"+accNo);
		System.out.println("Customer Name :"+name);
	}
}
