/*
 * Throwable----> Super class of all the exceptions and Errors
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


//DemoForCheckedException

package com.telusko.exceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		
		int i, j=1, k=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter value of j");
		i = 8;
		
		
		try {
			j= Integer.parseInt(br.readLine());
			k = i/j;							
 
		}
		
		
		catch (IOException e) {
			System.out.println("Some IO error");
		}
		
		catch (ArithmeticException ae) {
			System.out.println("Cannot be divided by zero");
		}
		
		//following block cannot be used as first catch block before 'ae' and 'e'
		catch(Exception e) {							//Used when type of exception is not known
			System.out.println("Unknown exception");
		}
		
		
		System.out.println("Result is " + k);
		
	}

}



