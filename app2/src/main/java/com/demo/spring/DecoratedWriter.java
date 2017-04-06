package com.demo.spring;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service
public class DecoratedWriter implements Writer {

	@Override
	public String write(String s) {
		// TODO Auto-generated method stub
		return "Decorated text1 Writer:"+s;
	}

}
