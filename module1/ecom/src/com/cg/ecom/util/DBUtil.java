package com.cg.ecom.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	static String url = "jdbc:postgresql://localhost:5432/cgbatch19db";
	static String userName = "cgbatch19";
	static String password = "cgbatch19";	
	
	public static Connection createDBConnection() {
		
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userName, password);			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}
