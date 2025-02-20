package days10;

/**
 * @author kenik
 * @date 2025. 2. 14. - 오전 11:34:46
 * @subject 
 * @content
 */
public class Ex03_04 {

	public static void main(String[] args) {
		// [ 별 찍기 - 4 ]            공백
		// ****      i=1   j=4       0
		//  ***      i=2   j=3       1
		//   **    	 i=3   j=2       2
		//    *      i=4   j=1       3
		// [3]
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print( i<=j?"*":" ");
			} // for j
			System.out.println();
		} // for i 
		// [1]
		/*
		for (int i = 1 ; i <= 4; i++ ) {       // 행
			// 공백 찍는 for
			for (int j = 1; j <= i-1; j++) {   // 열
				System.out.print(" "); 				
			} // for j
			// 별 찍는 for
			for (int j = 1; j <= 5-i; j++) {   // 열
				System.out.print("*"); 				
			} // for j
			System.out.println(); // 개행
		} // for i
		 */

		// [2]
		/*
		for (int i = 1 ; i <= 4; i++ ) {       // 행
			// 공백 찍기
			System.out.print(" ".repeat(i-1));
			// 별 찍는 for
			for (int j = 1; j <= 5-i; j++) {   // 열
				System.out.print("*"); 				
			} // for j
			System.out.println(); // 개행
		} // for i
		 */

	} // main

} // class
