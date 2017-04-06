package com.demo.jpa;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.repo.MyRepository;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
       MyRepository myRepository=(MyRepository)ctx.getBean("myRepository");
       Iterable <Emp> empList = myRepository.getAllEmp500();
       Iterator<Emp> emp = empList.iterator();
       while (emp.hasNext()) {
		Emp e = emp.next();
		System.out.println(e.getName()+e.getSalary());
	}
    }
}
