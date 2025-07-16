package exceptionsdemo;

import java.util.Scanner;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 12, 2025
* Time   : 10:30:27 AM
* Email  : Virendra.1.Kumar@coforge.com
*/

//program to perform division of 2 nos without exception handling
public class DivisionDemo {

	public static void main(String[] args) {
		 int a, b, result;
		 Scanner input = new Scanner(System.in);
		 
		  System.out.println("Input two integers");
		  a = input.nextInt();
		  b = input.nextInt();  // enter 0
		  
		 try { //Statements to be monitored which may throw exceptions
			 result = a / b;
			 System.out.println("Result = "+result);
		 }
		 catch(ArithmeticException e){ //Exception thrown is handled in catch block
			 System.err.println("Divide by zero Error - Enter non-zero value");
			 System.err.println("Exception Description: "+e.getMessage());
			 System.err.println("Exception Name & Description: "+e.toString());
			 //Details about exception Name, Description, Line Number of the code which generated Exception
			 e.printStackTrace();
		 }
		 finally //Cleanup Operations
		 {
			 input.close();
			 System.out.println("In Finally Block - Program Execution ended");
		 }
	}

}
