package exceptionsdemo;

/**
 * Author : Virendra.1.Kumar
 * Date   : Jul 12, 2025
 * Time   : 12:18:31 PM
 * Email  : Virendra.1.Kumar@coforge.com
 */

public class ThrowExample {

	public static void checkEligibility(int age,int weight)
	{
		if(age < 12 || weight <40)
		{
			throw new ArithmeticException("Student is Not Eligible for Registration");
		}
		else
		{
			System.out.println("Student with age :"+age+ " and with Weight "+weight+" is Eligible");
		}
	}

	public static void main(String[] args) {

		System.out.println("Welcome to Sports Eligibility Process..");
		checkEligibility(20,45);
		System.out.println("Thank You");
		checkEligibility(10,44);

	}

}
