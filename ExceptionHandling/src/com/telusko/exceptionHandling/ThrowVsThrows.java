/*
 * Suppose u r lazy enough to write the try-catch blocks that handle exceptions, 
 * just use "throws" keyword.
 * 
 * throws --> suppress the exception and doesn't handle it 
 * 
 * 
 * throw --> used when we forcefully want to throw any exception
 * 			 we pass object of an exception while throwing an forceful exception 	
 * 				[refer to Telusko's video(Not writing code for throw here)]
 */


package com.telusko.exceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowVsThrows {

	public static void main(String[] args) throws Exception {
		int i, j, k=0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		i = 8;
		
		System.out.println("Enter a number");
		j = Integer.parseInt(br.readLine());
		k=i+j;
		
		System.out.println("Result is : "+ k);
		
		
	}

}
