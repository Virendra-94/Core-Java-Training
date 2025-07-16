package oopsdemo3;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 11, 2025
* Time   : 10:03:32 AM
* Email  : Virendra.1.Kumar@coforge.com
*/

class Count{
	
	private static int cnt; //Static Variable
	private int a; //Instance Variable
	
	Count()
	{
		cnt++;
		a=100;
	}
	
	//Static Method - It can use only static variables
	public static void display() {
		System.out.println("The Number of Objects Created: "+cnt);
		//a = a + 10;
	}
	
	public void print() {
		System.out.println("instance Method Variable: "+a);
	}
}

public class StaticDemo {

	public static void main(String[] args) {
		
		Count c1 = new Count();
		Count c2 = new Count();
		Count c3 = new Count();
		
		c1.print(); //Invokes Instance Method
		Count.display(); //Invoke Static Method
	}

}
