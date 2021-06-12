package com.Udemy.arrays;

public class ArrayInitialization {

	public static void main(String[] args) {
		
		//way 1 to initialize arrays
		
		int[] intArray = new int[10]; 
		intArray [5] = 25;
		intArray [3] = 78;
		System.out.println(intArray[5]);
		
		
		//way 2 to initialize arrays
		
		int [] myIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println(myIntArray[6]);
		System.out.println(myIntArray[8]);
		
		
		//way 3 to initialize arrays
		
		int [] myNewIntArray = new int[10];
		for(int i = 0; i<myNewIntArray.length; i++) {	// Instead of using : for(int i=0; i<10; i++);
			myNewIntArray[i] = i*10;
		}
		
		for(int i=0; i<myNewIntArray.length; i++) {
			System.out.println("Element " + i + " is : " + myNewIntArray[i]);
		}
		
		
	}

}
