package days06;

import java.util.Scanner;

/**
 * @author kenik
 * @date 2025. 2. 10. - 오전 11:43:35
 * @subject 
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		// [for] 1~n=합
		/*
		int sum = 0, n;
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 양의 정수(n) 입력 ? ");
		n = scanner.nextInt();		
		for (int i = 1; i <= n ; i++) {
			System.out.printf("%d+", i);
			sum += i;
		} // for i
		System.out.printf("\b=%d\n", sum);
		*/

		// [while] 1~n=합
		int sum = 0, n, i = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 양의 정수(n) 입력 ? ");
		n = scanner.nextInt();			
		if(  n < 1  ) {
			System.out.println("[알림] 양의 정수만 입력!!!");
			return;
		}		
		while ( i <= n ) {
			System.out.printf("%d+", i);
			sum += i++;
		} // while		
		System.out.printf("\b=%d\n", sum);
		
		// 12:02 수업시작
	} // main

} // class
