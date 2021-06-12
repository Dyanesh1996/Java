/*Set--------	
	- Cannot have duplicate values. Every element is unique unlike in List.	
	- Order of getting elements from set is random unlike Lists.
*/


package com.Udemy.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {
		Set<Integer> values = new HashSet<Integer>();	//Hashset output elements random order.
		//Set<Integer> values = new TreeSet<Integer>();	//To get output in sorted format
		values.add(10);
		values.add(12);
		values.add(3);
		values.add(9);
		values.add(1);
		values.add(98);
		values.add(4);
		System.out.println(values.add(10));		//Duplicate values can't be added in set..Boolean add method will return false
		
		
		for(int s : values) {
			System.out.println(s);
		}
		
	}

}
