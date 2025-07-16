package oopsdemo2;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 10, 2025
* Time   : 10:10:52 AM
* Email  : Virendra.1.Kumar@coforge.com
*/

public class Student {
	int rollNo;
	String name;
	
	Address ad;

	public Student(int rollNo, String name, Address ad) {
		this.rollNo = rollNo;
		this.name = name;
		this.ad = ad;
	}
	
	void display()
	{
			System.out.println("---------- Student Details ------------");
			System.out.println("Student Id   :"+rollNo );
			System.out.println("Student Name :"+name);
			
		System.out.println("Address: "+ad.city+" "+ad.state+" "+ad.country+" "+ad.pincode);
	}
	
	
}
