package com.library.Aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	
	@Before("execution(* com.library.Service.BookService.*(..))")
	public void beforead() {
		System.out.println("Before the execution");
	}
	
	@After("execution(* com.library.Service.BookService.*(..))")
	public void afterad() {
		System.out.println("After the execution");
	}
	
}
