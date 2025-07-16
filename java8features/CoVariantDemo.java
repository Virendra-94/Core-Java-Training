package java8features;

import java.util.ArrayList;
import java.util.List;

/**
 * Author : Virendra.1.Kumar
 * Date   : Jul 15, 2025
 * Time   : 4:35:44 PM
 * Email  : Virendra.1.Kumar@coforge.com
 */


/*
 * In Java 5, The covariant return types are newly introduced. 
  * After introduced the covariant return type, Java allows us to change the return type 
 * of the overriding method(Method in child class). 
 * But the return type of overriding method (Method of child class) 
 * must be a subtype of the overridden method (Method of Parent class). 
 * If you try to provide the return type of overriding method(Method of child class) 
 * with supertype, then it with throw exception at compile time.
 * 
 * The Covariant method overriding provides a way that you can return the subtype of 
 * actually return type of overridden method. 
 * It helps the programmer to remove the burden of type casting. 
 * This method is mostly used when the overriding method returns an object.
 */

class Student{
	public List<String> listOfName()
	{
		ArrayList<String> listOfName = new ArrayList<>();
		listOfName.add("John");
		listOfName.add("Ram");
		listOfName.add("Mary");

		return listOfName;
	}
}

class Record extends Student{

	@Override
	public ArrayList<String> listOfName() { //Covariant return type - subtype of supertype
		ArrayList<String> listOfName = new ArrayList<String>();
		listOfName.add("Java");
		listOfName.add("Gosling");
		listOfName.add("Covariant");

		return listOfName;
	}

}

public class CoVariantDemo {

	public static void main(String[] args) {

		Record r=new Record();
		System.out.println(r.listOfName());

		System.out.println("*****************");
		Student s1=new Student();
		System.out.println(s1.listOfName());


	}

}
