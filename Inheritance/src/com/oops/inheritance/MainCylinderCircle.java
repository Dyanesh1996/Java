package com.oops.inheritance;

public class MainCylinderCircle {

	public static void main(String[] args) {
		Circle circle = new Circle(10);
		System.out.println("Circle.radius : " + circle.getRadius());
		System.out.println("Circle.area : " + circle.getArea());
		
		Cylinder cylinder = new Cylinder(10, 5);
		System.out.println("Cylinder.height : " + cylinder.getHeight());
		System.out.println("Cylinder.radius : " + cylinder.getRadius());
		System.out.println("Cylinder.area : " + cylinder.getArea());
		System.out.println("Cylinder.volume : " + cylinder.getVolume());
	}

}
