package oops;

import java.util.Scanner;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 8, 2025
* Time   : 12:31:00 PM
* Email  : Virendra.1.Kumar@coforge.com
* 
* Program to create a instance class & define state & Behavior of an Employee
*/
// Instance Class - Encapsulation
public class Student {
	
	//Define properties/state/attributes
	private int rollNumber;
	private String firstName, lastName;
	private float[] marks = new float[5];
	private float total;
	
	Scanner scanner = new Scanner(System.in);
	
	
	//Define methods/behavior/actions
	public void inputStudentDetails() {
		System.out.println("Enter Roll Number of a Student: ");
		rollNumber = scanner.nextInt();
		System.out.println("Enter First Name & Last Name of a Student: ");
		firstName = scanner.next();
		lastName = scanner.next();
		
		System.out.println("Enter Marks of 5 Subjects: ");
		for(int i=0; i<marks.length; i++) {
			marks[i] = scanner.nextFloat();
		}
	}
	
	//Method with float as return type
	public float calculateTotalMarks() {
		
		for(int i=0; i<marks.length; i++) {
			total += marks[i];
		}
		return total;
		
	}
	
	public void displayStudentDetails() {
		
		System.out.println("********Student Result Information********");
		System.out.println("Roll Number  : " + rollNumber);
		System.out.println("Student Name : " + firstName + " " + lastName);
		System.out.println("Total Marks  : " + total);
		System.out.println("*******************************************");
		
	}

}
