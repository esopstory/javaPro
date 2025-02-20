package days06;

import java.util.Scanner;

/**
 * @author kenik
 * @date 2025. 2. 10. - 오후 12:02:25
 * @subject 
 * @content
 */
public class Ex04_04 {
	
	public static void main(String[] args) {
		
		// [for/while] 두 정수(n, m)을 입력받아서 두 정수 사이의 홀수의 합을 출력.
		// Ex04_05.java   세 정수를 입력받아서 세 정수 중에 가장 큰값, 가장 작은값을 구해서 출력.
		int n, m ;
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 양의 정수( n m ) 입력 ? ");
		n = scanner.nextInt();
		m = scanner.nextInt();	
		
		int sum = 0;
		 
		int min = n > m ? m : n ; // Math.min(n,m);
		int max = Math.max(n, m);
		
		if( min % 2 == 0 ) min++;
		
		// [2]
		while( min <= max) { 
			  System.out.printf("%d+", min);
			  sum += min;
			min+=2;
		} //
		
		/* [1]
		int i = min;
		while( i <= max) {
			System.out.printf("%d+", i);
			sum += i;
			i++;
		} //
		*/ 
		
		System.out.printf("\b=%d\n", sum);
		
	} // main

} // class










