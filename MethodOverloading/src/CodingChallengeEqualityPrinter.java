
public class CodingChallengeEqualityPrinter {

	public static void main(String[] args) {
		
		equalityPrinter(10, 10, -2);
		equalityPrinter(10, 10, 10);
		equalityPrinter(10, 9, 4);



	}
	public static void equalityPrinter(int a, int b, int c) {
		
		if(a < 0 || b< 0 || c< 0) {
			System.out.println("Invalid Value");
			
		}else if(a == b && a==c) {
			System.out.println("All are equal");
		}else if (a!= b && b != c && a!= c) {
			System.out.println("All are different");
		}else
			System.out.println("Neither all are different or same");
	}
}
