package com.bptn.course_35_IntroductiontoJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FeedAppClass {
	// Database connection details
	private static final String userName = "postgres";
	private static final String password = "pg123";
	private static final String dbName = "feedApp";
	private static final String port = "5432";
	private static final String dbUrl = "jdbc:postgresql://localhost:5432/feedApp";

	// Method to create a database connection
	public Connection createConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(dbUrl, userName, password);
			System.out.println("Opened database successfully");
		} catch (SQLException e) {
			System.out.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		return conn;
	}

	// Method to insert a new user into the User table
	public void addUser(Connection conn, String firstName, String lastName, String username, String phone,
			String emailId, String password, boolean emailVerified) {
		PreparedStatement stmt = null;
		String sql = "INSERT INTO \"user\" (\"firstName\", \"lastName\", \"username\", \"phone\", \"emailId\", \"password\", \"emailVerified\", \"createdOn\") VALUES (?, ?, ?, ?, ?, ?, ?, CURRENT_TIMESTAMP)";

		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, firstName);
			stmt.setString(2, lastName);
			stmt.setString(3, username);
			stmt.setString(4, phone);
			stmt.setString(5, emailId);
			stmt.setString(6, password);
			stmt.setBoolean(7, emailVerified);

			int resultCount = stmt.executeUpdate();
			System.out.println(resultCount + " record(s) inserted");
		} catch (SQLException ex) {
			System.out.println("Exception: " + ex.getMessage());
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException ex) {
				System.out.println("Exception: " + ex.getMessage());
			}
		}
	}

	// Method to close the database connection
	public boolean closeConnection(Connection conn) {
		boolean flag = true;
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException ex) {
			flag = false;
			System.out.println("Exception: " + ex.getMessage());
		}
		return flag;
	}
}