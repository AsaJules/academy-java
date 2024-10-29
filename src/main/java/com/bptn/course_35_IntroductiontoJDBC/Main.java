package com.bptn.course_35_IntroductiontoJDBC;

//import java.sql.Connection;
//
//public class Main {
//
//	public static void main(String[] args) {
//		ToDoListClass jdbc = new ToDoListClass();
//		Connection conn = jdbc.createConnection();
//		jdbc.getAllUsers(conn);
//		jdbc.closeConnection(conn);
//	}
//
//}

import java.sql.Connection;

public class Main {
	public static void main(String[] args) {
		FeedAppClass jdbc = new FeedAppClass();
		Connection conn = jdbc.createConnection();

		// Example of inserting a new user
		jdbc.addUser(conn, "Ray", "Mist", "raymist", "18292831", "ray@mist.com", "Ray@22", true);

		// Close the connection
		jdbc.closeConnection(conn);
	}
}