package oops;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 8, 2025
* Time   : 2:43:37 PM
* Email  : Virendra.1.Kumar@coforge.com
*/

public class CoforgeEmployeeTest {

	public static void main(String[] args) {
		
		//main class to test Employee class methods

		// create Objects e1,e2,e3 of Employee Class
				Employee e1=new Employee(); // invoke default constructor 
				Employee e2=new Employee();
				Employee e3=new Employee();
				
						
				//invoke Methods (Method call)
				e1.inputEmployeeDetails(); // p1.eat();
				e1.calculateNetSalary();
				e1.displayEmployeeDetails();
				
				e2.inputEmployeeDetails();
				e2.calculateNetSalary();
				e2.displayEmployeeDetails();
				
				e3.inputEmployeeDetails();
				e3.calculateNetSalary();
				e3.displayEmployeeDetails();

	}

}
