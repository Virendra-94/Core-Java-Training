package oops;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 8, 2025
* Time   : 12:55:15 PM
* Email  : Virendra.1.Kumar@coforge.com
*/

public class StudentTest {

	public static void main(String[] args) {
		
		//Create Student Objects
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		//Invoke Instance class method using dot operator
		s1.inputStudentDetails();
		s2.inputStudentDetails();
		s3.inputStudentDetails();
		
		float tot1 = s1.calculateTotalMarks();
		float tot2 = s2.calculateTotalMarks();
		float tot3 = s3.calculateTotalMarks();
		
		s1.displayStudentDetails();
		System.out.println("Display Total Marks returned to Main: " + tot1);
		s2.displayStudentDetails();
		System.out.println("Display Total Marks returned to Main: " + tot2);
		s3.displayStudentDetails();
		System.out.println("Display Total Marks returned to Main: " + tot3);
		

	}

}
