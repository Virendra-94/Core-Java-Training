package java8features;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 16, 2025
* Time   : 11:43:58 AM
* Email  : Virendra.1.Kumar@coforge.com
*/

public class Car implements IVehicle {

	private String brand;

	public Car(String brand) {
		this.brand = brand;
	}

	@Override
	public String getBrand() {
		return brand;
	}

	@Override
	public String speedUp() {
		return "Car is Speeding Up !!! ";
	}

	@Override
	public String slowDown() {
		return "Car is Slowing down !!! ";
	}
	
	
}
