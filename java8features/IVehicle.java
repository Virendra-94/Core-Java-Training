package java8features;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 16, 2025
* Time   : 11:40:39 AM
* Email  : Virendra.1.Kumar@coforge.com
*/

public interface IVehicle {

	//by default all are abstract methods
		String getBrand();
		String speedUp();
		String slowDown();
		
		// Any non-abstract methods must be made default to add any new feature
		default String turnAlarmOn()
		{
			return "Turning the Vehicle Alarm ON.";
		}
		
		default String turnAlarmOff()
		{
			return "Turning the Vehicle Alarm OFF.";
		}
		
		static int getHorsePower(int rpm,int torque)
		{
			return (rpm*torque)/5252;
		}
}


