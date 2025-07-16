package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 15, 2025
* Time   : 2:34:19 PM
* Email  : Virendra.1.Kumar@coforge.com
*/

public class ConnectionUtil {

	public static Connection createConnection() throws Exception 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqljdbc","root","virensql");
		return con;
	}
}
