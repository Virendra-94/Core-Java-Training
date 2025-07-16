package oopsdemo4;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 11, 2025
* Time   : 3:01:22 PM
* Email  : Virendra.1.Kumar@coforge.com
*/

public class Rectangle implements Shape {

	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Rectangle");
		
	}

	@Override
	public double getArea() {
		return this.height*this.width;
	}
	
	
}
