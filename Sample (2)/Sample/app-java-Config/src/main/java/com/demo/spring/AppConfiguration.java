package com.demo.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages={"com.demo.spring"})
public class AppConfiguration {
 @Bean()
 @Lazy(value=true)
  @Scope(scopeName="prototype")
  public DecoratedWriter decoratedWriter(){
	  DecoratedWriter writer = new DecoratedWriter();
	  return writer;
  }
}
