package com.oops.inheritance;

	public class Circle {
		double radius;
		
		public Circle(double radius) {
			if(radius < 0) {
				this.radius = 0;
			}else
				this.radius = radius;
		}
		
		
		public double getRadius() {
			return this.radius;
		}
		
		public double getArea() {
			return radius * radius * Math.PI ;
		}
		
		
		
		
		
}
