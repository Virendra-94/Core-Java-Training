package oops;

import java.util.Objects;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 9, 2025
* Time   : 11:34:47 AM
* Email  : Virendra.1.Kumar@coforge.com
*/

public class Trainee {
	
	private int id;
	private String name,tech;
	private double stipend;
	
	public Trainee() {
		 System.out.println("Implicit Constructor");
			
			this.id=111;
			this.name="James Gosling";
			this.tech="Java";
			this.stipend=5000;
	}

	public Trainee(int id, String name, String tech, double stipend) {
		this.id = id;
		this.name = name;
		this.tech = tech;
		this.stipend = stipend;
	}
	
    void display()
	{
		System.out.println("********** Trainee Details ***************");
		System.out.println(this.id+" "+this.name+" "+this.tech+" "+this.stipend);
		System.out.println("------------------------------------------");
	}

    //Source -> Generate Hascode -> Select All -> Generate
    //check object memory reference
	@Override
	public int hashCode() {
		return Objects.hash(id, name, stipend, tech);
	}
	
	//Check all the values of objects are equals or not
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trainee other = (Trainee) obj;
		return id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(stipend) == Double.doubleToLongBits(other.stipend)
				&& Objects.equals(tech, other.tech);
	}
    
    
	
}
