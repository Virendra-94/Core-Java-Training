package oopsdemo3;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 11, 2025
* Time   : 10:14:23 AM
* Email  : Virendra.1.Kumar@coforge.com
*/

public class Student {

	private int rollNo;
	private String name;
	private static String college = "UPES"; //Static Variable
	
	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	
	 public static void collegeChange(){ //static Method
	        college="VTU";
	    }
	 
	public void display(){
        System.out.println(this.rollNo+" "+this.name+" "+college);
	}
	
}
