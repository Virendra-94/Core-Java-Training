package oopsdemo2;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 10, 2025
* Time   : 12:16:49 PM
* Email  : Virendra.1.Kumar@coforge.com
*/

public class AggregationDemo1 {

	public static void main(String[] args) {
		
	Author author = new Author("John", 42, "USA");
		
	    Publisher publisher = new Publisher("Sun Publications","JDSR-III4", "LA");
	    
	    Book100 b = new Book100("Java for Begginers", 800, author, publisher);
	    
	    b.display();

	}

}
