package jdbc;

import java.sql.*;

public class SelectJDBC {
	public static void main(String args[]) {

		String jdbcUrl = "jdbc:mysql://localhost:3306/mydatabase";
		String username = "root";
		String password = "password";

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		{

			try {
				// Step 1: Load the JDBC driver
				Class.forName("com.mysql.cj.jdbc.Driver");

				// Step 2: Establish the connection
				conn = DriverManager.getConnection(jdbcUrl, username, password);

				// Step 3: Create a statement
				stmt = conn.createStatement();

				// Step 4: Execute a query
				String sql = "SELECT * FROM mytable";
				rs = stmt.executeQuery(sql);

				// Step 5: Process the ResultSet
				while (rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					int age = rs.getInt("age");
					System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				// Step 6: Close resources
				try {
					if (rs != null)
						rs.close();
					if (stmt != null)
						stmt.close();
					if (conn != null)
						conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
