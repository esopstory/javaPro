package days13;

/**
 * @author kenik
 * @date 2025. 2. 19. - 오후 3:29:16
 * @subject 
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		// 정보처리 기사 실기
		int [][] m = new int[5][5];

		// fillM01(m);
		// fillM02(m);
		// fillM03(m);
		fillM04(m);

		dispM(m);
	} // main

	/*
    0열 1열 2열 3열 4열
0행 [ 5][10][15][20][25]
1행 [ 4][ 9][14][19][24]
2행 [ 3][ 8][13][18][23]
3행 [ 2][ 7][12][17][22]
4행 [ 1][ 6][11][16][21]
*/
	private static void fillM04(int[][] m) {
		// [1] 값
		/*
		for (int i = 0; i < m.length; i++) {           // 행크기			 
			for (int j = 0; j < m[i].length; j++) {    // 열크기
				   m[i][j] = 5-i + j*5;				   
			} // for j
		} // for i
		*/
		
		// [2] 방(요소) 
		/* 00  40
		 * 01  30
		 * 02  20
		 * 03  10
		 * 04  00
		 * 
		 * 10  41
		 * 11  31
		 * 12  21
		 * 13  11
		 * 14  01
		 *  
		 * */
		for (int i = 0; i < m.length; i++) {           // 행크기			 
			for (int j = 0; j < m[i].length; j++) {    // 열크기
				 m[4-j][i] = 5*i+j+1;
			} // for j
		} // for i
	 

	}

	/*
    0열 1열 2열 3열 4열
0행 [ 1][ 2][ 3][ 4][ 5]
1행 [10][ 9][ 8][ 7][ 6]
2행 [11][12][13][14][15]
3행 [20][19][18][17][16]
4행 [21][22][23][24][25]
	 */		
	private static void fillM03(int[][] m) {
		// [1] 값 
		/*
		for (int i = 0; i < m.length; i++) {           // 행크기			 
			for (int j = 0; j < m[i].length; j++) {    // 열크기 
				m[i][j] = i%2==0 ?5*i+j+1:5*(i+1)-j; 
			} // for j
		} // for i
		 */

		// [2] 방(요소)
		for (int i = 0; i < m.length; i++) {           // 행크기			 
			for (int j = 0; j < m[i].length; j++) {    // 열크기 
				m[i][i%2==0?j:4-j] =  5*i+j+1; 
			} // for j
		} // for i
	}



	private static void fillM02(int[][] m) {
		/*
		 * i=0 j=01234
		 * i=1 j=01234
		 * i=2 j=01234
		 * i=3 j=01234
		 * i=4 j=01234
		 */
		/* [1]
		for (int i = 0, v = 25; i < m.length; i++) {           // 행크기			 
			for (int j = 0; j < m[i].length; j++, v--) {    // 열크기
				// m[i][j]=v;
				m[i][j] = (m.length*m[i].length) - ( m[i].length*i + j );
			} // for j
		} // for i
		 */

		// [2]
		/* 0 0  4 4
		 * 0 1  4 3
		 * 0 2  4 2
		 * 0 3  4 1
		 * 0 4  4 0
		 * 
		 * 1 0  3 4
		 * 1 1  3 3
		 * 1 2  3 2
		 * 1 3  3 1
		 * 1 4  3 0 
		 * */ 
		for (int i = 0; i < m.length; i++) {           // 행크기			 
			for (int j = 0; j < m[i].length; j++) {    // 열크기
				m[4-i][4-j] = 5*i+j+1;
			} // for j
		} // for i
	}

	private static void fillM01(int[][] m) {
		/*
		for (int i = 0, v = 1; i < m.length; i++) {           // 행크기			 
			for (int j = 0; j < m[i].length; j++, v++) {    // 열크기
				 m[i][j] = v;
			} // for j
		} // for i
		 */
		// v 변수를 선언하지 않고  i/j 변수 사용
		for (int i = 0, v = 1; i < m.length; i++) {           // 행크기			 
			for (int j = 0; j < m[i].length; j++, v++) {    // 열크기
				m[i][j] = 5*i+j+1;
			} // for j
		} // for i
	}

	private static void dispM(int[][] m) {
		System.out.println("     0열 1열 2열 3열 4열");	    
		for (int i = 0; i < m.length; i++) {           // 행크기
			System.out.printf("%d행 " , i);
			for (int j = 0; j < m[i].length; j++) {    // 열크기
				System.out.printf("[%2d]", m[i][j]);
			} // for j
			System.out.println(); // 개행
		} // for i

	}

} // class






