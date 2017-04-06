package com.demo.spring;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;

import com.demo.tx.Dao;
import com.demo.tx.Emp;

public class App {
	private static ApplicationContext ctx;

	public static void main(String[] args) {
		// ctx = new ClassPathXmlApplicationContext("context.xml");
		ctx = new AnnotationConfigApplicationContext(Config2.class);

        Dao dao= (Dao)ctx.getBean("daoImpl");
		
		List<Emp> empList= new ArrayList<>();
		empList.add(new Emp(217,"Ratan","Pune",30000));
		empList.add(new Emp(218,"Chetan","Pune",30000));
		empList.add(new Emp(219,"Ketan","Pune",30000));
		empList.add(new Emp(220,"Jiten","Pune",30000));
		empList.add(new Emp(211,"Kitten","Pune",30000));
		
		dao.save(empList);
	}
}
