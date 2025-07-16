package oops;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 9, 2025
* Time   : 10:18:55 AM
* Email  : Virendra.1.Kumar@coforge.com
*/

public class ThisDemo {
	
	int age;
	
	//instance method
	//this keyword is used in instance method to access object
	void init(int age) {
		this.age = age; // this keyword refers to the current object which invokes the method
	}
	
	public static void main(String[] args) {
		
		ThisDemo td1 = new ThisDemo();
		td1.init(20);
		
		System.out.println("The Value of age is : "+td1.age);
		
		ThisDemo td2 = new ThisDemo();
		td2.init(33);
      		
		System.out.println("The Value of age is : "+td2.age);

	}
}
