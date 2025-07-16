package collectionsdemo;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 14, 2025
* Time   : 11:18:16 AM
* Email  : Virendra.1.Kumar@coforge.com
*/

class Sample<T> { //Parameterized Class/ Generic Class / Generic T - type

	private T data; //Generic Variable Declaration

	public Sample(T data) { //Generic Constructor
		this.data = data;
	}

	
	public T getData() {// Getter with generic return type
		return data;
	}


	public void setData(T data) { // Setter with generic return type
		this.data = data;
	}
	
}

public class GenericsClassDemo {

	public static void main(String[] args) {
		
		Sample<String> s1 = new Sample<String>("Java Generics"); //Object of Generic class for type String
		System.out.println("Display from generic class by passing String Object: "+ s1.getData());
		
		Sample<Integer> s2 = new Sample(200);//Object of Generic class for type Integer
		System.out.println("Display from generic class by passing Integer Object: "+ s2.getData());
		
		Sample<Double> s3 = new Sample(555.50);//Object of Generic class for type Double
		System.out.println("Display from generic class by passing Double Object: "+ s3.getData());

	}

}
