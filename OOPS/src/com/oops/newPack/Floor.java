package com.oops.newPack;

public class Floor {
	
	double width;
	double length;
	
	public Floor(double width, double length) {
		this.width = width;
		this.length = length;
	}

	public void setWidth(double width) {
		if(width < 0) {
			this.width = 0;
		}
		else
			this.width = width;
	}
	
	public double getWidth() {
		return width;
	}

	public void setLength(double length) {
		if(length < 0) {
			this.length = 0;
		}
		else
			this.length = length;
	}
	
	public double getLength() {
		return length;
	}

	
	public double getArea() {
		return (width * length);
	}

}
