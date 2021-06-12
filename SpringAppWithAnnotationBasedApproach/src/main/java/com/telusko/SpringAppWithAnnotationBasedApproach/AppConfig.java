//This class is a replacement to spring.xml in xml based approach.
//We pass this to AnnotationConfigApplicationContext()



package com.telusko.SpringAppWithAnnotationBasedApproach;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.telusko.SpringAppWithAnnotationBasedApproach")	//Remove all the @Bean stuff following..This one line is enough
public class AppConfig {
/*	
	@Bean							//Use this otherwise Spring will not find bean(We can make use of @Component to avoid manual creations of beans)
	
	public Apple getPhone() {		//Because this method needs to return an object of
									//Apple to pass to AnnotationConfigApplicationContext
		return new Apple();
	} 
	
	@Bean							//We can make use of @Component to avoid manual creations of beans
	public MobileProcessor getProcessor() {
		return new Snapdragon();
	}
*/	
	
}
