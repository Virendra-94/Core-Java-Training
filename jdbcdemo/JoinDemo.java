package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

/**
 * Author : Virendra.1.Kumar
 * Date   : Jul 15, 2025
 * Time   : 2:16:21 PM
 * Email  : Virendra.1.Kumar@coforge.com
 */

public class JoinDemo {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/coforgedb";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "virensql";

	public static void main(String[] args) {



		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			// 1. Register JDBC driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2. Open a connection
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

			// 3. Create and execute statement
			stmt = conn.createStatement();
			String sql = "SELECT e.employee_id, e.first_name, e.last_name, e.email, " +
					"e.hire_date, e.salary, d.department_name, d.location " +
					"FROM employees e JOIN departments d ON e.department_id = d.department_id " +
					"ORDER BY e.last_name, e.first_name";
			rs = stmt.executeQuery(sql);

			// 4. Display results
			System.out.println("Employee Records with Department Information");
			System.out.println("--------------------------------------------------------------------------------------------------");
			System.out.printf("%-3s %-10s %-10s %-30s %-12s %-10s %-20s %-15s%n",
					"ID", "First Name", "Last Name", "Email", "Hire Date", "Salary", "Department", "Location");
			System.out.println("--------------------------------------------------------------------------------------------------");

			while (rs.next()) {
				int empId = rs.getInt("employee_id");
				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");
				String email = rs.getString("email");
				Date hireDate = rs.getDate("hire_date");
				double salary = rs.getDouble("salary");
				String deptName = rs.getString("department_name");
				String location = rs.getString("location");

				System.out.printf("%-3d %-10s %-10s %-30s %-12s $%,-10.2f %-20s %-15s%n",
						empId, firstName, lastName, email, hireDate, salary, deptName, location);
			}
		} catch (ClassNotFoundException e) {
			System.err.println("JDBC Driver not found: " + e.getMessage());
		} catch (SQLException e) {
			System.err.println("Database error occurred:");
			e.printStackTrace();
		} finally {
			// 5. Close resources in reverse order
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					System.err.println("Error closing ResultSet: " + e.getMessage());
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					System.err.println("Error closing Statement: " + e.getMessage());
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					System.err.println("Error closing Connection: " + e.getMessage());
				}
			}
		}
	}

}


