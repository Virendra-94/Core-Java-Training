package assignments.tollbooth;

/**
 * Author : Virendra.1.Kumar
 * Date   : Jul 16, 2025
 * Time   : 9:27:37 AM
 * Email  : Virendra.1.Kumar@coforge.com
 */

class FordTruck implements ITruck {
	private final int axles;
	private final int weight;
	private final String make = "Ford";

	//Constructor for the FordTruck class.
	public FordTruck(int axles, int weight) {
		this.axles = axles;
		this.weight = weight;
	}

	@Override
	public int getAxles() {
		return axles;
	}

	@Override
	public int getWeight() {
		return weight;
	}

	@Override
	public String getMake() {
		return make;
	}
}

/**
 * NissanTruck.java
 * An implementation of the Truck interface, representing a Nissan truck.
 */
class NissanTruck implements ITruck {
	private final int axles;
	private final int weight;
	private final String make = "Nissan";

	//Constructor for the NissanTruck class.
	public NissanTruck(int axles, int weight) {
		this.axles = axles;
		this.weight = weight;
	}

	@Override
	public int getAxles() {
		return axles;
	}

	@Override
	public int getWeight() {
		return weight;
	}

	@Override
	public String getMake() {
		return make;
	}
}

/**
 * DaewooTruck.java
 * An implementation of the Truck interface, representing a Daewoo truck.
 */
class DaewooTruck implements ITruck {
	private final int axles;
	private final int weight;
	private final String make = "Daewoo";

	//Constructor for the DaewooTruck class.
	public DaewooTruck(int axles, int weight) {
		this.axles = axles;
		this.weight = weight;
	}

	@Override
	public int getAxles() {
		return axles;
	}

	@Override
	public int getWeight() {
		return weight;
	}

	@Override
	public String getMake() {
		return make;
	}
}
