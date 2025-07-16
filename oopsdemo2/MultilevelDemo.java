package oopsdemo2;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 9, 2025
* Time   : 4:10:02 PM
* Email  : Virendra.1.Kumar@coforge.com
*/

public class MultilevelDemo {

	public static void main(String[] args) {
		
        Director d1=new Director(101,"Keane",5000);
		
		System.out.println("*********** Director Details ***********");
		d1.display(); // staff
		d1.getHRA();  // staff
		d1.getDA();  // manager
		d1.getTA();  // director
		d1.getGross();  //director
		
		Manager m1=new Manager(201,"Mary",4000);
		
		System.out.println("*********** Manager Details ***********");
		m1.display();
		m1.getHRA();
		m1.getDA();
		m1.getGross();
		
		Staff s1=new Staff(301,"Helen",2000);
		System.out.println("*********** Staff Details ***********");
		s1.display();
		s1.getHRA();
		s1.print();

	}

}
