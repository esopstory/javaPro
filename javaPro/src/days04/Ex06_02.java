package days04;

import java.util.Scanner;

/**
 * @author kenik
 * @date 2025. 2. 6. - 오후 2:15:58
 * @subject   조건문 : if문
 * @content
 */
public class Ex06_02 {

	public static void main(String[] args) {
		// [문제]
		// 정수를 입력받아서 "홀수"/"짝수" 라고 출력
		int n ;		
		// Resource leak: 'scanner' is never closed
		@SuppressWarnings("resource") // @ 어노테이션(Annotation)
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 정수(n) 입력 ? ");
		n = scanner.nextInt();
		
		/*
		if ( n % 2 == 0 ) {
			System.out.println("짝수(Even Number)");
		} // if		 
		if ( n % 2 != 0 ) {
			System.out.println("홀수(Odd Number)");
		} // if
		*/
		
		// 3:05 수업 시작~
		if (n % 2 == 0) {
			System.out.println("짝수(Even Number)");
		} else {
			System.out.println("홀수(Odd Number)");
		} // if
		
		//scanner.close(); 
		System.out.println(" end ");
	} // main
	
} // class





