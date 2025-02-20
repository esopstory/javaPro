package days07;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author kenik
 * @date 2025. 2. 11. - 오후 2:07:22
 * @subject 
 * @content
 */
public class Ex04_04 {

	public static void main(String[] args) {
		// 2 3 4
		// 5 6 7
		// 8 9
		
		// k=1  d=2 ~ +2
		// k=2  d=5 ~ +2
		// k=3  d=8 ~ +2
		// 3*k-1
		
		// 10단 출력 X
		for (int k = 1; k <=3 ; k++) {
			for (int i = 1; i <= 9; i++) {
				for (int d = 3*k-1; d <= 3*k-1+2 && d < 10; d++) {  // 단
					// if( d == 10 ) continue;
					// if( d == 10 ) break;
					System.out.printf("%d*%d=%2d ", d, i, d*i);
				} // for d
				System.out.println();
			} // for i	
			System.out.println();
		} // for k
		
		/*
		int n = 3;
		if( n > 3 && n < 10 ) {
			//if( n < 10 ) {				
			//}
		}
		*/

	} // main

} // class
