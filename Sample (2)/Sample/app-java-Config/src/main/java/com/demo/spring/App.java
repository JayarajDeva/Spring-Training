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
        ctx = new AnnotationConfigApplicationContext(AppConfiguration.class);
       
       // WriterApp app = (WriterApp) ctx.getBean("writerApp");
        //System.out.println(app.writer.write("Test Imp"));
      
       
    }
}
