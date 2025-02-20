package days10;

/**
 * @author kenik
 * @date 2025. 2. 14. - 오전 11:34:46
 * @subject 
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		// [ 별 찍기 - 1 ]
		// ****
		// ****
		// ****
		// ****
		/*
		System.out.println("****");
		System.out.println("****");
		System.out.println("****");
		System.out.println("****");
		*/
		/*
		for (int i = 1; i <= 4; i++) {
			System.out.println("****");			
		} // for i
		*/
		
		/*
		 *   i=1  T  j=1,2,3,4
		 *   i=2  T  j=1,2,3,4
		 *   i=3  T  j=1,2,3,4
		 *   i=4  T  j=1,2,3,4 
		 *   
		 *   ****개행
		 *   ****개행
		 *   ****개행
		 *   ****개행
		 * */ 
		for (int i = 1; i <= 4; i++) {       // 행
			// System.out.println("****");	
			for (int j = 1; j <= 4; j++) {   // 열
				System.out.print("*"); 				
			} // for j
			System.out.println(); // 개행
		} // for i
	} // main

} // class
