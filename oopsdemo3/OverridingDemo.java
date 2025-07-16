package oopsdemo3;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 10, 2025
* Time   : 3:52:53 PM
* Email  : Virendra.1.Kumar@coforge.com
*/
class Bank{
	private String name;
	
	Bank(String name){
		this.name = name;
	}
	
	int getRateOfInterest() {
		return 0;
	}
	
	void display() {
		System.out.println("Welcome to " + name +"Bank");
	}
}


class SBI extends Bank{
	
	
	
	SBI(String name) {
		super(name);
	}

	int getRateOfInterest() { //Overridden Method
		return 5;
	}
}

class ICICI extends Bank{
	
	
	
	ICICI(String name) {
		super(name);
	}

	int getRateOfInterest() {//Method OVerridden in Child Class
		return 7;
	}
}

class Axis extends Bank{
	
	Axis(String name) {
		super(name);
	}

	int getRateOfInterest() { //Method OVerridden in Child Class
		return 6;
	}
}

public class OverridingDemo {

	public static void main(String[] args) {
		SBI sbiBank=new SBI("SBI");
        ICICI iciciBank=new ICICI("ICICI");
        Axis axisBank=new Axis("Axis");

        sbiBank.display();
        System.out.println("The Interest Rate of SBI is : "+sbiBank.getRateOfInterest()); // invoke overridden method

        iciciBank.display();
        System.out.println("The Interest Rate of ICICI is : "+iciciBank.getRateOfInterest());

        axisBank.display();
        System.out.println("The Interest Rate of Axis is : "+axisBank.getRateOfInterest());
	}
}
