/*
 * String is immuatble.
 * 1. Cannot change values of String variable once object is created
 * 2. Cannot use setter method to set the new value.
 * 
 * Hence, use StringBuffer or StringBuilder to make String mutable
 * Both are same except StringBuffer is thread safe and builder is not
 * Thread safety -> one thread can be used by multiple threads
 * 
 */

public class StringBuilderAndBuffer {

	public static void main(String[] args) {

		StringBuffer sb =  new StringBuffer("Dnyanesh");
		sb.append(" Tathode");
		System.out.println(sb.charAt(4));
		//System.out.println(sb.replace(3, 6, "Dnyaneshhhhh"));
		System.out.println(sb);
		
		System.out.println(sb.substring(3));
		
	}
}
