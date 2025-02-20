package days04;

import java.util.Scanner;

/**
 * @author kenik
 * @date 2025. 2. 6. - 오후 2:15:58
 * @subject   조건문 : if문
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		// 입력받은 정수(n)이 10보다 크다면 출력 O, 출력 X
		// 수식 :    n > 10
		int n ;		
		Scanner scanner = new Scanner(System.in);
		System.out.println("> 정수(n) 입력 ? ");
		n = scanner.nextInt();
		// condition  참/거짓   조건식
		// if문의  {} 블럭은 조건식이 참일 때만 실행
		if ( n > 10 ) {
			System.out.println("출력 O");
		} // if
		
		System.out.println(" end ");
	} // main
	
} // class





