package days12;

import java.util.Arrays;
import java.util.Random;

/**
 * @author kenik
 * @date 2025. 2. 18. - 오전 10:20:48
 * @subject   배열 섞기(카드 섞기, 화투 섞기)
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		int [] m = new int[10];
		for (int i = 0; i < m.length; i++) {
			m[i] = i+1;
		} // for i
		// [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		System.out.println( Arrays.toString(m) );

		shuffle(m); // 배열을 무작위로 섞기

		System.out.println( Arrays.toString(m) );

		/*
		 *  boolean   			false
		 *  char      			'\u0000'  널문자
		 *  참조타입(String)    	null
		 *  byte , short, int   0 
		 *  long				0L
		 *  float				0.0F
		 *  double				0.0 또는 0.0D
		 */ 

	} // main

	// [3]
	private static void shuffle(int[] m) {
		int idx1 = 0, idx2;
		Random rnd = new Random();
		for (int i = 0, temp; i < 10; i++) { 
			idx2 = rnd.nextInt(m.length-1)+1; // 1~9			
			System.out.printf("%d - %d \n", idx1, idx2);
			temp = m[idx1];
			m[idx1] = m[idx2];
			m[idx2] = temp;
		} // for i
	}

	// [2]
	/*
	public static void shuffle(int[] m) {
		for(int i=0; i<10; i++) {
			int[] randomPos = new Random().ints(0,10).distinct().limit(2).toArray();
			int tmp = m[randomPos[0]];
			m[randomPos[0]] = m[randomPos[1]];
			m[randomPos[1]] = tmp;
		}
	}
	 */

	/* [1]
	private static void shuffle(int[] m) {
		int idx1, idx2;
		Random rnd = new Random();
		for (int i = 0, temp; i < 10; i++) {
			idx1 = rnd.nextInt(m.length);
			idx2 = rnd.nextInt(m.length);
			if(idx1 == idx2) i--;
			else {
				System.out.printf("%d - %d \n", idx1, idx2);
				temp = m[idx1];
				m[idx1] = m[idx2];
				m[idx2] = temp;
			}
		} // for i
	}
	 */

} // class









