package collectionsdemo;

import java.util.ArrayList;

/**
 * Author : Virendra.1.Kumar
 * Date   : Jul 14, 2025
 * Time   : 2:18:25 PM
 * Email  : Virendra.1.Kumar@coforge.com
 */

public class GenericArrayList {

	public static void main(String[] args) {

		ArrayList<String> strLst = new ArrayList<String>();

		strLst.add("alpha");   // compiler checks if argument is of type String
		strLst.add("beta");
		strLst.add("gama");
		strLst.add("delta");


		System.out.println(strLst);

		// Iterate using classic for loop

		for(int i=0;i<strLst.size();i++)
		{
			String str=strLst.get(i);
			System.out.println(str);
		}

		strLst.add("zeta");
		System.out.println(strLst);
		System.out.println(strLst.get(2));

		System.out.println("************************************");
		/*
		 * To obtain the index of an element in a ArrayList while iterating 
		 * through it with a for loop,
		 */
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Grape");

		String targetElement = "Orange";
		int foundIndex = -1; // Initialize with -1 to indicate not found

		// Iterate through the ArrayList using a traditional for loop
		for (int i = 0; i < fruits.size(); i++) {
			String currentFruit = fruits.get(i); // Get the element at the current index

			if (currentFruit.equals(targetElement)) {
				foundIndex = i; // Store the index if a match is found
				break; // Exit the loop once the element is found (optional, if only first occurrence is needed)
			}
		}

		if (foundIndex != -1) {
			System.out.println("The element '" + targetElement + "' was found at index: " + foundIndex);
		} else {
			System.out.println("The element '" + targetElement + "' was not found in the ArrayList.");
		}


	}

}
