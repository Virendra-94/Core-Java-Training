package oopsdemo3;

/**
 * Author : Virendra.1.Kumar
 * Date   : Jul 11, 2025
 * Time   : 9:17:21 AM
 * Email  : Virendra.1.Kumar@coforge.com
 */

public class ElectronicsProduct extends Product{


	private String brand;
	private String model;

	public ElectronicsProduct(String name, double price, String brand, String model) {
		super(name, price);
		this.brand = brand;
		this.model = model;
	}

	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Warranty: 1 year");
	}



}
