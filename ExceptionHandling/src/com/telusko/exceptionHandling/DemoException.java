/*
 * Throwable----> Super class of all the exceptions
 * 	
 * 	Throwable :
 * 			- Exception class(Can be handled)
 * 						- Checked
 * 								- IOException
 * 								- SQLException
 * 						- Unchecked
 * 								- All Runtime exceptions like : 
 * 										- ArithmaticException
 * 										- ArrayIndexOutOfBoundsException
 * 										- FileNotFoundException
 * 			- Error class(Can't be handled)
 * 
 * 
 * 
 * 
 * - We can have multiple catch blocks for one try..Following is the example
 * 		- We're using 2 catch blocks to handle exceptions of 2 types
 * 			which are ArithmaticException and ArrayIndexOutofBoundsException
 * 
 * 
 * 
 */



//DemoForUncheckedException

package com.telusko.exceptionHandling;

public class DemoException {

	public static void main(String[] args) {
		
		
		int i, j, k=0;
		i = 8;
		j = 0;
		
		try {
			k = i/j;
		}
		
		catch(ArithmeticException e){						//Or we can write just "Exception e" as well in the catch block
			System.out.println("Cannot divide by zero");		//Unchecked exception
		}
		
		System.out.println(k);
		
	}

}



