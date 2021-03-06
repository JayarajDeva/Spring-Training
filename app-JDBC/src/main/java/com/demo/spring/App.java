package com.demo.spring;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;

public class App {
	private static ApplicationContext ctx;

	public static void main(String[] args) {
		// ctx = new ClassPathXmlApplicationContext("context.xml");
		ctx = new AnnotationConfigApplicationContext(Config.class);

		JdbcTemplate jt = (JdbcTemplate) ctx.getBean("jt");

		/*
		 * int rows = jt.update(new PreparedStatementCreator() {
		 * 
		 * @Override public PreparedStatement createPreparedStatement(Connection
		 * con) throws SQLException { // TODO Auto-generated method stub
		 * PreparedStatement pst =
		 * con.prepareStatement("insert into emp(empno,name,city,salary)" +
		 * "values(?,?,?,?)"); pst.setInt(1, 11); pst.setString(2, "JAY");
		 * pst.setString(3, "Londo"); pst.setDouble(4, 10000); return pst; } });
		 * 
		 * System.out.println("No of Rows Inseretd "+rows);
		 */
		List<String> empList = jt.query("select * from emp", new RowMapper<String>() {

			@Override
			public String mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				return rs.getString("empno") + " " + rs.getString("name") + " " + rs.getString("salary");
			}

		});

		empList.forEach(System.out::println);

		empList.forEach(x -> System.out.println(x));

		// empList.forEach(System.out::println(name));
	}
}
