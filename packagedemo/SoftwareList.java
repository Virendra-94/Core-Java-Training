package packagedemo;



import com.coforge.training.microsoft.OperatingSystem;
import com.coforge.training.oracle.Database;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 12, 2025
* Time   : 2:49:55 PM
* Email  : Virendra.1.Kumar@coforge.com
*/

public class SoftwareList {

	public static void main(String[] args) {
		OperatingSystem op1 = new OperatingSystem();
		Database db1 = new Database();
		
		System.out.println("*************** List of Operating System from Microsoft *************");
		op1.listSoftware();
		
		System.out.println("-----------------------------------------------");
		System.out.println("*************** List of Database from Oracle ****************");
		db1.printSoftware();
		
	}
}
