package days07;

/**
 * @author kenik
 * @date 2025. 2. 11. - 오후 12:04:16
 * @subject 
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		// [for문] 구구단 출력 - 가로로 출력)
		/*
		System.out.printf("[ %d단 ] \n", 2);
		System.out.printf("%d * %d = %2d \n", 2, 1, 2*1);
		System.out.printf("%d * %d = %2d \n", 2, 2, 2*2);
		System.out.printf("%d * %d = %2d \n", 2, 3, 2*3);
		System.out.printf("%d * %d = %2d \n", 2, 4, 2*4);
		System.out.printf("%d * %d = %2d \n", 2, 5, 2*5);
		System.out.printf("%d * %d = %2d \n", 2, 6, 2*6);
		System.out.printf("%d * %d = %2d \n", 2, 7, 2*7);
		System.out.printf("%d * %d = %2d \n", 2, 8, 2*8);
		System.out.printf("%d * %d = %2d \n", 2, 9, 2*9); 
		*/
		
		
		/*
		System.out.printf("[ %d단 ] \n", 2);
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %2d \n", 2, i, 2*i);			
		} // for i
		
		System.out.printf("[ %d단 ] \n", 3);
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %2d \n", 3, i, 3*i);			
		} // for i
		 
		System.out.printf("[ %d단 ] \n", 4);
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %2d \n", 4, i, 4*i);			
		} // for i
		
		System.out.printf("[ %d단 ] \n", 5);
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %2d \n", 5, i, 5*i);			
		} // for i
		
		System.out.printf("[ %d단 ] \n", 6);
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %2d \n", 6, i, 6*i);			
		} // for i
		
		System.out.printf("[ %d단 ] \n", 7);
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %2d \n", 7, i, 7*i);			
		} // for i 
		
		System.out.printf("[ %d단 ] \n", 8);
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %2d \n", 8, i, 8*i);			
		} // for i
		
		System.out.printf("[ %d단 ] \n", 9);
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %2d \n", 9, i, 9*i);			
		} // for i
		*/


		/*
		 *  d=2   i=1,2,3,4,5,6,7,8,9
		 *  d=3   i=1,2,3,4,5,6,7,8,9
		 *  d=4   i=1,2,3,4,5,6,7,8,9
		 *  :
		 *  d=9   i=1,2,3,4,5,6,7,8,9
		 *  
		 *  2*1=2_2*2=4_2*3=6_ .. 2*9=18 개행
		 *  3*1=2_2*2=4_2*3=6_ .. 2*9=18 개행
		 *  4*1=2_2*2=4_2*3=6_ .. 2*9=18 개행
		 *  :
		 *  9*1=2_2*2=4_2*3=6_ .. 2*9=18 개행
		 * */
		for (int d = 2; d <= 9 ; d++) {
			//System.out.printf("[ %d단 ] \n", d);
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d*%d=%2d ", d, i, d*i);			
			} // for i
			System.out.println(); // 개행
		} // for d
	} // main

} // class








