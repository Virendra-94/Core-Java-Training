package jdbcdemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Author : Virendra.1.Kumar
 * Date   : Jul 15, 2025
 * Time   : 3:00:04 PM
 * Email  : Virendra.1.Kumar@coforge.com
 */

public class InsertDemo {

	public static void main(String[] args) {

		Connection con;
		Statement stmt;
		ResultSet rs;
		int count;

		try
		{
			con=ConnectionUtil.createConnection();

			String str="INSERT INTO skills(name) VALUES('Hibernate')";

			stmt=con.createStatement();

			count=stmt.executeUpdate(str); // return no. of records affected

			if(count > 0)
			{
				System.out.println("Record Inserted Successfully");
			}

			// count total no. of records in table
			String str1="SELECT COUNT(id) FROM skills";
			rs=stmt.executeQuery(str1);
			int cnt=0;
			while(rs.next())
			{
				cnt=rs.getInt(1);
			}
			System.out.println("Total no. of records is: "+cnt);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
