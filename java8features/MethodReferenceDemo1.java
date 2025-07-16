package java8features;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 16, 2025
* Time   : 10:39:42 AM
* Email  : Virendra.1.Kumar@coforge.com
*/

//Method Reference - Shorthand of Lambda expression to call method
@FunctionalInterface
interface IMyInterface{
	void myMethod(int a);
}

class Test{
	void display(int x) {//instance method
		System.out.println("I am a instance Method "+x);
	}
}

public class MethodReferenceDemo1 {

	public static void main(String[] args) {
		
		//Traditional approach
		Test t1 = new Test();
		t1.display(100);
		
		//Java8 Method Reference approach
		IMyInterface m1ref = t1::display; //method reference to instance method of Object
		
		//Calling method of FI
		m1ref.myMethod(200);
		
		//Lambda ---> FI
		//MR ---> shorthand of Lambda
		//MR --> FI

	}

}
