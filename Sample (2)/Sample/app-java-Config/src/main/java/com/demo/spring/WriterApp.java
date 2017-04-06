package com.demo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class WriterApp {

	@Autowired
	@Qualifier("decoratedWriter")
	@Lazy(value = true)
	Writer writer;

	public void print(String message) {
		System.out.println(writer.write(message));
	}
}
