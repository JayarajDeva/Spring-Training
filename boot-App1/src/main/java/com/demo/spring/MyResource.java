package com.demo.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyResource {
    
	@RequestMapping("/hello")
	public String getMessage(){
		return "test";
	}
	
}
