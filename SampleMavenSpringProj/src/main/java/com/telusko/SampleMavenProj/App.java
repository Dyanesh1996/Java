/*	How do we achieve DI ?
 * Using ApplicationContext container...Lot of times, different objects from project need to communicate with each other
 * Rather us doing that, Spring does that with the help of Application Context container..This container acts like a wrapper
 * that contains all these objects
 *
 */


package com.telusko.SampleMavenProj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        /*Car car = new Car();
        car.drive();*/
        
        /*Suppose now we need to change Car to Bike
        So again we'll need to create object of Bike by hardcoding
        Why hardcode when someone else can do it for us
        */
        
        //We're dependent on Bike and Car objects to run the App.java, hence let's remove those dependencies
        	//by using Dependency Injection
         
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        
         Vehicle obj = (Vehicle) context.getBean("car"); 	//Adding cast bcoz getBeans gives u object of Vehicle
         		/*getBean("vehicle") is just a string...Computer doesn't know which object to call. So we need to 
         		 * define somewhere about which object to call when vehicle is called.*/
         
         obj.drive();
        
         
         Tyre t = (Tyre) context.getBean("tyre");	/*Spring.xml stuff--> bean is "tyre"(bean is nothing but an object)..
         												class is "Tyre"*/
         System.out.println(t.getBrand());		/*We're setting up property value in xml using setBrand method.
         										(Can be done using Constructor Injection also)..Constructor needs 
         										to be created in Tyre class then*/
         
         
         //**********Creating Car object to understand the @Autowire annotation****************
         
         Car c = (Car) context.getBean("car");
         c.drive();
         
         
    }
}
