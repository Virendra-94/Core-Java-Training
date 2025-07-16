package oops;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 8, 2025
* Time   : 4:21:16 PM
* Email  : Virendra.1.Kumar@coforge.com
*/

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		p1.setProductId(110);
		p1.setProductName("Lenovo IdeaPad 3");
		p1.setQuantity(10);
		p1.setPrice(47000);
		
		p2.setProductId(113);
		p2.setProductName("Keyboard");
		p2.setQuantity(20);
		p2.setPrice(700);
		
		p3.setProductId(115);
		p3.setProductName("Mouse");
		p3.setQuantity(15);
		p3.setPrice(450);
		
		System.out.println("Product Id: "+ p1.getProductId());
		System.out.println("Product Name: "+ p1.getProductName());
		System.out.println("Product Quantity: "+ p1.getQuantity());
		p1.calculateBill();
		
		System.out.println();
		
		System.out.println("Product Id: "+ p2.getProductId());
		System.out.println("Product Name: "+ p2.getProductName());
		System.out.println("Product Quantity: "+ p2.getQuantity());
		p2.calculateBill();
		
		System.out.println();
		
		System.out.println("Product Id: "+ p3.getProductId());
		System.out.println("Product Name: "+ p3.getProductName());
		System.out.println("Product Quantity: "+ p3.getQuantity());
		p3.calculateBill();
		
	}

}
