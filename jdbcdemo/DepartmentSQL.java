package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 15, 2025
* Time   : 12:21:36 PM
* Email  : Virendra.1.Kumar@coforge.com
*/

public class DepartmentSQL {

public static void main(String[] args) {
		
		Connection con = null;
		Statement stmt;
		ResultSet rs;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/coforgedb", "root", "virensql");
			stmt = con.createStatement();
			
			rs = stmt.executeQuery("SELECT department_name, location, budget from departments");
			while(rs.next()) {
				System.out.println(rs.getString("department_name") + "\t" + rs.getString("location") + "\t" + rs.getDouble("budget"));
				
			}
			con.close();
		} 
		catch(Exception e) {
			System.out.println(e);
		}

	}
}
