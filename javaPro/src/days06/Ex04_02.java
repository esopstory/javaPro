package days06;

import java.util.Scanner;

/**
 * @author kenik
 * @date 2025. 2. 10. - 오후 12:02:25
 * @subject 
 * @content
 */
public class Ex04_02 {
	
	public static void main(String[] args) {
		
		// [for] 두 정수(n, m)을 입력받아서 두 정수 사이의 합을 출력.
		// [while]
		// n=2    m=5
		// 2+3+4+5=14
		
		int n, m ;
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 양의 정수( n m ) 입력 ? ");
		n = scanner.nextInt();
		m = scanner.nextInt();	
		
		int sum = 0;
		
		// [3]
		int min = n > m ? m : n ; // Math.min(n,m);
		int max = Math.max(n, m);
		
		for (int i = min; i <= max ; i++) {
			System.out.printf("%d+", i);
			sum += i;
		} // for i
		
		// [2]  n 작은값 m 큰값    자리바꾸기 
		/*
		if ( n > m ) {
			int temp = n;
			n = m;
			m = temp;
		} // if 
		
		for (int i = n; i <= m ; i++) {
			System.out.printf("%d+", i);
			sum += i;
		} // for i
		*/
		
		/* [1]
		if (n > m) {  // n == m
			for (int i = m; i <= n ; i++) {
				System.out.printf("%d+", i);
				sum += i;
			} // for i
		} else {
			for (int i = n; i <= m ; i++) {
				System.out.printf("%d+", i);
				sum += i;
			} // for i
		} // if		
		*/
		
		System.out.printf("\b=%d\n", sum);
		
	} // main

} // class










