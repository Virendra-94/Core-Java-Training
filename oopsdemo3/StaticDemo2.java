package oopsdemo3;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 11, 2025
* Time   : 10:17:26 AM
* Email  : Virendra.1.Kumar@coforge.com
*/

public class StaticDemo2 {

	public static void main(String[] args) {
		Student.collegeChange();
		
		Student s1 = new Student(101, "Mike");
		Student s2 = new Student(102, "Jhon");
		Student s3 = new Student(103, "Mary");
		
		s1.display();
		s2.display();
		s3.display();
	}
}
