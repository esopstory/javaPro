package days05;

import java.util.Arrays;

/**
 * @author kenik
 * @date 2025. 2. 7. - 오전 6:56:52
 * @subject 
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		/* 배열 선언 + 각 요소 초기화 = 배열 초기화
		// 배열 선언
		int [] kors = new int[3];
		// 각 요소 초기화
		kors[0] = 89;
		kors[1] = 34;
		kors[2] = 66;
		*/
		
		// int [] kors = new int[] { 89, 34, 66};
		int [] kors = { 89, 34, 66 };
		
		// Arrays 클래스
		System.out.println( Arrays.toString(kors) );
	} // main

} // class
