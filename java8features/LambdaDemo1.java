package java8features;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 16, 2025
* Time   : 9:55:02 AM
* Email  : Virendra.1.Kumar@coforge.com
*/

@FunctionalInterface
interface MyFI{
	public String sayHello(); //by default abstract
	//public String sayHello1(); // Give error because in FI we can only create one abstract method
}

public class LambdaDemo1 {
 
	public static void main(String[] args) {
		
		MyFI msg = () -> {return "Hello World";}; //lambda expression
		
		System.out.println(msg.sayHello());

	}

}
