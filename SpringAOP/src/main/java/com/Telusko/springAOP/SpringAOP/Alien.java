/*	As a developer, we only write business logic in methods.
 * Log code, security code is not our thing.
 * 
 * Business logic is different for all the methods. But log code,
 * security code can be same.
 * 
 * Hence we create another classes that writes all the same stuff like
 * code for logs, security, transaction and all.
 * 
 * But again, we'll need to call those classes in Alien
 * To avoid direct calling those classes, we use AOP.
 * 
 * ***************AOP: Aspect Oriented Programming************************
 * 
 * 
 */

package com.Telusko.springAOP.SpringAOP;

import org.springframework.stereotype.Component;

//Cross cutting concern - Aspect

@Component
public class Alien {
	
	public void show() {		//Use Advice to determine when to call the log() method
		
		//log code - 2 lines 
		//security - 1 line
		//transaction - Begin
		
		//15 lines - Business logic
		
		//transaction - commit
		
		System.out.println("Welcome back Aliens");
		
		//log code - 2 lines again
	}
	
}
