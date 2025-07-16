package oopsdemo4;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 11, 2025
* Time   : 4:02:12 PM
* Email  : Virendra.1.Kumar@coforge.com
*/

public class College {

	String name;
	int id;
	String university;
	String course;
	
	//Generates Constructor
	public College(String name, int id, String university, String course) {
		this.name = name;
		this.id = id;
		this.university = university;
		this.course = course;
	}

	//Generate Getters
	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String getUniversity() {
		return university;
	}

	public String getCourse() {
		return course;
	}
	

	
	
	
}
