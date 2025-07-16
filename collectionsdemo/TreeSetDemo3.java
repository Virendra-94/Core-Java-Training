package collectionsdemo;

import java.util.TreeSet;

/**
 * Author : Virendra.1.Kumar
 * Date   : Jul 14, 2025
 * Time   : 3:18:13 PM
 * Email  : Virendra.1.Kumar@coforge.com
 */

public class TreeSetDemo3 {

	public static void main(String[] args) {

		//Accessing the elements of a TreeSet

		TreeSet<Integer> numbers = new TreeSet<>();

		numbers.add(10);
		numbers.add(15);
		numbers.add(20);
		numbers.add(25);
		numbers.add(30);
		numbers.add(42);
		numbers.add(49);
		numbers.add(50);

		System.out.println("numbers TreeSet : " + numbers);

		// Remove an element from the TreeSet
		boolean isRemoved = numbers.remove(49);
		if(isRemoved) {
			System.out.println("After Removing 49 : " + numbers);
		}

		// Remove all elements divisible by 3
		numbers.removeIf(number -> number % 3 == 0);
		System.out.println("After removeIf() : " + numbers);


		// Retrieve and remove the first element from the TreeSet
		Integer num = numbers.pollFirst();
		System.out.println("Removed first element " + num + " from the TreeSet : " + numbers);

		// Retrieve and remove the last element from the TreeSet
		num = numbers.pollLast();
		System.out.println("Removed last element " + num + " from the TreeSet : " + numbers);

	}

}
