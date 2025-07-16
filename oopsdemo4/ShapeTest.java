package oopsdemo4;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 11, 2025
* Time   : 3:06:00 PM
* Email  : Virendra.1.Kumar@coforge.com
*/

public class ShapeTest {

	public static void main(String[] args) {
		
		//Programming for Interfaces not implemented
		Shape shape = new Circle(10); //Upcasting
		
		System.out.println("Using Interface: "+Shape.LABLE);
		
		shape.draw();
		
		System.out.println("Area of Circle with radius is: "+shape.getArea());
		
		//Switching from one implementation to another easily
		shape = new Rectangle(10, 7); //Upcasting
		shape.draw();
		System.out.println("Area of Rectangle is: "+shape.getArea());

	}

}
