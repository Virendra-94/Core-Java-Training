package oops;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 9, 2025
* Time   : 11:54:46 AM
* Email  : Virendra.1.Kumar@coforge.com
*/

public class ComplexTest {

	public static void main(String[] args) {
		Complex c1 = new Complex(10.3, 67.4); //invokes constructor
		Complex c2 = new Complex(0.7, 3.6);
		Complex c3 = new Complex(1.0, 1.0);

		c1.add(c2); //Calls method add() by passing object c2
		System.out.println("The Addition of 2 Complex Number is: ");
		c1.display();
		
		c1.add(c3);
		System.out.println("The Addition of 2 Complex Number is: ");
		c1.display();
		
	}

}
