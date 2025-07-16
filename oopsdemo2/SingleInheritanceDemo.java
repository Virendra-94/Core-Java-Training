package oopsdemo2;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 9, 2025
* Time   : 2:50:14 PM
* Email  : Virendra.1.Kumar@coforge.com
*/

public class SingleInheritanceDemo {

	public static void main(String[] args) {
		
		//Create Objects of Child Class
		Developer d1 = new Developer(849, "Virendra", "Java - FullStack"); //Invoke Derived Class Constructor
		d1.display();
		d1.display1();
		
		Developer d2 = new Developer(105, "Rod Jhonson", "Spring Framework");
		d2.display(); //Child Class Object Invokes Parent Class Method - Inheritance
		d2.display1(); //Child Class Object Invokes Parent Class Method - Inheritance
		
		Employee e1 = new Employee(106, "Mike");
		e1.display();

	}

}
