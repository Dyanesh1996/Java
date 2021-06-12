package com.Udemy.arrays;

import java.util.Arrays;

public class ReferencesTypesVsValueTypes {

	public static void main(String[] args) {
		int myIntValue = 10;
		int anotherIntValue = myIntValue;
		
		System.out.println("myIntValue = " + myIntValue);
		System.out.println("anotherIntValue = " + anotherIntValue);
		
		
		
		anotherIntValue++;
		
		System.out.println("myIntValue = " + myIntValue);
		System.out.println("anotherIntValue = " + anotherIntValue);
		
		
		
		int [] myIntArray = new int[5];
		int [] anotherArray = myIntArray;
		
		System.out.println("myIntArray = " + Arrays.toString(myIntArray));
		System.out.println("anotherIntArray = " + Arrays.toString(anotherArray));
		
		
		anotherArray[0] = 1;
		System.out.println("after change myIntArray = " + Arrays.toString(myIntArray));
		System.out.println("after change anotherIntArray = " + Arrays.toString(anotherArray));
	
		
		modifyArray(myIntArray);
		System.out.println("after creating method myIntArray = " + Arrays.toString(myIntArray));
		System.out.println("after creating method anotherIntArray = " + Arrays.toString(anotherArray));
		
		
	}
	
	
		private static void modifyArray(int [] array) {
			array [0] = 2;
		}

}
