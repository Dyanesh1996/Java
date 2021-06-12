package com.Udemy.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CollectionsDemo2 {

	private static final String Collection = null;

	public static void main(String[] args) {
		List <Integer> arraylist = new ArrayList<Integer>(); 	
		
		arraylist.add(10);
		arraylist.add(4);
		arraylist.add(19);
		arraylist.add(2, 30);
		
		//Let's say we need to add random values to list
		
		Random r = new Random();		//Default random function to generate random number
		for(int i = 1; i<= 10; i++) {
			arraylist.add(r.nextInt(100));
		}
		
		Collections.sort(arraylist);	//Sort method won't be available for Collection interface
		
		
		for(int i : arraylist) {
			System.out.println(i);
		}
		
		
	}

}
