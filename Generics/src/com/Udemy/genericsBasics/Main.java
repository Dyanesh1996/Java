package com.Udemy.genericsBasics;

public class Main {

	public static void main(String[] args) {
		
		MyClass<Integer> myclass = new MyClass<>(10);	//Using <Integer> is a generic..<T> is being used as <Integer>
		MyClass<Double> mydoubleclass = new MyClass<>(20.0);
		
		myclass.showType();
		mydoubleclass.showType();
	}

}
