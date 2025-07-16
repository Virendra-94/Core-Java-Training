package oopsdemo4;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 11, 2025
* Time   : 12:39:02 PM
* Email  : Virendra.1.Kumar@coforge.com
*/

//Abstract class representing a general Hospital Staff member

public abstract class HospitalStaff {

	private String name;
    private String id;
    private String department;
    
	public HospitalStaff(String name, String id, String department) {
		this.name = name;
		this.id = id;
		this.department = department;
	}
    
	 // Abstract method - must be implemented by subclasses
    public abstract void performDuties();

    // Concrete method - shared by all subclasses
    public void attendMeeting() {
        System.out.println(name + " is attending a hospital meeting.");
    }

    //Generate Getters
	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public String getDepartment() {
		return department;
	}
    
	
    
}
