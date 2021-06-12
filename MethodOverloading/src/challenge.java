
public class challenge {

	public static void main(String[] args) {
			
		calcFeetAndInchesToCentimeters(5, 8.0);
		calcFeetAndInchesToCentimeters(2500);
		calcFeetAndInchesToCentimeters(6, 15);		//won't return anything as per condition applied
		calcFeetAndInchesToCentimeters(-6, 13);		//won't return anything as per condition applied
		calcFeetAndInchesToCentimeters(6, 0.0);
	}
	
	public static double calcFeetAndInchesToCentimeters(int feet, double inches) {
		
		if ((feet >= 0) && (inches >=0 && inches <=12)) {
		
			double calculatedCentimeters = feet * 12 * 2.54;
			System.out.println("The calculated centimeter for " + feet + " feets " + "and " + inches + " inches is : " + calculatedCentimeters);
			return calculatedCentimeters;
	}else 
		return -1;
	
	}
	
	public static double calcFeetAndInchesToCentimeters(int inches) {		///another method with same name..method overloading
		
		if(inches >=0) {
			
			double calculatedCentimeters = inches * 2.54;
			System.out.println("The calculated centimeters for " + inches + " inches are : " + calculatedCentimeters );
			return calculatedCentimeters;
		}
		
		else 
			return -1;
	}
	
}