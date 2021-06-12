package com.telusko.SpringAppWithAnnotationBasedApproach;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);	//"AppConfig.class" is replacement to "spring.xml" in xml based approach
    																							//All the stuff that we used to write in "spring.xml", we write in "AppConfig.class"
  
    	Apple iphone11 = factory.getBean(Apple.class);		//To get object of Apple class
        iphone11.config();
    }
}
