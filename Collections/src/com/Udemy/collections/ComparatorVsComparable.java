/*----------Comparator--------------
	-	Collections.sort(Arraylist_name) is used.
	- 	Uses toString() method.
	-	Use of lambda function.  
	-	In the background it uses a method, public int compare(laptop1, laptop2)....i.e.: we compare 2 passed parameters here.

-----------Comparable---------------
	-	Collcetions.sort(Arraylist_name, c) is used where 'c' is comparable object.
	-   Uses compareTo() method---> compateTo method has only one parameter(which is object)...It compares 'this' object with 'passed' object.
	-	No use of lambda function.
	-	It uses compareTo(laptop o) method that has only 1 parameter..It compares 'this' parameter with 'o' parameter
*/

//**************************Following demo is for Comparable..Check ComparatorDemo class file for comparator stuff**************************

package com.Udemy.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ComparatorVsComparable {

	public static void main(String[] args) {
		List<Laptop> laps = new ArrayList<>();
		
		laps.add(new Laptop("Dell", 8, 800)); 
		laps.add(new Laptop("Apple", 16, 1000));
		laps.add(new Laptop("HP", 8, 700));
		
		Collections.sort(laps);
		
		
		/*Iterator it = laps.iterator();			//'Iterator' way of printing list.
		while(it.hasNext()) {
			System.out.println(it.next());
		}*/
		
		
		for(Object i : laps) {					//'Enhanced for loop' way of printing list.
			System.out.println(i);
		}
		
	}

}

class Laptop implements Comparable<Laptop>{
	private String brand;
	private int ram;
	private int price;
	
	public Laptop(String brand, int ram, int price) {
		super();
		this.brand = brand;
		this.ram = ram;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", ram=" + ram + ", price=" + price + "]";
	}
	
	@Override
	public int compareTo(Laptop o) {									//compares 'this' object with passed 'Laptop' object(o here). 
		return this.price > o.price ? 1 : this.price < o.price ? -1 : 0; //sorted on the basis of price
		/*-------------------------EQUIVALENT TO------------------------
		if(this.price > o.price){return 1} else if{this.price < o.price{return -1} else return 0;}*/
		
	}
	

	
}


