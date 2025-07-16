package oopsdemo2;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 9, 2025
* Time   : 2:41:31 PM
* Email  : Virendra.1.Kumar@coforge.com
*/

//Single Inheritance Example
public class Employee { //Parent Class/Base Class/Super Class
	private int empId;
	private String Name;
	
	
	//Generate Constructor Using Fields
	public Employee(int empId, String name) {
		this.empId = empId;
		Name = name;
	}
	
	void display()
	{
		System.out.println("********** Employee Details ***************");
		System.out.println("Employee Id :"+empId);
		System.out.println("Employee Name: "+Name);
	} 
}
