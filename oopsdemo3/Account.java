package oopsdemo3;

/**
 * Author : Virendra.1.Kumar
 * Date   : Jul 10, 2025
 * Time   : 4:15:10 PM
 * Email  : Virendra.1.Kumar@coforge.com
 */

//Override Demo
public class Account {

	private String name;
	protected double balance;

	public Account(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	// final methods cannot be overridden
	final void deposit(double amt) {
		balance += amt;
		System.out.println("Depositing: " + amt);
	}

	void withdraw(double amt) {
		balance -= amt;
		System.out.println("WithDrawing: " + amt);

	}


}
