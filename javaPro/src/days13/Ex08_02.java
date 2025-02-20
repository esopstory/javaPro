package days13;

import java.util.Arrays;

/**
 * @author kenik
 * @date 2025. 2. 19. - 오후 3:36:45
 * @subject 
 * @content
 */
public class Ex08_02 {

	public static void main(String[] args) {
		//      4행 3열  2차원 배열 m
		int [][] m = {
							{1,2,3},
							{4,5,6},
							{7,8,9},
							{10,11,12}
					};

		// 1차원 배열 n
		int [] n = new int[m.length * m[0].length];
		
		// 2차원 배열 m 을  1차원 배열 n으로 변환시켜서 배열 n을 출력.
		/*  i j  ?
		 *  0 0  0
		 *  0 1  1
		 *  0 2  2
		 *  
		 *  1 0  3    i*열갯수 + j
		 *  1 1  4
		 *  1 2  5
		 *  
		 *  2 0  6
		 *  2 1  7
		 *  2 2  8
		 *  :
		 * */
		int colLength = m[0].length ;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				n[i*colLength+ j] = m[i][j];
			} // for j
		} // for i
		
		System.out.println( Arrays.toString(n ));
		

	} // main

} // class
