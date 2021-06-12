package com.Udemy.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionsDemo {

	public static void main(String[] args) {
		int [] numbers = new int [10];
		Object [] values = new Object [5];
		values [3] = "Dnyanesh";
		values [2] = 5;
		
		for(int i = 0; i < values.length; i++) {
			System.out.println(values [i] );
		}
		
		Collection values2 = new ArrayList();
		//collection can have all types of values. Mention <Integer> or <String> or others for specific values.
		values2.add(3);
		values2.add("Dny");
		values2.add(5.6f);
		//How would you add value 9 after "Dny" ---> Use List instead of collection
		values2.add(9);		
		
		
		
		//How to print this collection ? --> 1) Use Iterator or 2) Enhanced for loop
		
		//way 1 : using iterator
		Iterator it = values2.iterator();
		while(it.hasNext()) {
			System.out.println(" values are : " + it.next());
		}
		
		
		//way 2 : using enhanced for loop
		for(Object i : values2) {		//Object bcoz we have all types of elements in collection
			System.out.println(i);
		}
		
	}

}
