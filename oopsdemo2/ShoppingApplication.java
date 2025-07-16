package oopsdemo2;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 9, 2025
* Time   : 3:14:40 PM
* Email  : Virendra.1.Kumar@coforge.com
*/

public class ShoppingApplication {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart("Marry Jhon", "marry@wipro.com");
				
		cart.addItem("Dell Laptop");
		cart.addItem("Boat Headphone");
		cart.addItem("Logitech Mouse");
		
		cart.display();
		System.out.println("------ Cart Details ------");
		cart.displayCart();

	}

}
