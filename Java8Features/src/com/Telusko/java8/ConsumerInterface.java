//Consumer interface is the functional interface having just one method--> void accept(T t)


package com.Telusko.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


/*class consImpl implements Consumer<Integer>{

	@Override
	public void accept(Integer i) {		//As accept() is the only method consumer interface has
		System.out.println(i);	
	}
}*/


public class ConsumerInterface {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(4,5,6,7,8);
		
		/*Consumer<Integer> con = new consImpl();		//creating object of consumer as forEach requires it as a parameter
		values.forEach(con);		
		*/
		
		//But how about writing a method like following and not creating a separate class for object creation
		//DO FOLLOWING TO AVOID CREATING NEW CLASS JUST FOR CONSUMER OBJECT CREATION
		Consumer<Integer> con = new Consumer<Integer>() {
			@Override
			public void accept(Integer i) {
				System.out.println(i);
				
			}
		};
		values.forEach(con);
		
		
//-------------Lines 31 to 38 = Line 43-------------------Power of lambda expressions		
		
		//values.forEach(i -> System.out.println(i));
		
	}

}
