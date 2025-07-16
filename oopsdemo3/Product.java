package oopsdemo3;

/**
 * Author : Virendra.1.Kumar
 * Date   : Jul 11, 2025
 * Time   : 9:16:22 AM
 * Email  : Virendra.1.Kumar@coforge.com
 */

public class Product {

	private String name;
	private double price;


	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	// Method to display product details
	public void displayDetails() {
		System.out.println("Product Name: " + name);
		System.out.println("Price: $" + price);
	}


}
