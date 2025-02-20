package days10;

/**
 * @author kenik
 * @date 2025. 2. 14. - 오전 11:34:46
 * @subject 
 * @content
 */
public class Ex03_02 {

	public static void main(String[] args) {
		// [ 별 찍기 - 2 ]
		// *      i=1   j=1
		// **     i=2   j=2
		// ***    i=3   j=3
		// ****   i=4   j=4
		// [2]
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print( i>=j?"*":" ");
				/*
				if ( i >= j ) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				} // if
				*/
			} // for j
			System.out.println();
		} // for i
		
		/* [1]
		for (int i = 1; i <= 4; i++) {       // 행 
			for (int j = 1; j <= i; j++) {   // 열
				System.out.print("*"); 				
			} // for j
			System.out.println(); // 개행
		} // for i
		*/
	} // main

} // class
