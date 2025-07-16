package assignments.tollbooth;

/**
 * Author : Virendra.1.Kumar
 * Date   : Jul 16, 2025
 * Time   : 9:26:47 AM
 * Email  : Virendra.1.Kumar@coforge.com
 */

public interface ITollBooth {

	//Calculates the toll for a given truck and updates the totals.
	//This method also prints the details of the arriving truck and the toll due.
	void calculateToll(ITruck truck);


	//Displays the current totals for receipts and the number of trucks since the last collection.
	void displayData();


	//Simulates the collection of receipts. It displays the final totals
	//and then resets the receipt and truck counts to zero.

	void collectReceipts();
}
