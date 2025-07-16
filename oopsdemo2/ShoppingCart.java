package oopsdemo2;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 9, 2025
* Time   : 3:06:15 PM
* Email  : Virendra.1.Kumar@coforge.com
*/

public class ShoppingCart extends Customer {

	private String[] items;
	private int itemCount;
	
	public ShoppingCart(String name, String email) {
		super(name, email);
		items = new String[10]; //Maximum 10 items can be added to cart
		itemCount = 0;
	}
	
	public void addItem(String item) {
		if(itemCount < items.length) {
			items[itemCount] = item;
			itemCount++;
			System.out.println(item + " Added to Cart");
		} else {
			System.out.println("Cart is Full. Cannot Add More Items.");
		}
	}
	
	public void displayCart(){
	      System.out.println("Items in Cart: ");
	       for (int i = 0; i < itemCount; i++) {
	          System.out.println(items[i]);
	       }
	  }
	
}
