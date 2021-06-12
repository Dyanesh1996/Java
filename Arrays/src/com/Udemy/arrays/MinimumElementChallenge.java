package com.Udemy.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElementChallenge {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter count : ");
		int count = sc.nextInt();
		sc.nextLine();
		
		int [] returnedArray = readIntegers(count);
		int minNum = findMin(returnedArray);
		System.out.println("Minimum number is : " + minNum);
		
	}


	public static int [] readIntegers(int count) {		
		int [] MyArray = new int [count];
		
		System.out.println("Enter numbers : ");
		for(int i = 0; i < MyArray.length; i++) {
			
			MyArray[i] = sc.nextInt();
		}
		return MyArray;
		
	}

	
	public static int findMin(int [] array) {
		int min = 0;
		
		for(int i = 0; i < array.length ; i++) {
			if(array[0] < array[i]) {
				min = array[0];
			}
		}
		return min;	
	}
}
