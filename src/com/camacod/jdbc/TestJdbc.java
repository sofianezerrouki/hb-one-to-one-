package com.camacod.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		
		
		String jdbcUrl = "jdbc:mysql://localhost/hb-01-one-to-one-uni";
		String user = "sofiane";
		String pass = "sofiane";
		try {
			System.out.println("Connecting to Data Base ...."+jdbcUrl);
			Connection conn = DriverManager.getConnection(jdbcUrl,user,pass);
			System.out.println("Successful Connection :)");
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
