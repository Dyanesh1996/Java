package com.Telusko.springAOP.SpringAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
 * Show() method will be called and then log() method of Helper will be called without writing log() in show().
 * Thanks to @Aspect
 * 
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	Alien alien = context.getBean(Alien.class);
    	alien.show();
    }
}
