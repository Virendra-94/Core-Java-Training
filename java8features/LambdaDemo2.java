package java8features;

/**
 * Author : Virendra.1.Kumar
 * Date   : Jul 16, 2025
 * Time   : 10:08:42 AM
 * Email  : Virendra.1.Kumar@coforge.com
 */

public class LambdaDemo2 {

	public static void main(String[] args) {

		IAddition op1=(a,b) -> (a+b); // lambda expression
		//int c=(a,b) -> (a+b); 							// invoke lambda expression
		System.out.println("Addition of 2 Nos is : "+op1.calculate(200, 155));

		IAddition op2=(a,b) -> (a-b);
		System.out.println("Subtraction of 2 Nos is : "+op2.calculate(200, 155));

		IAddition op3=(a,b) -> (a*b);
		System.out.println("Multiplication of 2 Nos is : "+op3.calculate(200, 155));

		IAddition op4=(int a,int b) -> (a/b);
		System.out.println("Division of 2 Nos is : "+op4.calculate(200, 155));

		// lambda expression with single parameter with no parenthesis
		IMyString myName1 = name -> { return "Hello "+name;};

		System.out.println(myName1.myStringFunction("James Gosling"));

	}

}
