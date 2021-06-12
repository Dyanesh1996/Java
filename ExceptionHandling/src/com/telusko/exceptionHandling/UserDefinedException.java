/*
 * To create our own exception, we create a separate class that extends Exception class
 * 
 * 
 */
package com.telusko.exceptionHandling;

public class UserDefinedException {

	public static void main(String[] args) {
		
		int i = 5;
		try {
			if(i<10) {
				throw new MyException("Errorrrrrr");
				
					}
			}
		
		catch(Exception e) {
				System.out.println(e);
			}	
			
		}
	}	
		


class MyException extends Exception{
	
	public MyException(String message) {
		super(message);
	}
	
	
	
}



		
