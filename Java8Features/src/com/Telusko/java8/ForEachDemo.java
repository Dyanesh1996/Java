//Java 1.8 has forEach loop..They call it as External Loop
//Earlier versions had normal for loop, enhanced for loop..They call it Internal For Loop




package com.Telusko.java8;

import java.util.Arrays;
import java.util.List;

public class ForEachDemo {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(4,5,6,7,8);
		
		//----------Ways to print this values list
		
		/*1. Using normal for loop					
		for(int i = 0; i< values.size(); i++) {			//External For loop
			System.out.println(values.get(i));
			
		}*/
		
		
		/*2. Using Enhanced for loop					//External For loop
		for(int v : values) {
			System.out.println(v);
		}*/
		
		
		//-------------Using forEach loop...An internal loop
		values.forEach(i -> System.out.println(i));
		
	}

}
