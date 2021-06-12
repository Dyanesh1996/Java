package com.Udemy.genericsBasics;

public class MyClass<T> {
	T obj;

	public MyClass(T obj) {
		super();
		this.obj = obj;
	}
	
	void showType() {
		System.out.println(obj.getClass().getName());
	}
}
