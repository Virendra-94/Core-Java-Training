package exceptionsdemo;

/**
 * Author : Virendra.1.Kumar
 * Date   : Jul 12, 2025
 * Time   : 12:11:29 PM
 * Email  : Virendra.1.Kumar@coforge.com
 */

public class ThrowDemo {

	public static void hello(int a) {
		if(a==0) {
			throw new ArithmeticException("Pass Non Zero Values");//exception thrown manually
		}
		else
			System.out.println(a);

	}
	public static void main(String[] args) {

		hello(100);
		hello(0);

	}

}
