package days07;

/**
 * @author kenik
 * @date 2025. 2. 11. - 오후 12:19:32
 * @subject 
 * @content
 */
public class Ex04_02 {

	public static void main(String[] args) {
		// [for문] 구구단 출력 - (가로로 출력)
		// [for문] 구구단 출력 - (세로로 출력)	
        for (int i = 1; i <= 9; i++) {
			for (int d = 2; d <= 9; d++) {  // 단
				System.out.printf("%d*%d=%2d ", d, i, d*i);
			} // for d
			System.out.println();
		} // for i	
		

		/*
		for (int i = 2; i <=9; i++) {
			System.out.printf("%d*%d=%2d ", i, 1, i*1);
		} // for i
		System.out.println();
		
		for (int i = 2; i <=9; i++) {
			System.out.printf("%d*%d=%2d ", i, 2, i*2);
		} // for i
		System.out.println();
		
		for (int i = 2; i <=9; i++) {
			System.out.printf("%d*%d=%2d ", i, 3, i*3);
		} // for i
		System.out.println();
		// 
		for (int i = 2; i <=9; i++) {
			System.out.printf("%d*%d=%2d ", i, 9, i*9);
		} // for i
		System.out.println();
		*/ 
		/*
		System.out.printf("%d*%d=%2d ", 2, 1, 2*1);
		System.out.printf("%d*%d=%2d ", 3, 1, 3*1);
		System.out.printf("%d*%d=%2d ", 4, 1, 4*1);
		System.out.printf("%d*%d=%2d ", 5, 1, 5*1);
		System.out.printf("%d*%d=%2d ", 6, 1, 6*1);
		System.out.printf("%d*%d=%2d ", 7, 1, 7*1);
		System.out.printf("%d*%d=%2d ", 8, 1, 8*1);
		System.out.printf("%d*%d=%2d ", 9, 1, 9*1);
		System.out.println("개행");
		
		System.out.printf("%d*%d=%2d ", 2, 2, 2*2);
		System.out.printf("%d*%d=%2d ", 3, 2, 3*2);
		System.out.printf("%d*%d=%2d ", 4, 2, 4*2);
		System.out.printf("%d*%d=%2d ", 5, 2, 5*2);
		System.out.printf("%d*%d=%2d ", 6, 2, 6*2);
		System.out.printf("%d*%d=%2d ", 7, 2, 7*2);
		System.out.printf("%d*%d=%2d ", 8, 2, 8*2);
		System.out.printf("%d*%d=%2d ", 9, 2, 9*2);
		System.out.println("개행");
		*/

	} // main

} // class






