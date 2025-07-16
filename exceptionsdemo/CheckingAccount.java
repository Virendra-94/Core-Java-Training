package exceptionsdemo;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 12, 2025
* Time   : 12:39:39 PM
* Email  : Virendra.1.Kumar@coforge.com
*/

public class CheckingAccount {

	private double balance;
    private int number;
    
    //Generate Constructor
	public CheckingAccount(int number) {
		this.number = number;
	}

	public double getBalance() {
		return balance;
	}

	public int getNumber() {
		return number;
	}
    
	public void deposit(double amount) {
		balance += amount;
	}
	
    // method may throw user defined exception - InSufficientFundsException
   public void withdraw(double amount) throws InSufficientFundsException {
       if(amount <= balance) {
           balance -= amount;
       }else {
           double needs = amount - balance;
           throw new InSufficientFundsException(needs);
       }
   }

}
