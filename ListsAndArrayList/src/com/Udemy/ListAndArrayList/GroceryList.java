package com.Udemy.ListAndArrayList;

import java.util.ArrayList;

public class GroceryList {
	private ArrayList<String> groceryList = new ArrayList<String>();
	
	public void addGroceryItems(String item) {
		groceryList.add(item);
	}
	
	public void printGroceryList() {
		System.out.println("You have " + groceryList.size() + " items in your Grocery List");
		for(int i = 0; i < groceryList.size(); i++) {
			System.out.println(groceryList.get(i));
			
		}
	}
	
	public void modifyGroceryList(int position, String item) {
		groceryList.set(2, "Corn Flour");
		System.out.println("Grocery item " + (position+1) + " has been modified to " + item);
	}
	
	
	public void removeGroceryItem(int position) {
		String theItem = groceryList.get(position);
		groceryList.remove(position);
		System.out.println((position+1) + " item has been removed from Grocery List");
	}
	
	
	public String searchItem(String searchItem) {
		boolean exists = groceryList.contains(searchItem);	//using in built function rather comparing searchItem with all list elements
		if(exists) {
			System.out.println("Item" + searchItem + " found");
		}
		return searchItem;
	}
	
}
