package com.Telusko.springAOP.SpringAOP;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;


//Advice - Before, After when ?...Like when the log method should be called...Before show() or after show() 	 	

//Pointcut - Where ?

@Component
@Aspect
@EnableAspectJAutoProxy
public class Helper {
	
	@Before("execution(public void show()")			//log() method will be called before show()
	public void log() {								//This method will maintain logs 
	
		System.out.println("show called");
	}
}
