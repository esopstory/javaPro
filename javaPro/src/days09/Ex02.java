package days09;

/**
 * @author kenik
 * @date 2025. 2. 13. - 오전 10:20:05
 * @subject 재귀 함수
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		// 팩토리얼(factorial)  == 계승
		// n!
		// 0! = 1 정의
		// 자연수 ( 1,2,3,4... )
		// int result = factorial(5);  //
		int result = recursiveFactorial(0);  
		System.out.println("="+ result);

	} // main

	private static int recursiveFactorial(int n) {
		if( n == 1  || n == 0 ) return 1;
		else         return n * recursiveFactorial(n-1);
	}

	private static int factorial(int n) {
		// 1*2*3*4*....*n = n!
		int result = 1;
		for (int i = 1; i <= 0; i++) {
			System.out.printf("%d*", i);
			result *= i;
		} // for i
		
		return result;
	}

} // class






