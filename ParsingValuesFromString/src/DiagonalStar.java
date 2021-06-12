

public class DiagonalStar{
	
	public static void main(String [] args) {
		
		printStarPattern(5);
		
		
	}
	public static void printStarPattern(int number) {
		
		if(number < 5 ) {
			
			System.out.println("Invalid Value");
		}
		else {
			for(int i=1; i<=number; i++) {
				
				for(int j=1; j<=number; j++) {
					
					if(i==1 || i==number || j==1 || j==number) {
						
						System.out.print("*");
						
					}else if(i==j) {
						
						System.out.print("*");
						
					}else if (j == (number-i + 1)) {
						
						System.out.print("*");
						
					}else
						System.out.println(" ");	
				}	
				System.out.println();
			}	
		}	
	}	
}











/*public class DiagonalStar {

	public static void main(String[] args) {
		printSquareStar(100);
	}
	public static void printSquareStar(int number){
        if( number < 5) {
            System.out.println("Invalid number");
            return;
        }

        for (int row = 1; row <= number; row++){
            for (int col = 1; col <= number; col++){
                if (row == 1 || row == number || col == 1 || col == number){
                    System.out.print("*");
                } else if (row == col) {
                    System.out.print("*");
                } else if (col == (number - row + 1)) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }// close inner loop
            System.out.println();

        }// close outter loop
    }

}
*/