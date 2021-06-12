package com.Udemy.Generics;

import java.util.ArrayList;

public class WithGenerics_intro2 {

	public static void main(String[] args) {
		ArrayList<Integer> items = new ArrayList<Integer>();	
		
		items.add(1);
		items.add(2);
		items.add(3);
		items.add(4);
		items.add(5);
		
		printDoubled(items);
		
	}
	
	
	private static void printDoubled(ArrayList<Integer> arrayList) {
		for(int i : arrayList) {
			System.out.println(i * 2);
		}
		
	}
	

}
