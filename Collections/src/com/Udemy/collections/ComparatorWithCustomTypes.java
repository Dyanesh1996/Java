package com.Udemy.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorWithCustomTypes {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(1, 55));
		students.add(new Student(2, 89));
		students.add(new Student(3, 95));
		students.add(new Student(4, 51));
		students.add(new Student(5, 98));
		
		//How to sort the marks in descending order(our custom order)
		
		Collections.sort(students, (s1, s2) -> {							//We're using lambda function and writing method in it rather creating 
																			//a new class for the sake of comparator reference
			
			return s1.marks > s2.marks ? -1 : s1.marks < s2.marks ? 1 : 0;	//use of ternary operator..too easy.
																			//(if s1.marks > s1.marks {return -1} else if (s1.marks < s2.marks{return 1} else return 0))
			
		});			
		
		
		
		for(Student s : students) {		//Type is "Student" here and not Integer or String or Object or Double
			System.out.println(s);
		}
		
	}

}

class Student{
	int rollNo;
	int marks;
	public Student(int rollNo, int marks) {
		super();
		this.rollNo = rollNo;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", marks=" + marks + "]";
	}
	
}



