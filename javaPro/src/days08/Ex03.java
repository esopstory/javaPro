package days08;

import java.util.Scanner;

/**
 * @author kenik
 * @date 2025. 2. 12. - 오전 11:31:47
 * @subject 
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		// [정보처리 기사 실기]
		// 어떤 정수를 입력받아서 약수를 구해서 출력....
		// 약수(divisor) ? 어떤 수를 나누어떨어지게 하는 수
		// 예)  8 의 약수 - 1 2 4 8
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 정수(n) 입력 ? ");
		int n = scanner.nextInt();  // 8
		System.out.printf("%d 의 약수 - 1 ", n);
		
		for (int i = 2; i <= n/2; i++) {
			if ( n % i == 0 ) {
				System.out.printf( "%d ", i );
			} // if
		} // for i
		
		System.out.printf( "%d ", n );
		// 68 의 약수 - 1 2 4 17 34 68 
		
		
		// [문제] 최대공약수, 최소공배수
		// [문제] 소수 

	} // main

} // class







