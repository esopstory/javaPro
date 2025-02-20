package days05;

/**
 * @author kenik
 * @date 2025. 2. 7. - 오전 11:08:22
 * @subject   조건반복문  while 문
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		
		// [for문] 1~10=55
		//  ㄴ 반복문
		// [while문] 1~10=55
		//  ㄴ 조건반복문 : condition이 참일 동안 {} 블럭을 실행하는 반복문
		/*
		while (condition) {
			
		} // while
		
		do {
			
		} while (condition);
		*/		
		// [while문] 1~10=55
		int i = 0;   // 1
		int sum = 0; // 0
		// while ( i++ <= 3 ) {  // false  4 <= 3     i=4
		while ( ++i <= 10 ) {  // true 4 <= 3    
			System.out.printf("%d+", i); // 2+3+
			sum += i;                    // 5
			//i++;
			//++i;
		} // while
		System.out.printf("=%d\n", sum );
		
		
		
		 
			
		
		

	} // main

} // class



