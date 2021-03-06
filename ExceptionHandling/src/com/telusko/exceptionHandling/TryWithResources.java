//Demo for Try with resources


package com.telusko.exceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResources {

	public static void main(String[] args) throws Exception {
		
		//Following one line is equivalent to lines 19-26
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			String str = br.readLine();
		}
		
		
		/*
		//Following code in try block is 'creating a resource'
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			br.close();				//Resource deallocation

		}*/
	}

}
