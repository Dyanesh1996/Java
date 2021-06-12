package com.Udemy.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.lang.Comparable;

public class ComparableDemo {

	public static void main(String[] args) {
		
		List<Students> students = new ArrayList<Students>();
		students.add(new Students(1, 55));
		students.add(new Students(2, 89));
		students.add(new Students(3, 95));
		students.add(new Students(4, 51));
		students.add(new Students(5, 98));
		
		//Use of Comparable 
		
		Collections.sort(students);			//sort method of only 1 argument as we're using comparable	
		
		for(Students s : students) {		//Type is "Student" here and not Integer or String or Object or Double
			System.out.println(s);
		}
		
	}

}

class Students implements Comparable<Students>{
	int rollNo;
	int marks;
	public Students(int rollNo, int marks) {
		super();
		this.rollNo = rollNo;
		this.marks = marks;
	}


	@Override
	public int compareTo(Students o) {		//compares 2 objects..i.e.'Students' object which is passed here with 'this' object.
		return this.marks > o.marks ? -1 : this.marks < o.marks ? -1 : 0 ;
	}
	
}








