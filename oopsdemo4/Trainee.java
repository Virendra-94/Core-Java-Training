package oopsdemo4;

/**
 * Author : Virendra.1.Kumar
 * Date   : Jul 11, 2025
 * Time   : 11:43:43 AM
 * Email  : Virendra.1.Kumar@coforge.com
 */

public abstract class Trainee {

	private String name;
	private String address;
	private int number;
	public Trainee(String name, String address, int number) {
		this.name = name;
		this.address = address;
		this.number = number;
	}

	//Abstract Method Declaration - must be overridden in the derived class
	public abstract double calculateMarks();

	void show()
	{
		System.out.println("Display Marks for :" +this.name+ " "+this.address);
	}

	@Override
	public String toString() {
		return "Trainee [name=" + name + ", address=" + address + ", number=" + number + "]";
	}
	
	
}
