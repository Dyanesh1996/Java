/*
 * Final keyword can be used with : 
 * 1. Variable -> final variable's value can'e be changed
 * 2. Method -> final method can't be overrided.
 * 3. Class -> final class can't have subclass
 * 
 * 
 * 
 */
public class FinalKeywordDemo {

	public static void main(String[] args) {
		
		//final variable
		final int i = 5;
		//i++;					//final is used so value of i can't be changed.
		// i= 6;					//final is used so value of i can't be changed.
		System.out.println(i);
		
	}

}


class A{				//if this class is made final, we wouldn't be able to have class B that extends A
	
	final public void show() {
		System.out.println("In A show");
	}
}


class B extends A{
	/*public void show() {					//method overriding not possible			
		System.out.println("In B show");	//This will be printed if final is not used 
	}
	*/
}






