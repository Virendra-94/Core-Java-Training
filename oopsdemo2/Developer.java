package oopsdemo2;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 9, 2025
* Time   : 2:43:57 PM
* Email  : Virendra.1.Kumar@coforge.com
*/

//Child Class - Inheritance - Is A Relationship
public class Developer extends Employee {
	
	String technology;

	public Developer(int empId, String name, String tech) {
		super(empId, name); //Invokes Base Class Constructor
		this.technology=tech;
	}
	
	void display1() {
		System.out.println("Technology Used: " + technology);
	}
	
}
