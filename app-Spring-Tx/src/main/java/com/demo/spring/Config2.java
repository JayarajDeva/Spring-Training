package com.demo.spring;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages={"com.demo.*"})
@EnableTransactionManagement

public class Config2 {
 
	
  @Bean
  public DataSource ds(){
  DriverManagerDataSource ds = new DriverManagerDataSource();
  ds.setDriverClassName("com.mysql.jdbc.Driver");
  ds.setUrl("jdbc:mysql://localhost:3306/demo2");
  ds.setUsername("root");
  ds.setPassword("admin");
  return ds;
  }
  
  @Bean
  public JdbcTemplate jt(){
	  JdbcTemplate jt = new JdbcTemplate();
	  jt.setDataSource(ds());
	  return jt;	  
	  }
  @Bean
  public DataSourceTransactionManager transactionManager(){
	  DataSourceTransactionManager txManager = new DataSourceTransactionManager(ds());
	  return txManager;
	  
  }
}
