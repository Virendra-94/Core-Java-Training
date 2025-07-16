package oops;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 8, 2025
* Time   : 4:14:02 PM
* Email  : Virendra.1.Kumar@coforge.com
*/


/*
 * Java OOP enter ProductId, Name, price & qty, Calculate the total bill
 */
public class Product {
	
	private int productId;
	private String productName;
	private float price;
	private int quantity;
	
	
	
	public int getProductId() {
		return productId;
	}



	public void setProductId(int productId) {
		this.productId = productId;
	}



	public String getProductName() {
		return productName;
	}



	public void setProductName(String productName) {
		this.productName = productName;
	}



	public float getPrice() {
		return price;
	}



	public void setPrice(float price) {
		this.price = price;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void calculateBill() {
		float totalBill = price*quantity;
		System.out.println("Total Price: "+ totalBill);
	}

}
