package days13;

/**
 * @author kenik
 * @date 2025. 2. 19. - 오전 10:37:22
 * @subject 
 * @content  Ex02.java 
 * 
 *           1차원 "배열의 초기화" 설명
 */
public class Ex02 {

	public static void main(String[] args) {
		/*
		int [] m = new int[3];
		m[0]=1;
		m[1]=2;
		m[2]=3;
		*/
		
		// 1차원 배열 초기화
//		int [] m = new int[] {1, 2, 3};
		int [] m = {
				     1, 
				     2, 
				     3
				   };

		dispM(m);

	} // main

	private static void dispM(int[] m) {
		for (int i = 0; i < m.length; i++) {
			System.out.printf("m[%d]=%d ", i, m[i]);
		} // for i
	}

} // class





















