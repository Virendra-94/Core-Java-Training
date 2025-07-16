package stringsdemo;

/**
 * Author : Virendra.1.Kumar
 * Date   : Jul 14, 2025
 * Time   : 9:37:25 AM
 * Email  : Virendra.1.Kumar@coforge.com
 */

public class StringDemo2 {

	public static void main(String[] args) {

		//Creating Strings using new Keyword

		//A new String Object is always created even though "Java Strings" is
		//already present in the String pool
		String name=new String("Java Strings");

		System.out.println("The String value is : "+name);
		System.out.println("The Length of the String is : "+name.length());
		System.out.println("Convert to Uppercase :"+name.toUpperCase());

		String  greet="She Sells Sea Shells in the Sea";

		System.out.println("The String is : "+greet);
		System.out.println("The Length of the String is : "+greet.length());

		String second="Programming in Java";
		String joinedString=greet.concat(second);
		System.out.println("Concatenation of Strings :"+joinedString);

		// Strings are Immutable - String created once, cannot be changed
		String example="Hello";
		example=example.concat(" World"); // first string "Hello" remains unchanged
		System.out.println(example); // new reference obj created with "Hello World"

	}

}
