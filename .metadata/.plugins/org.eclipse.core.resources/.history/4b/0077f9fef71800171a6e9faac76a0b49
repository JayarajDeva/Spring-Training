package com.demo.spring;

import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author 14
 *
 */
@Component
@Aspect
public class MyLoggerAround {
	
	Logger logger = Logger.getLogger("demo");
	
	
	@Around("execution(* com.demo.spring.Concat.doConcat(..))")	
   public Object logAfter(ProceedingJoinPoint jointpoint) throws Throwable{
		logger.info("Before doconcat method Call..."); 
		Object retval = jointpoint.proceed();
		System.out.println("Around after is running!");
		System.out.println("******");	  
	    return retval;
	}
	
	

}
