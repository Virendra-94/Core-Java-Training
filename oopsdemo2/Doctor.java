package oopsdemo2;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 10, 2025
* Time   : 9:18:46 AM
* Email  : Virendra.1.Kumar@coforge.com
*/

//Java Program to demonstrate Hierarchical Inheritanc
public class Doctor {
	
	 private int idNumber;
	 private String name,address;
	 
	 
	 public Doctor(int idNumber, String name, String address) {
		this.idNumber = idNumber;
		this.name = name;
		this.address = address;
	 }
	 
	   
     public void display() {
        System.out.println("******** Doctor Details ***********");
        System.out.println("The Doctor Id is   : "+idNumber);
        System.out.println("The Doctor Name is : "+name);
        System.out.println("The Doctor City is : "+address);
    }
	 
	 
}

class Specialist extends Doctor{
	private String speciality;

	public Specialist(int idNumber, String name, String address, String speciality) {
		super(idNumber, name, address);
		this.speciality = speciality;
	}
	
	 public void display(){
	        super.display();
	        System.out.println("The Speciality is : "+speciality);
	    }
}


class NonSpecialist extends Doctor{

	public NonSpecialist(int idNumber, String name, String address) {
		super(idNumber, name, address);
	}
	
	
	
}