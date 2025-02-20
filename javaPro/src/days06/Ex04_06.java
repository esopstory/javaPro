package days06;

import java.util.Arrays;

/**
 * @author kenik
 * @date 2025. 2. 10. - 오후 2:13:16
 * @subject 
 * @content
 */
public class Ex04_06 {

	public static void main(String[] args) {
		// 세 정수(n,m,o) 중에 가장 큰값, 작은값 
		// [문제] 여러 20개의 정수 중에 가장 큰값, 작은값 출력
		//      ( 배열을 사용해서 처리 )
		
		// 배열의 초기화
		int [] m = {10, 31, 98, 38, 68, 91, 95, 76, 27, 29};
		m = new int[10];
		for (int i = 0; i < m.length; i++) {
			m[i] = (int)(Math.random()*101);  // 0 <=     <= 100
		}
		// [10][][][][][][][][][29]                      [null]
		// 0x100                                           m
		
		System.out.println( Arrays.toString(m));
		
		/*
		int max = -999;
		int max = 999;
		for (int i = 0; i < m.length; i++) {
			max = Math.max(max, m[i]);
		} // for i
		*/
		
		int max, min;
		max = min = m[0];
		
		for (int i = 1; i < m.length; i++) {
			max = Math.max(max, m[i]);
			min = Math.min(min, m[i]);
		} // for i
		System.out.println( max );
		System.out.println( min );

	} // main

} // class




