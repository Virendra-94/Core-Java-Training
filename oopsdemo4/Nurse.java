package oopsdemo4;

/**
 * Author : Virendra.1.Kumar
 * Date   : Jul 11, 2025
 * Time   : 12:48:07 PM
 * Email  : Virendra.1.Kumar@coforge.com
 */

//Concrete Subclass for Nurse
public class Nurse extends HospitalStaff {

	private int patientLoad;

	public Nurse(String name, String id, String department, int patientLoad) {
		super(name, id, department);
		this.patientLoad = patientLoad;
	}

	@Override
	public void performDuties() {
		System.out.println(getName() + " is caring for " + patientLoad + 
				" patients in the " + getDepartment() + " department.");
	}

	public void administerMedication() {
		System.out.println(getName() + " is administering medication to patients.");
	}

}
