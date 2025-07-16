package oopsdemo3;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 11, 2025
* Time   : 10:25:26 AM
* Email  : Virendra.1.Kumar@coforge.com
*/

//Final Variable- Variable content cannot be modified
//* Final method - A final method cannot be overridden
//* Final class - Cannot extend a Final class

final class Demo{
	final void display() {
		System.out.println("Hello World");
	}
}

//Final class can not be extended
//class MyDemo extends Demo{
//	void display() { //Final Method cannot be overridden
//		System.out.println("Final Variables");
//	}
//}

public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int AGE = 20;
		//AGE = 25 //Final Variables can not be modified
	}

}
