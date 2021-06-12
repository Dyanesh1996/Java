package com.oops;

public class Wall {
	
		private double width;
		private double height;
		
		
		public Wall() {
			
			
		}

		public Wall(double width, double height) {
			this.width = width;
			this.height = height;
		}
		
		
		public void setWidth(double width) {
			this.width = width;
			if(width ==0) {
				this.width = 0;
			}	
		}
		public double getWidth() {
			return this.width;
		}
		
		
		public void setHeight(double height) {
			this.height = height;
			if(height ==0) {
				this.height = 0;
			}
		}
		public double getHeight() {
			return this.height;
		}

		
		public double getArea() {
			double area =  width * height;
			return area;
		}


	public static void main(String[] args) {
			Wall wall =  new Wall(4.0, 5.0);
			System.out.println("Area of wall is : " + wall.getArea());
			
			wall.setHeight(-1.5);
			System.out.println("Height : " + wall.getHeight());
		
		
	}

}
