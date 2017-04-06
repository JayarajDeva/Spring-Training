package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TxDemo {

	public static void main(String[] args) throws Exception {
		int[] rows;
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1", "root", "root");
		Statement stmt = conn.createStatement();
		stmt.addBatch("insert into emp(empid,name,salary) values (107,'Nitin',45000)");
		stmt.addBatch("insert into emp(empid,name,salary) values (108,'Shan',50000)");
		stmt.addBatch("insert into emp(empid,name,salary) values (106,'Rupa',45000)");

		conn.setAutoCommit(false);
		try {
			rows = stmt.executeBatch();
			conn.commit();
		} catch (Exception e) {
			e.printStackTrace();
			conn.rollback();
		} finally {
			conn.setAutoCommit(true);
			conn.close();
		}
	}

}
