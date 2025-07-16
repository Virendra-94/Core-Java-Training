package oops;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 9, 2025
* Time   : 11:50:02 AM
* Email  : Virendra.1.Kumar@coforge.com
*/

//Program to add 2 complex numbers- Real & Imaginary part

public class Complex {
	double real;
	double imaginary;
	
	//Generate Constructor using fields
	public Complex(double real, double imaginary) { //Parameterized Constructor
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public void add(Complex obj) { //Method which accepts object as an argument
		//c1.real += c2.real;
		this.real += obj.real;
		this.imaginary += obj.imaginary;
	}
	
	public void display() {
		System.out.println("r" + this.real + " +i" + this.imaginary);
	}
	
}
