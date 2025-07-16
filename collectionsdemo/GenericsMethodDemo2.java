package collectionsdemo;

/**
 * Author : Virendra.1.Kumar
 * Date   : Jul 14, 2025
 * Time   : 11:50:21 AM
 * Email  : Virendra.1.Kumar@coforge.com
 */

public class GenericsMethodDemo2 {

	//Syntax: <type-parameter> return_type method_name (parameters) {...}
	<T> void show(T a)   // generic method
	{
		System.out.println("The generic value is : "+a);
	}

	<V,T> void hello(V a,T b)
	{
		System.out.print(a.getClass().getName()+" = "+a+" ");
		System.out.println(b.getClass().getName()+" = "+b);
	}

	public static void main(String[] args) {

		GenericsMethodDemo2 gd=new GenericsMethodDemo2();

		gd.show(100);
		gd.show(1000.50);
		gd.show("Generics in Java");
		gd.show('A');
		gd.show(true);
		gd.show(10.0f);
		gd.show(10L);

		System.out.println();

		gd.hello(101, "James Gosling");
		gd.hello("Rod Jhonson","Spring");
		gd.hello("Java", 8);
		gd.hello(120, 200.50);

	}

}
