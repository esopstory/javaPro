package days10;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author kenik
 * @date 2025. 2. 14. - 오후 4:21:30
 * @subject 
 * @content
 */
public class Ex04_03 {

	public static void main(String[] args) {
		int index=4;
		int [] korArr = {90,87,99,76,0};
		System.out.println( Arrays.toString(korArr) );
		Arrays.sort(korArr); // 1 2 3 4 5 오름차순 정렬
		// Arrays.sort(korArr, Collections.reverseOrder());  // 내림차순정렬
		System.out.println( Arrays.toString(korArr) );
		int mix = korArr[korArr.length-index];
		int max = korArr[korArr.length-1];

		// index=4
		// korArr.length =5
	} // main

} // class




