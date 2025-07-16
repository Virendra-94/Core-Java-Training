package collectionsdemo;

/**
 * Author : Virendra.1.Kumar
 * Date   : Jul 14, 2025
 * Time   : 11:30:23 AM
 * Email  : Virendra.1.Kumar@coforge.com
 */

class Container<T> {
	//generic class with single Parameter- ArrayList, Vector, Hashset
	private T t;

	//method
	public void add(T t) {
		this.t = t;
	}

	//generate getter
	public T get() {
		return t;
	}
}

public class GenericsClassDemo2<T> {

	public static void main(String[] args) {
		Container<String> strContainer=new Container<String>();
		Container<Integer> intContainer=new Container<Integer>();
		Container<Double> dblContainer=new Container<Double>();
		Container<Character> chrContainer=new Container<Character>();

		strContainer.add("James Gosling");
		intContainer.add(1000);
		dblContainer.add(50000.55);
		chrContainer.add('A');

		System.out.println("The String Value is :"+strContainer.get());
		System.out.println("The Integer Value is :"+intContainer.get());
		System.out.println("The Double Value is :"+dblContainer.get());
	}

}
