package days10;

/**
 * @author kenik
 * @date 2025. 2. 14. - 오전 11:34:46
 * @subject 
 * @content
 */
public class Ex03_06 {

	public static void main(String[] args) {
		// [ 별 찍기 - 6 ]   이등변 삼각형  
		//                  공백  별
		// __*         i=1   2   1
		// _***        i=2   1   3
		// *****       i=3   0   5
		//           j==3-i
		//                      2*i-1
		// [2] 
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 5; j++) {
				//System.out.print( i+j==4 || i==3|| j-i==2?"*":" ");
				//System.out.print( i+j>=4   ?"*":" ");
				//System.out.print( j-i<=2 ?"*":" ");
				System.out.print( i+j>=4 && j-i<=2  ?"*":" ");
			} // for j
			System.out.println();
		} // for i 

		// [1] 
		/*
		for (int i = 1; i <= 3; i++) {      // 행
			// 공백 for
			for (int j = 1; j <= 3-i; j++) {
				System.out.print("_");
			} // for j			
			// 별  for
			for (int j = 1; j <= 2*i-1; j++) {
				System.out.print("*");
			} // for j			
			System.out.println(); // 개행
		} // for i
		 */




		// [문제] 행의 갯수를 입력받아서 이등변 삼각형 그리기.
		// > 행 갯수 ? 5
		// 1:     *
		// 2:    ***
		// 3:   ***** 
		// 4:  *******
		// 5: *********
		/*
		int row = 11;		
		for (int i = 1, lineNumber = 1 ; i <= row; i++, lineNumber++ ) {   
			System.out.printf("%0"+(row+"").length()+"d :",  lineNumber);

			for (int j = 1; j <= row-i; j++) { 
				System.out.print(" ");             
			} // for j
			for (int j = 1; j <= 2*i-1; j++) {
				System.out.print("*");             
			} // for j
			System.out.println();
		} // for i 
		 */

	} // main

} // class
