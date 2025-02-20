package days03;

/**
 * @author kenik
 * @date 2025. 2. 5. - 오전 7:21:46
 * @subject 
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		
		String name;
		int age; 
		
		// The local variable name may not have been initialized
		// System.out.println( name ); 
		
		// age cannot be resolved to a variable
		// System.out.println( age );
		
		// The value of the local variable n is not used
		int n ;
		n = 100;
		
		// The left-hand side of an assignment must be a variable
		// 'A' = 100;
		System.out.println(n);
		
		// Type mismatch: cannot convert from int to boolean
		// boolean gender = 100;
		
		// Duplicate local variable age
		// int age;

	} // main

} // class
