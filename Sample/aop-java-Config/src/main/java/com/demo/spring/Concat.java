package com.demo.spring;

import org.springframework.stereotype.Component;

@Component
public class Concat {
public String doConcat(String s1,String s2){
	//System.out.println("In Do concat");
	//Thread.sleep(1000);
	return s1+s2;
}
public String doConcat1(String s1,String s2){
	//System.out.println("In Do concat");
	return s1+s2;
}
public String doConcat2(String s1,String s2){
	//System.out.println("In Do concat");
	return s1+s2;
}
}
