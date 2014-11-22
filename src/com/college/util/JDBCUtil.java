package com.college.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCUtil {
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3309/college", "root", "saurabh");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error in creating Connection");
		}
		return con;
	}

	public static void close(Connection con, Statement st) {
		try {
			if (con != null) {
				con.close();
			}
		} catch (Exception e) {
			System.out.println("Error in closing connection");
		}
		try {
			if (st != null) {
				st.close();
			}
		} catch (Exception e) {
			System.out.println("Error in closing statement");
		}
	}

}
