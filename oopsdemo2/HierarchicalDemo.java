package oopsdemo2;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 10, 2025
* Time   : 9:23:54 AM
* Email  : Virendra.1.Kumar@coforge.com
*/

public class HierarchicalDemo {

	public static void main(String[] args) {
		
		Specialist spObj=new Specialist(1001,"Mary King","NewYork","Cardiologist");
        spObj.display();

        NonSpecialist nspObj=new NonSpecialist(2001,"Navin Kumar","Mumbai");
        nspObj.display();

	}

}
