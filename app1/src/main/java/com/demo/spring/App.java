package com.demo.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    private static ApplicationContext ctx;

	public static void main( String[] args )
    {
        ctx = new ClassPathXmlApplicationContext("context.xml");
        Mail mail=(Mail) ctx.getBean("mail");
        Mail mail1=(Mail) ctx.getBean("mail");
        System.out.println(mail.getMessage().getBody());
        
        System.out.println(mail.hashCode()==mail1.hashCode());
       List<String> list =(List<String>) ctx.getBean("list");
       list.forEach(System.out::println);
    }
}
