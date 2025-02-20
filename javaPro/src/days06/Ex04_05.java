package days06;

import java.util.Scanner;

/**
 * @author kenik
 * @date 2025. 2. 10. - 오후 2:00:00
 * @subject 
 * @content
 */
public class Ex04_05 {

	public static void main(String[] args) {
		// 세 정수를 입력받아서 세 정수 중에 가장 큰 값, 가장 작은 값을 구해서 출력.
		int n, m, o;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		m = scanner.nextInt();
		o = scanner.nextInt();
		
		int max = n > m ? ( n > o ? n : o ) : ( m > o ? m : o)  ;
		int min =  Math.min( Math.min(n, m), o ); 	
		// int min = Math.min(  Math.min(  Math.min( Math.min(n, m), o ), 89 ) , 56 ); 	
		
		System.out.printf("> max:%d, min:%d", max, min);
		
		/*
		if ( n > m ) {
			// n 큰값
			if( n > o) {
				// n
			}else {
				// o
			}
		} else {
			// m
			if( m > o) {
				// m
			}else {
				// o
			}
		} // if
		*/

	} // main

} // class
