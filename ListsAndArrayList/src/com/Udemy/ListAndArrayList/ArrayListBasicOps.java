package com.Udemy.ListAndArrayList;

import java.util.ArrayList;

public class ArrayListBasicOps {

	public static void main(String[] args) {
	
		ArrayList<String> strArrayList = new ArrayList<String>();
		strArrayList.add("Dnyanesh");
		strArrayList.add("Shivani");
		System.out.println(strArrayList);
		
		System.out.println(strArrayList.contains("Shivani"));
		System.out.println(strArrayList.get(1));
		System.out.println(strArrayList.equals("Dny"));
		System.out.println(strArrayList.set(0, "DNYANESH"));
		System.out.println(strArrayList);
		System.out.println(strArrayList.remove(1));
		System.out.println(strArrayList);

	}

}
