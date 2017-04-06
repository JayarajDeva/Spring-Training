package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
        ctx = new AnnotationConfigApplicationContext(Config.class);
       
        Concat app = (Concat) ctx.getBean("concat");
       
       System.out.println( app.doConcat("Jayaraj", "Deva"));
       System.out.println(app.getClass().getName());
       //System.out.println( app.doConcat1("Jayaraj", "Deva"));
     //  System.out.println( app.doConcat2("Jayaraj", "Deva"));
      
       
    }
}
