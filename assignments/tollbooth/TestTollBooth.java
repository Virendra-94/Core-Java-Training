package assignments.tollbooth;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 16, 2025
* Time   : 9:27:15 AM
* Email  : Virendra.1.Kumar@coforge.com
*/

public class TestTollBooth {

    public static void main(String[] args) {
        // Create an instance of the tollbooth
        ITollBooth booth = new AlleghenyTollBooth();
                                                                                    
        // Create instances of different trucks
        ITruck ford = new FordTruck(5, 12500);
        ITruck nissan = new NissanTruck(2, 5000);
        ITruck daewoo = new DaewooTruck(6, 17000);

        // Simulate truck arrivals and toll calculation
        booth.calculateToll(ford);
        booth.calculateToll(nissan);
        booth.calculateToll(daewoo);

        // Simulate collecting the receipts and resetting the booth
        booth.collectReceipts();
    }
}

