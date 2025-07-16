package oopsdemo2;

import java.util.Scanner;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 9, 2025
* Time   : 4:31:28 PM
* Email  : Virendra.1.Kumar@coforge.com
*/

public class MultilevelDemo2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount Details of Customer (Cust No., Name, Min Balance, Balance): ");
		
		System.out.println("Enter Customer Number: ");
		int custNo = sc.nextInt();
		sc.nextLine(); //To pause for the multiple words others give error
		System.out.println("Enter your Name: ");
		String name = sc.nextLine();
		
		int balance = sc.nextInt();
		
		final int MIN_BAL = 1000;
		System.out.println("Enter amount to Deposit: ");
		int deposit = sc.nextInt();
		
		System.out.println("Enter amount to Withdraw: ");
		int withdraw = sc.nextInt();
		
		
		AccountDetails ac1 = new AccountDetails(custNo, name, MIN_BAL,balance, deposit, withdraw);
		
		ac1.display(); //Invoke display() method of AccountDetails
		sc.close();

	}

}
