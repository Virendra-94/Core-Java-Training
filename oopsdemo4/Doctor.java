package oopsdemo4;

/**
 * Author : Virendra.1.Kumar
 * Date   : Jul 11, 2025
 * Time   : 12:43:54 PM
 * Email  : Virendra.1.Kumar@coforge.com
 */

//Concrete Subclass for Doctors
public class Doctor extends HospitalStaff{

	private String specialization;

	public Doctor(String name, String id, String department, String speciliaztion) {
		super(name, id, department);
		this.specialization = speciliaztion;
	}

	@Override
	public void performDuties() {
		System.out.println(getName() + " is examining patients in the " + 
				getDepartment() + " department (" + specialization + ").");

	}

	public void prescribeMedication() {
		System.out.println(getName() + " is writing a prescription.");
	}


}
