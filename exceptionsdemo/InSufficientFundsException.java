package exceptionsdemo;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 12, 2025
* Time   : 12:35:03 PM
* Email  : Virendra.1.Kumar@coforge.com
*/

//User Defined Exceptions -- Class Should extend root class Exception
public class InSufficientFundsException extends Exception{

	private double amount;
	
	//generate Constructor
	public InSufficientFundsException(double amount) {
		this.amount = amount;
	}

	//Generate Getter
	public double getAmount() {
		return amount;
	}
	
	
}
