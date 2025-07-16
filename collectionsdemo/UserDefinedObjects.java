package collectionsdemo;

import java.util.ArrayList;
import java.util.List;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 14, 2025
* Time   : 2:24:19 PM
* Email  : Virendra.1.Kumar@coforge.com
*/

//Program to store User Defined class Objects in ArrayList
public class UserDefinedObjects {

	public static void main(String[] args) {
		
		List<Book> bList = new ArrayList<>();
		
		
		//Creating Books  object & initialized using Book Constructor
	    Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
	    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
	    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
	    
	    //add book to list
	    bList.add(b1);
	    bList.add(b2);
	    bList.add(b3);

	    
	    //Traverse List
	    System.out.println("*************** Book Details ****************");
	    for(Book i: bList) {
	    	System.out.println(i.id + " " + i.name + " " + i.author + " " + i.publisher + " " + i.quantity);
	    }
	    
	    System.out.println("Total no. of Books: "+ bList.size());
	    
	    System.out.println("The First Book in List: "+ bList.get(0).getName());
	    
	    bList.remove(b2); //remove book
	    
	    System.out.println();
	    System.out.println("*************** Book Details After Modification****************");
	    for(Book i: bList) {
	    	System.out.println(i.id + " " + i.name + " " + i.author + " " + i.publisher + " " + i.quantity);
	    }
	    
	}

}
