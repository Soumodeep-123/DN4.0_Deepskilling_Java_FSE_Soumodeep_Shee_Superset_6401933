package com.library.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;


@Aspect
public class LoggingAspect {
	
	@Around("execution(* com.library..*.*(..))") 
	public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();

        Object result = joinPoint.proceed(); // calls actual method

        long endTime = System.currentTimeMillis();
        System.out.println("🔍 [LOG] " + joinPoint.getSignature() + " executed in " + (endTime - startTime) + "ms");

        return result;
    }
}
