package com.Udemy.arrays;

import java.util.Arrays;

public class ArraySortMethod {

	public static void main(String[] args) {
		
		int [] myInteger  = {10, 30, 20, 45, 5};
		System.out.println("Before sorting -->" + Arrays.toString(myInteger));
		Arrays.sort(myInteger);
		System.out.println("Before sorting -->" + Arrays.toString(myInteger));

		
	}

}
