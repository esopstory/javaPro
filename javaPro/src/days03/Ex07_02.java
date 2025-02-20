package days03;

/**
 * @author kenik
 * @date 2025. 2. 5. - 오후 3:34:02
 * @subject  산술연산자   +  -   *   /    %
 * @content
 */
public class Ex07_02 {

	public static void main(String[] args) {
		int i = 10, j = 3;
		
		System.out.println( i + j );  // 13
		System.out.println( i - j );  // 7
		System.out.println( i * j );  // 30
		System.out.println( i / j );  // 3   몫연산자
		// System.out.println( (double)i / j );  // 3.3333		
		System.out.println( i % j );  // 1   나머지 연산자
		
		// [주의할 점]  /  %    0
		// System.out.println( 10 / 0  );  // / by zero ArithmeticException (산술적 예외)
		// System.out.println( 10 % 0  );     // / by zero ArithmeticException (산술적 예외)

		System.out.println( 10.0 / 0  );  // Infinity    무한대
		System.out.println( 10.0 % 0  );  // NaN        Not a Number
	} // main

} // class
