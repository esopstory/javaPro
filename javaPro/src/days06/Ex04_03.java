package days06;

import java.util.Scanner;

/**
 * @author kenik
 * @date 2025. 2. 10. - 오후 12:02:25
 * @subject 
 * @content
 */
public class Ex04_03 {
	
	public static void main(String[] args) {
		
		// [while] 두 정수(n, m)을 입력받아서 두 정수 사이의 합을 출력. 
		// n=2    m=5
		// 2+3+4+5=14
		
		int n, m ;
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 양의 정수( n m ) 입력 ? ");
		n = scanner.nextInt();
		m = scanner.nextInt();	
		
		int sum = 0;
		 
		int min = n > m ? m : n ; // Math.min(n,m);
		int max = Math.max(n, m);
		
		// [2]
		while( min <= max) {
			System.out.printf("%d+", min);
			sum += min;
			min++;
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










