package oopsdemo4;

import java.util.Scanner;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 11, 2025
* Time   : 2:42:05 PM
* Email  : Virendra.1.Kumar@coforge.com
*/

//Program to design Calculator from Interface
public class SamsungCalculator implements ICalculator{

	Scanner kb;

	@Override
	public void add() {
		kb = new Scanner(System.in);
        System.out.println("Enter any two integer values to perform addition");
        int a=kb.nextInt();
        int b=kb.nextInt();
        int s=a+b;
        System.out.println("Sum of "+a+" and "+b+" is "+s);	
	}

	@Override
	public void sub() {
		kb = new Scanner(System.in);
        System.out.println("Enter any two integer values to perform Subtraction");
        int a=kb.nextInt();
        int b=kb.nextInt();
        int s=a-b;
        System.out.println("SUbtraction of "+a+" and "+b+" is "+s);
		
	}

	@Override
	public void mul() {
		kb = new Scanner(System.in);
        System.out.println("Enter any two integer values to perform Multiplication");
        int a=kb.nextInt();
        int b=kb.nextInt();
        int s=a*b;
        System.out.println("Mul of "+a+" and "+b+" is "+s);
        
		
	}

	@Override
	public void div() {
		System.out.println("Enter any two integer values to perform Division");
        int a=kb.nextInt();
        int b=kb.nextInt();
        int s=a/b;
        System.out.println("Div of "+a+" and "+b+" is "+s);	
	}
	
	 public void display() {
			System.out.println("My Calculator - Designed by Virendra");
		}
	
}
