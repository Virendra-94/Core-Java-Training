package oopsdemo4;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 11, 2025
* Time   : 11:47:09 AM
* Email  : Virendra.1.Kumar@coforge.com
*/

public class Marks extends Trainee{

	private double marks;

	public Marks(String name, String address, int number, double marks) {
		super(name, address, number);
		this.marks = marks;
	}

	@Override
	public double calculateMarks() {
		System.out.println("Calculate Marks: ");
		return (marks*2);
	}
	
	
}
