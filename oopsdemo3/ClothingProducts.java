package oopsdemo3;

/**
 * Author : Virendra.1.Kumar
 * Date   : Jul 11, 2025
 * Time   : 9:21:13 AM
 * Email  : Virendra.1.Kumar@coforge.com
 */

public class ClothingProducts extends Product {

	private String size;
	private String color;


	public ClothingProducts(String name, double price, String size, String color) {
		super(name, price);
		this.size = size;
		this.color = color;
	}


	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Size: " + size);
		System.out.println("Color: " + color);
		System.out.println("Material: Cotton");
	}

	

}
