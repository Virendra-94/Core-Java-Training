package collectionsdemo;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Author : Virendra.1.Kumar
 * Date   : Jul 14, 2025
 * Time   : 4:22:23 PM
 * Email  : Virendra.1.Kumar@coforge.com
 */

public class HashMapDemo3 {

	public static void main(String[] args) {

		HashMap<String,Double> hm=new HashMap<>();

		//To ignore case for keys
		//TreeMap<String,Double> hm=new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

		//Map of Customer name & their Bank balance
		hm.put("John", 5000.50);
		hm.put("Jim",  4200.22);
		hm.put("Daisy", 6700.50);
		hm.put("Jack", 140.21);
		hm.put("Mike", 10000.90);

		System.out.println("Display Customers & Balance Amount: ");
		for(String k:hm.keySet())
		{
			System.out.println(k+"-->"+hm.get(k));
		}

		// deposit 1000 to Jim's Account- Update value
		double bal=hm.get("Jim");
		hm.put("Jim",bal+1000);
		System.out.println("Jim's new Balance is :"+hm.get("Jim"));

		hm.putIfAbsent("Raj", 500.00);

		System.out.println(hm);

		Scanner s=new Scanner(System.in);
		System.out.println("Enter Customer Name for his Balance :");
		String name=s.next();
		System.out.println("The Balance of "+name+ " is :"+hm.get(name));
	}
}
