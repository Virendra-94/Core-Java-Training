package exceptionsdemo;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 12, 2025
* Time   : 10:44:43 AM
* Email  : Virendra.1.Kumar@coforge.com
*/

public class ExceptionDemo {

	public static void main(String[] args) {
		
		//General Exception Handling

		String languages[] = { "C", "C++", "Java", "Perl", "Python" };
			
			try
			{
				for(int i=0;i<=5;i++)
				{
					System.out.println(languages[i]);
				}
			}
			catch(Exception ex)
			{
				System.err.println(ex); //Instead of out use err object 
			}
	}

}
