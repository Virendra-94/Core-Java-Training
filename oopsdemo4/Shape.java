package oopsdemo4;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 11, 2025
* Time   : 2:54:59 PM
* Email  : Virendra.1.Kumar@coforge.com
*/

public interface Shape {
	//implicitly public, static and final
	public String LABLE = "Shape";
	
	//interface methods are implicitly abstract and public
	void draw();
	
	public abstract double getArea();
}
