package oops;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 8, 2025
* Time   : 2:51:57 PM
* Email  : Virendra.1.Kumar@coforge.com
*/

//Java Program to Implement Instance Class & Main class in a single file
//Instance Class
class Lamp{
	
	//Stores the value for light
	//True if light is on
	//False if light is off
	boolean isOn;
	
	//Method to turn on the light
	void turnOn() {
		isOn = true;
		System.out.println("Light On? "+ isOn);
	}
	
	//Method to turn off the light
	void turnOff() {
		isOn = false;
		System.out.println("Light On? "+ isOn);
	}
}
public class LampTest {

	public static void main(String[] args) {
		
		//Create object led & halogen
		Lamp led = new Lamp();
		Lamp halogen = new Lamp();
		
		//Switch on led & halogen
		led.turnOn();
		halogen.turnOn();

		
		//Switch off led & halogen
		led.turnOff();
		halogen.turnOff();
	}

}
