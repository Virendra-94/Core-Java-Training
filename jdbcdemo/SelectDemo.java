package jdbcdemo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 15, 2025
* Time   : 11:36:00 AM
* Email  : Virendra.1.Kumar@coforge.com
*/

public class SelectDemo {

	public static void main(String[] args) {
		
		Connection con = null;
		Statement stmt;
		ResultSet rs;
		
		try {
			//Load the JDBC Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Establish the Connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/coforgedb", "root", "virensql");
			
			//Create statement object to execute the query
			stmt = con.createStatement();
			
			//Execute the query and get result set
			rs = stmt.executeQuery("SELECT first_name, last_name, email, salary FROM employees ORDER BY last_name");
			
			//Process the result set
			while(rs.next()) {
				//retrieve data by column name or index
				System.out.println(rs.getString(1) + "\t" + rs.getString("last_name") + "\t" + rs.getString("email") + "\t" + rs.getDouble("salary"));
				
			}
			con.close();
		} 
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
