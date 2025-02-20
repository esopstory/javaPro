package days05;

/**
 * @author kenik
 * @date 2025. 2. 7. - 오전 10:43:18
 * @subject 
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		/*
		String name = "홍길동";
		name = name + "이창익";
		name = name + "서영학";
		System.out.println( name );
		*/
		
		/*
		int sum = 0;
		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		System.out.println( sum );
		*/
		
		// [문제] 1+2+3+...+9+10=55 (for문)
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d+", i); // 1+
			sum += i; //sum = sum + i;
		} // for i
		System.out.printf("=%d", sum);
		
		/*
		int i;
		for (i = 1; i <= 10; i++) {
			System.out.println(i);
		} // for i
		// i cannot be resolved to a variable
		System.out.println(">> 빠져나올때의 i = " + i );
		*/

	} // main

} // class






