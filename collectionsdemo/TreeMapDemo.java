package collectionsdemo;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * Author : Virendra.1.Kumar
 * Date   : Jul 14, 2025
 * Time   : 4:25:29 PM
 * Email  : Virendra.1.Kumar@coforge.com
 */

//storing key/value pairs in sorted order.
public class TreeMapDemo {

	public static void main(String[] args) {

		//storing key/value pairs in sorted order.

		TreeMap<String,String> fileExtensions=new TreeMap<>();

		// Adding new key-value pairs to a TreeMap
		fileExtensions.put("python", ".py");
		fileExtensions.put("c++", ".cpp");
		fileExtensions.put("kotlin", ".kt");
		fileExtensions.put("golang", ".go");
		fileExtensions.put("java", ".java");

		//Tree map will be sorted based on keys
		System.out.println(fileExtensions);

		TreeMap<String,String> fileExtensions1=new TreeMap<String,String>(Comparator.reverseOrder());

		// Adding new key-value pairs to a TreeMap
		fileExtensions1.put("python", ".py");
		fileExtensions1.put("c++", ".cpp");
		fileExtensions1.put("kotlin", ".kt");
		fileExtensions1.put("golang", ".go");
		fileExtensions1.put("java", ".java");

		//Tree map will be sorted based on keys in descending order
		System.out.println(fileExtensions1);


	}

}
