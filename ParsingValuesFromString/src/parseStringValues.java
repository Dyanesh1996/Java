
public class parseStringValues {

	public static void main(String[] args) {
		String numberAsString = "12345";
		
		System.out.println("numberAsString : " + numberAsString);
		
		int number = Integer.parseInt(numberAsString);		//can be done for double, float, long also
		System.out.println(number);
		
		numberAsString += 1;		//Concatenation as numberAsString is stored in string
		number += 1;				// Addition as number is stored in integer
		
		System.out.println("Concatenated string values is : " + numberAsString);
		System.out.println("New integer value is : " + number);
	}

}
