package days06;

/**
 * @author kenik
 * @date 2025. 2. 10. - 오전 11:10:32
 * @subject 
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		// [for] 1~10=55     
		// [for] 1+3+5+7+9+=25    홀수의 합
		/*
		int sum = 0;
		for (int i = 1; i <= 10 ; i++) {
			if( i % 2 != 0) {
				System.out.printf("%d+", i);
				sum += i;
			} // if
		} // for i
		System.out.printf("\b=%d\n", sum);
		*/
		
		// [ continue 문 설명 ] 
		/*
		int sum = 0;
		for (int i = 1; i <= 10 ; i++) {
			if( i % 2 == 0)   continue;
			System.out.printf("%d+", i);
			sum += i;
		} // for i
		System.out.printf("\b=%d\n", sum);
		*/
		
		// [while]  1~10=55 -> 1+3+5+7+9+=25    홀수의 합
		//     +   continue문 
		int sum = 0 , i = 1;
		while ( i<= 10 ) {
			/* [1] 
			if( i % 2 == 1) {
				System.out.printf("%d+", i);
				sum += i; // 2
			}
			i++;
			*/ 
			
			// [2]
			if( i % 2 == 0 ) {
				i++;
				continue;
			}
			
			System.out.printf("%d+", i);  // 1+
			sum += i; // 1
			i++;      // 2
		} // while
		System.out.printf("\b=%d\n", sum);
		
	} // main

} // class









