package collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Author : Virendra.1.Kumar
 * Date   : Jul 14, 2025
 * Time   : 12:32:19 PM
 * Email  : Virendra.1.Kumar@coforge.com
 */

public class ArrayListDemo {

	public static void main(String[] args) {

		//Generic ArrayList
		ArrayList<String> al = new ArrayList<>();

		//add elements to arraylist & it maintains the order of insertion
		al.add("Java"); //Autoboxing
		al.add("Perl");
		al.add("C++");
		al.add("C# 5.0");
		al.add("Java"); //Duplicate element
		al.add("Python");

		System.out.println(al);

		//get elements by index
		System.out.println("Element at index 1: "+al.get(1));

		System.out.println("Does list contains element Java?: "+al.contains("Java"));

		//add elements at specific index
		al.add(2,"Oracle");
		System.out.println(al);

		System.out.println("Is Arraylist Empty ? :"+al.isEmpty());
		System.out.println("Index of Perl :"+al.indexOf("Perl"));
		System.out.println("Size of Arraylist : "+al.size());

		// Collections is a Utility Class
		Collections.sort(al);
		System.out.println("Array List after Sorting :"+al);

		//al.add(100); // compiler error

		ArrayList<Integer> a2=new ArrayList<Integer>();//default size is 10

		a2.add(100);
		a2.add(500);
		a2.add(73);
		a2.add(66);
		a2.add(350);
		a2.add(73);

		System.out.println(a2);
		System.out.println("Size :"+a2.size());


	}

}
