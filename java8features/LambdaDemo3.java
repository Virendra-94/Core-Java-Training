package java8features;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 16, 2025
* Time   : 10:16:26 AM
* Email  : Virendra.1.Kumar@coforge.com
*/

public class LambdaDemo3 {

	public static void main(String[] args) {
		
		INumericTest isEven = (n) -> (n%2==0);
		INumericTest isNegative = (n) -> (n<0);
		
		System.out.println("7 is Even Number: " + isEven.computeTest(7));
		System.out.println("-55 is Negative Number: " + isNegative.computeTest(-55));
		
		//boolean a =(n) -> (n%2==0); //error - lambda expressions should be stored in instance of FI

	}

}
