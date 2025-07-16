package exceptionsdemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 12, 2025
* Time   : 10:59:52 AM
* Email  : Virendra.1.Kumar@coforge.com
*/

public class MultipleCatchDemo2 {

	public static void main(String[] args) throws IOException {
		
		try
		{
			BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
			int a, b, c;
			
			System.out.println ("Enter Any 2 Numbers");
			a = Integer.parseInt (br.readLine());
			b = Integer.parseInt (br.readLine());
			System.out.println("Enter your Name : ");
			String name=br.readLine();
			
			c = a / b;
			
			System.out.println ("C VALUE = " + c);
			System.out.println("Thank You "+name);
		}
		catch (NumberFormatException nfe)
		{
			System.out.println ("please pass only integer values "+nfe);
		}
		catch (ArithmeticException ae)
		{
			System.out.println ("please dont pass the second value as 0" +ae);
		}

	}

}
