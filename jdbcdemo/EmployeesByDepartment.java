package jdbcdemo;

import java.util.Scanner;
import java.sql.*;
/**
 * Author : Virendra.1.Kumar
 * Date   : Jul 15, 2025
 * Time   : 3:16:14 PM
 * Email  : Virendra.1.Kumar@coforge.com
 */

public class EmployeesByDepartment {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/coforgedb";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "virensql";

	public static void main(String[] args) {

		// Get department name from user
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter department name to filter employees: ");
		String departmentName = scanner.nextLine().trim();
		scanner.close();

		// SQL query with parameter
		String sql = "SELECT e.employee_id, e.first_name, e.last_name, e.email, " +
				"e.hire_date, e.salary, d.department_name " +
				"FROM employees e JOIN departments d ON e.department_id = d.department_id " +
				"WHERE d.department_name = ? " +
				"ORDER BY e.last_name, e.first_name";
		/*
		 * Try-With-Resources:
			Automatically closes Connection, PreparedStatement, and ResultSet
			Resources are closed in reverse order of creation
		 */
		try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
				PreparedStatement pstmt = conn.prepareStatement(sql)) {

			// Set the department name parameter
			pstmt.setString(1, departmentName);

			// Execute query and process results
			try (ResultSet rs = pstmt.executeQuery()) {
				System.out.println("\nEmployees in " + departmentName + " Department");
				System.out.println("------------------------------------------------------------");
				System.out.printf("%-5s %-15s %-15s %-12s %-10s%n",
						"ID", "First Name", "Last Name", "Hire Date", "Salary");
				System.out.println("------------------------------------------------------------");

				boolean hasResults = false;
				while (rs.next()) {
					hasResults = true;
					int empId = rs.getInt("employee_id");
					String firstName = rs.getString("first_name");
					String lastName = rs.getString("last_name");
					Date hireDate = rs.getDate("hire_date");
					double salary = rs.getDouble("salary");

					System.out.printf("%-5d %-15s %-15s %-12s $%,-10.2f%n",
							empId, firstName, lastName, hireDate, salary);
				}

				if (!hasResults) {
					System.out.println("No employees found in " + departmentName + " department.");
				}
			}
		} catch (SQLException e) {
			System.err.println("Database error occurred:");
			e.printStackTrace();
		}

	}

}


