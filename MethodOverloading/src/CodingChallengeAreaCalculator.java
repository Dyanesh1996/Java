//NEED TO REVISIT TO MAKE FEW CHANGES


public class CodingChallengeAreaCalculator {

	public static void main(String[] args) {
		
		System.out.println(area(10.0));
		System.out.println(area(-1));	
		System.out.println(area(10.0, 5.0));
		System.out.println(area(-7.0, 5.0));

	}

	public static double area(double radius) {
		
		if(radius < 0) {
			System.out.println("Invalid!!");
			return -1.0;
		}
		
		else {
			double area = Math.PI * radius * radius;
			return area;
			
		}
	}
	
	public static double area(double x, double y) {
		
		if(x <0 || y < 0) {
			return -1;
		}
		
		else {
			
		double areaOfRectangle = x*y;
		return areaOfRectangle;
			
		}
	}
}
