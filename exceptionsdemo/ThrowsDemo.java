package exceptionsdemo;

/**
 * Author : Virendra.1.Kumar
 * Date   : Jul 12, 2025
 * Time   : 12:22:26 PM
 * Email  : Virendra.1.Kumar@coforge.com
 */

public class ThrowsDemo {

	void Division() throws ArithmeticException
	{
		int a=45,b=0,rs;

		rs = a / b;
		System.out.print("\n\tThe result is : " + rs);  

	}

	public static void main(String[] args) {

		ThrowsDemo T = new ThrowsDemo();
		try
		{
			T.Division();
		}
		catch(ArithmeticException Ex)
		{
			System.err.print("\n\tError : " + Ex.getMessage());
		}
		System.out.print("\n\tEnd of program.");

	}

}
