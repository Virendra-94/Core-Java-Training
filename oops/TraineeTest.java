package oops;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 9, 2025
* Time   : 11:39:41 AM
* Email  : Virendra.1.Kumar@coforge.com
*/


//Java Program to demonstrate constructor
public class TraineeTest {

	public static void main(String[] args) {
		
		Trainee t1 = new Trainee(); //invokes implicit constructor
		t1.display();
		
		//Invokes Parameterized Constructor
		Trainee t2 = new Trainee(222, "Red Jhonson", "Spring", 7000);
		t2.display();
		
		Trainee t3 = new Trainee(333, "Gavin King", "Hibernate", 6000);
		t3.display();
		
		Trainee t4 = new Trainee(333, "Gavin King", "Hibernate", 6000);
		t4.display();
		
		//We can compare two objects by overriding hashcode and equals method
		if(t3.equals(t4)) {
			System.out.println("Objects t3 and t4 are Equal");
		} else {
			System.out.println("Objects t3 and t4 are Not Equal");
		}

	}

}
