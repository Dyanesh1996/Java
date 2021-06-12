package com.Udemy.genericsBasics;

import java.awt.List;
import java.util.ArrayList;


class Container <T extends Number>{
	Double value;
	
	
	
	
	public Container(Double d) {
		super();
		this.value = d;
	}




	public Container(double d) {
		// TODO Auto-generated constructor stub
	}




	void show() {
		System.out.println(value.getClass().getName());
	}
}

public class Experiment {

	public static void main(String[] args) {
		Container<Double> obj = new Container<Double>(0.9909090575775);
		obj.show();
	}

}
