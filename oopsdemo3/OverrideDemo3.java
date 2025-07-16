package oopsdemo3;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 11, 2025
* Time   : 9:26:42 AM
* Email  : Virendra.1.Kumar@coforge.com
*/

public class OverrideDemo3 {

	public static void main(String[] args) {
		
		ElectronicsProduct laptop=new ElectronicsProduct("Laptop",999.90,"Dell","Inspiron");
        ClothingProducts tShirt=new ClothingProducts("T-Shirt",15.45,"Medium","Red");

        System.out.println("-- Electronics Product Details ---");
        laptop.displayDetails();

        System.out.println("-- Clothing Product Details ---");
        tShirt.displayDetails();

	}

}
