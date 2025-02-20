package days05;

/**
 * @author kenik
 * @date 2025. 2. 7. - 오후 12:14:44
 * @subject 
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		
		//  [for] 1+2+...+10=55
		/*
		int sum = 0;
		for (int i = 1; i <= 10 ; i++) {
		
			// [1]
//			if (i==10) {
//				System.out.printf("%d", i);
//			} else {
//				System.out.printf("%d+", i);
//			} // if
			
			// [2]
//			System.out.printf(i==10?"%d":"%d+", i); 
			
			System.out.printf("%d+", i);
			sum += i;
		} // for i
		System.out.printf("\b=%d\n", sum);
		*/		

		// 1~10까지의 합을 출력.
		// for ( 초기식 ; 조건식 ; 증감식) {
		int sum = 0;
		/* 
		for ( int i = 1, j = 0, k = 0   ; i <= 10  ; i++ , j-- , k+=2) {
			System.out.printf("%d+", i);
			sum += i;			
		} // for i
		*/
		
		//  i         i>=1
		// 10+9+8     1
		int i = 10;
		for (      ;      ;      ) {
			// if( i==0 ) break;
			System.out.printf("%d+", i);
			sum += i;
			if( i==1 ) break;
			i--;
		} // for i
		
		// Unreachable code
		System.out.printf("\b=%d\n", sum);
	} // main

} // class







