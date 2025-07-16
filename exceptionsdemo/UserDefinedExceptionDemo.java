package exceptionsdemo;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 12, 2025
* Time   : 12:44:26 PM
* Email  : Virendra.1.Kumar@coforge.com
*/

public class UserDefinedExceptionDemo {

	public static void main(String[] args) {
		
		CheckingAccount ck1=new CheckingAccount(101);

        System.out.println("Depositing 5000$ ...........");
        ck1.deposit(5000);

        try{
            System.out.println("Withdrawing 2000$.........");
            ck1.withdraw(2000);

            System.out.println("Withdrawing 5000$.........");
            ck1.withdraw(5000);
        }
        catch (InSufficientFundsException e){
            System.out.println("Sorry InSufficient Balance : "+ ck1.getBalance());
            e.printStackTrace();
        }

	}

}
