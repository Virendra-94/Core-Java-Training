package jdbcdemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
* Author : Virendra.1.Kumar
* Date   : Jul 15, 2025
* Time   : 2:32:06 PM
* Email  : Virendra.1.Kumar@coforge.com
*/

public class SelectDemo2 {

	public static void main(String[] args) {
		
		Connection con=null;
		Statement stmt;
		ResultSet rs;
		
		try {
			
			con=ConnectionUtil.createConnection(); 
			
			stmt=con.createStatement();//Not Giving any parameter here means non-scrollable result set otherwise scrollable result set
			
			//projection
			rs=stmt.executeQuery("SELECT first_name,last_name,email from candidates order by last_name");
			
			while(rs.next())
			{
				System.out.print(rs.getString(1)+"\t"+rs.getString("last_name")+"\t"+
			rs.getString("email"));
			}
			con.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}

	}

}
