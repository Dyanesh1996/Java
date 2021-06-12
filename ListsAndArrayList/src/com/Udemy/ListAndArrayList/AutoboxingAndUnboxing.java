package com.Udemy.ListAndArrayList;

import java.util.ArrayList;

class intClass{
	private int myValue;

	public intClass(int myValue) {
		super();
		this.myValue = myValue;
	}

	public int getMyValue() {
		return myValue;
	}

	public void setMyValue(int myValue) {
		this.myValue = myValue;
	}	
	
}



public class AutoboxingAndUnboxing {
	
	public static void main(String[] args) {
		String [] strArray = new String[10];
		int [] intArray = new int [10];
		
		ArrayList<String> strArrayList = new ArrayList<String>();
		strArrayList.add("Dnyanesh");
		
		/*ArrayList<int> intArrayList = new ArrayList<int>();	--> this is not possbile
			int is primitive type and ArrayList requires 
			class as parameter..so give "Integer" instead 
			of "int" as Integer is wrapper class of int.
		*/
	
		ArrayList<intClass> intClassArrayList = new ArrayList<intClass>();
		intClassArrayList.add(new intClass(54));
		
		
		
		//Instead of writing above 2 lines, let's use Integer instead of int
		Integer integer = new Integer(12);
		Double doubleValue = new Double(12.3);
		
		ArrayList<Integer> intArrayList = new ArrayList<Integer>();
		for(int i = 0; i<=10; i++) {
			intArrayList.add(Integer.valueOf(i));	//this part is AUTOBOXING-- converting primitive type into class
		}
		
		for(int i = 0; i<=10; i++) {
			System.out.println(i + " --> " + intArrayList.get(i).valueOf(i));	//this part is UNBOXING-- converting class to primitive type
		}
		
		Integer myIntValue = 56;		//Integer.valueOf(56) gets compiled in the background
		int myInt = myIntValue.intValue();	//myIntValue.intValue gets compiled in the background
	}

}
