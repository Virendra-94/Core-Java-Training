package exceptionsdemo;

import java.io.IOException;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 12, 2025
* Time   : 12:27:02 PM
* Email  : Virendra.1.Kumar@coforge.com
*/

public class ThrowsExample {

	void myMethod(int a) throws IOException,ArithmeticException
	{
		if(a==1)
			throw new IOException("IO Exception Ocurred");
		else
			throw new ArithmeticException("Arithmetic Exception");
	}
	
	public static void main(String[] args) {
		
ThrowsExample t=new ThrowsExample();
		
		try {
			t.myMethod(1);
		}
		catch(Exception ex)
		{
			System.err.println(ex);
		}

	}

}
