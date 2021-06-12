package com.udemy.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> placesToVisit = new LinkedList<String>();
		placesToVisit.add("Perth");
		placesToVisit.add("Melbourne");
		placesToVisit.add("Rome");
		placesToVisit.add("Venice");
		placesToVisit.add("Hampi");
		placesToVisit.add("NYC");
		placesToVisit.add("Dallas");
		placesToVisit.add("London");
		
		printList(placesToVisit);
		placesToVisit.add(1, "Amsterdam");
		printList(placesToVisit);
		
		placesToVisit.remove("Hampi");
		printList(placesToVisit);
		
		placesToVisit.offer("NYC");
		printList(placesToVisit);
		
		addInOrder(placesToVisit, "Pune");
		printList(placesToVisit);

		
		
	}
	
	private static void printList(LinkedList<String> linkedList) {
		Iterator<String> it = linkedList.iterator();
		while(it.hasNext()) {		
			System.out.println("Now visiting : " + it.next());
		}
		
		System.out.println("===============================");
		
	}
	
	
	public static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
		ListIterator<String> it = linkedList.listIterator();
		while(it.hasNext()) {
			int comparison = it.next().compareTo(newCity);	//As compareTo function returns integer.
			if(comparison == 0) {
				System.out.println(newCity + " is already there in our list");
				return false;
			}else if(comparison > 0) {
				// new city should appear before this one
				//Perth -> Mumbai
				it.previous();
				it.add(newCity);
				System.out.println(newCity + " has been added");
				return true;
			}else if(comparison < 0) {
				//move  on next city
				//no code here
			}
				
			}
		it.add(newCity);
		return true;
		}
	}


