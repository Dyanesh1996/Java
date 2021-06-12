/*
 * BufferedReader and Scanner both are used for reading user input
 * 
 * Both are almost equally efficient.
 * BufferedReader is synchronized(i.e. can be accessed by multiple threads one by one)
 * 
 * 
 * 
 * Use of BufferedReader should suffice 3 questions :
 * 		1. What - What data we're getting from user
 * 		2. Where - From where we're getting that data
 * 		3. How	- In which format we're getting that data
 * 
 */



package com.telusko.StringBuffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DemoStringBuffer {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Enter a number");
		
		/*Scanner sc= new Scanner(System.in);		//Scanner way of taking user input
		int num = sc.nextInt();
		System.out.println(num);*/
		
		
		InputStreamReader is = new InputStreamReader(System.in);	//This is required in order 
																	//to pass object 'is' to BufferedReader
		BufferedReader br = new BufferedReader(is);
	
		
		int n = Integer.parseInt(br.readLine());
		System.out.println(n);
		
	}

}
