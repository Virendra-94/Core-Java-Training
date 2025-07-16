
package oopsdemo4;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 11, 2025
* Time   : 2:58:01 PM
* Email  : Virendra.1.Kumar@coforge.com
*/

public class Circle implements Shape {

	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Circle");
		
	}

	@Override
	public double getArea() {
		return Math.PI*this.radius*this.radius;
	}

	//Generate Getter for radius
	public double getRadius() {
		return radius;
	}
	
	
}
