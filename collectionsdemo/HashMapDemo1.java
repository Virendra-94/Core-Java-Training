package collectionsdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Author : Virendra.1.Kumar
 * Date   : Jul 14, 2025
 * Time   : 4:08:12 PM
 * Email  : Virendra.1.Kumar@coforge.com
 */

public class HashMapDemo1 {

	public static void main(String[] args) {

		//hash map declaration with key-value pairs
		//map of id & employee names
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

		//add elements to hash map
		hmap.put(12, "Ravi");
		hmap.put(2, "Rahul");
		hmap.put(7, "Singh");
		hmap.put(49, "Annie");
		hmap.put(3, "Amit");

		Set s = hmap.entrySet(); //return values from hmap - key + values
		Set s1 = hmap.keySet(); // returns keys from map
		System.out.println(s);
		System.out.println(s1);

		//Display content using Iterator
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			Map.Entry mentry = (Map.Entry) itr.next();
			System.out.println(mentry.getKey()+" --> "+mentry.getValue());
		}

		// Map is a data structure, which stores data in key-value pairs

		System.out.println("*******************Key set**********");
		Iterator itr1=s1.iterator();
		while(itr1.hasNext())
		{
			Integer key=(Integer) itr1.next();
			String value=hmap.get(key);
			System.out.println(key+"---->"+value);
			System.out.println("Display based on Key :"+hmap.get(key));
		}

		// get values based on key
		String name=hmap.get(7);
		System.out.println("The Name with key 7 is :"+name);

		// remove values based on key
		hmap.remove(2);
		System.out.println(hmap);

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Empoyee Id to be Searched: ");
		Integer eid=scan.nextInt();

		System.out.println("The Employee Id with "+eid+" is : "+hmap.get(eid));

	}

}
