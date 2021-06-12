package com.udemy.linkedList;

import java.util.ArrayList;

public class MainOfCustomer {

	public static void main(String[] args) {
		Customer customer = new Customer("Dny", 93.58);
		Customer anotherCustomer;
		anotherCustomer = customer;
		
		anotherCustomer.setBalance(100.00);
		System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());
		
		ArrayList<Integer> intArrayList = new ArrayList<Integer>();
		intArrayList.add(1);
		intArrayList.add(3);
		intArrayList.add(7);
		
		for(int i = 0; i < intArrayList.size(); i++) {
			System.out.println(i + " : " + intArrayList.get(i));
		}
		
		intArrayList.add(1, 10);
		for(int i = 0; i < intArrayList.size(); i++) {
			System.out.println(i + " : " + intArrayList.get(i));
		}
		
	}

}
