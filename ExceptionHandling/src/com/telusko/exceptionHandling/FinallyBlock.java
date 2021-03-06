/*
 * Java finally block must be followed by try or catch block.
   Whether exception is handled or not, Java finally block is always executed
 * 
 * 
 * Finally block will be executed regardless of try block runs successfully or not.
 * If try block is successful, finally will be executed.
 * If try is not successful and hence any of the catch blocks is executed, 
    finally will also be executed at the last.
 * 
 */

package com.telusko.exceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FinallyBlock {

	public static void main(String[] args) {
		
		int i, j=1, k=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter value of j");
		i = 8;
		
		
		try {
				j= Integer.parseInt(br.readLine());
				k = i/j;							
				System.out.println("Result is " + k);
				
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
		
		
		finally {		//will be executed regardless of value of j(zero or non zero)
				System.out.println("finally  BYE");
		}
		
	}

}



