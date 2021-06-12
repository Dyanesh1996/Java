package com.Udemy.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class ComparatorInterfaceBasics {

	public static void main(String[] args) {
		List<Integer> arraylist = new ArrayList<Integer>();

		arraylist.add(10);
		arraylist.add(4);
		arraylist.add(19);
		arraylist.add(2, 30);


		// Let's say we need to add random values to list

		Random r = new Random(); // Default random function to generate random number
		for (int i = 1; i <= 10; i++) {
			arraylist.add(r.nextInt(100));
		}

		// How to sort elements in a way that we need ?
		// ---> Use comparator

		Comparator c = new NumCompare(); 	// NumCompare is a class that we've created.
		Collections.sort(arraylist, c);		//Will sort all numbers with their last value increasing order
		

		for (int i : arraylist) {
			System.out.println(i);
		}
	}

}

//Creating a new class that implements comparator as we cannot create an instance of comparator.

class NumCompare implements Comparator<Integer> {

	public int compare(Integer i1, Integer i2) {
		/*int diff = 0;
		if (i1 % 10 > i2 % 10) {
			diff = 1;
		} else if (i1 % 10 < i2 % 10) {
			diff = -1;
		}
		return diff;
		*/
		
		return i1%10 > i2%10 ? 1 : i1%10 < i2%10 ? -1 : 0;		//use of ternary operator.
																//Reduced all if-else code from above
	}

}
