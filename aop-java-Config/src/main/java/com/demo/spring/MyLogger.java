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
public class MyLogger {
	
	Logger logger = Logger.getLogger("demo");
	
	
	
	
	

}
