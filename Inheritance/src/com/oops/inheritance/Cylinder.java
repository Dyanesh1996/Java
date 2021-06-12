package com.oops.inheritance;

	public class Cylinder extends Circle{

		double height;

		public Cylinder(double radius, double height) {
			super(radius);
			if(height < 0) {
				this.height = 0; 
			}
			else	
				this.height = height;
		}	
		
		
		public double getHeight() {
			return this.height;
		}
		
		public double getVolume() {
			return getArea() * getHeight();
		}
		

}
