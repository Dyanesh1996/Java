package com.Udemy.arrays;

import java.util.Arrays;

public class ReverseArrayChallenge {

	public static void main(String[] args) {
		
	//	1 2 3 4 5 6		original array
	//	2 1 3 4 5 6		i = 0
	//  2 3 1 4 5 6 	i = 1
	//	2 3 4 1 5 6		i = 2
		int [] array = {1, 5, 3, 7, 11, 9};
		System.out.println("Array = " + Arrays.toString(array));
		
		reverse(array);
		System.out.println("Reversed Array = " + Arrays.toString(array));
		
	}
	
	private static void reverse(int [] array) {
		int maxIndex = array.length - 1;
		int halfLength = array.length / 2;
		int temp;
		
		for(int i = 0; i < halfLength; i++) {
			temp = array[i];
			array [i] = array [maxIndex - i];
			array [maxIndex - i] = temp;
			
			
			
		}
	}

}
