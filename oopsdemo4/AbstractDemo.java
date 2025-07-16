package oopsdemo4;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 11, 2025
* Time   : 11:53:50 AM
* Email  : Virendra.1.Kumar@coforge.com
*/

public class AbstractDemo {

	public static void main(String[] args) {
		
		Trainee t1 = new Marks("Jhon", "New York", 1001, 35);
		
		t1.show(); //invoke abstract class method
		double marks = t1.calculateMarks(); //invoke sub classs method
		System.out.println(t1 + " " + marks);

	}

}
