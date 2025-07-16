package java8features;

/**
 * Author : Virendra.1.Kumar
 * Date   : Jul 16, 2025
 * Time   : 11:46:56 AM
 * Email  : Virendra.1.Kumar@coforge.com
 */

public class DefaultMethodsDemo1 {

	public static void main(String[] args) {

		IVehicle car=new Car("BMW");

		//invoke overridden methods
		System.out.println(car.getBrand());
		System.out.println(car.speedUp());
		System.out.println(car.slowDown());

		//invoke default methods
		System.out.println(car.turnAlarmOn());
		System.out.println(car.turnAlarmOff());

		//invoke static method of Interface
		System.out.println(IVehicle.getHorsePower(2500, 400));

	}

}
