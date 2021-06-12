package com.Udemy.arrays;
import java.util.Scanner;

public class ArraySampleOps {
	
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[] myIntegers = getIntegers(5);
		for(int i = 0; i<myIntegers.length; i++) {
			System.out.println("Element " + i + " has value " + myIntegers[i]);
		}
		
			System.out.println("Average of array numbers is : " + getAverage(myIntegers));
	}
	
	
	public static int [] getIntegers(int number) {
		System.out.println("Enter " + number + " integer values");
		int [] values = new int [number];
		
		for(int i = 0; i <values.length; i++) {
			values[i] = scanner.nextInt(); 
		}
		
		return values;
	}
	
	
	public static double getAverage(int [] array) {
		int sum = 0;
		//double average;
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		return  sum / array.length;
		
	}
	
	
	

}
