package days08;

import java.util.Arrays;

/**
 * @author kenik
 * @date 2025. 2. 12. - 오후 3:13:11
 * @subject  days06.Ex01.java 
 * @content  중복체크가 된 로또번호 발생 예제
 */
public class Ex07 {

	public static void main(String[] args) {

		int [] lotto = new int[6];

		fillLotto(lotto);
		dispLotto(lotto);

	} // main


	private static void fillLotto(int[] lotto) {
		int index = 0, n;
		lotto[index++] = getRandomInteger(1, 45); 
		while ( index <= 5 ) {
			n =  getRandomInteger(1, 45); 				 
			if( !isDuplicateLotto(lotto, n, index) ) 
				lotto[index++] = n;
		} // while

	}

	private static boolean isDuplicateLotto(int[] lotto, int n, int index) {
		boolean flag = false;
		for (int i = 0; i < index; i++) {
			if( lotto[i] == n ) {
				System.out.println("*");
				flag = true;
				break;
			}
		} // for i
		return flag;
	}


	public static int getRandomInteger(int min, int max) {		
		return (int)( Math.random()*(max-min+1))+min;
	}

	private static void dispLotto(int[] lotto) {
		System.out.print("1게임 : ");
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("[%d]", lotto[i]);
		} // for i
		System.out.println();
	}

} // class
