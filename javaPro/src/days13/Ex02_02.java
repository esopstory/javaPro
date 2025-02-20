package days13;

/**
 * @author kenik
 * @date 2025. 2. 19. - 오전 10:37:22
 * @subject 
 * @content  Ex02.java , Ex02_02.java, Ex02_03.java
 *           2차원 배열의 초기화 설명
 */
public class Ex02_02 {

	public static void main(String[] args) {
		// p 178 배열의 배열이다.( 의미 이해 )
		/*
		int [][] m = new int[2][4]; // 2행 4열 int 2차원 배열
		m[0][0]=1;m[0][1]=2;m[0][2]=3;m[0][3]=4;
		m[1][0]=5;m[1][1]=6;m[1][2]=7;m[1][3]=8;
		*/
		
		// 2차원 배열의 초기화
		/*
		int [][] m = new int[][] {
									{ 1,2,3,4 },  // 0행
									{ 5,6,7,8 }  // 1행
		                         };	
		*/
		int [][] m =    {   { 1,2,3,4 },   { 5,6,7,8 }  };

		dispM(m);

	} // main

	private static void dispM(int[][] m) {
		for (int i = 0; i < m.length; i++) { // 행 크기  m.length
			for (int j = 0; j < m[i].length; j++) { // 열 크기 m[i].length
				System.out.printf("m[%d][%d]=%d ", i, j, m[i][j]);
			} // for j
			System.out.println(); // 개행
		} // for i
		
	}

} // class








