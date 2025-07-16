package assignments.tollbooth;

/**
 * Author : Virendra.1.Kumar
 * Date   : Jul 16, 2025
 * Time   : 9:25:46 AM
 * Email  : Virendra.1.Kumar@coforge.com
 */

public interface ITruck {

	//Returns the number of axles the truck has.
	int getAxles();


	//Returns the total weight of the truck in kilograms.
	int getWeight();

	//Returns the make or brand of the truck.
	String getMake();
}
