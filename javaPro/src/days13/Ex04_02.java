package days13;

import java.util.Scanner;

/**
 * @author kenik
 * @date 2025. 2. 19. - 오후 12:06:37
 * @subject   [ 배열의 배열이다. ]*** 
 * @content
 */
public class Ex04_02 {
	public static void main(String[] args) { 
		  
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 게임 횟수 입력 ? ");
		int gameNumber = scanner.nextInt();
		
		int [][] lotto = new int[gameNumber][6];
		
		fillLottos(lotto, gameNumber);
		dispLottos(lotto, gameNumber);

	} // main

	private static void dispLottos(int[][] lotto, int gameNumber) {
		for (int i = 0; i < gameNumber; i++) {
			dispLotto(lotto[i], i);
		} // for i
	}

	private static void fillLottos(int[][] lotto, int gameNumber) {
		for (int i = 0; i < gameNumber; i++) {
			fillLotto(lotto[i]);
		} // for i
	}
	
	// days08.Ex07.java 
	private static void fillLotto(int[] lotto) {
		int index = 0, n;
		lotto[index++] = getRandomInteger(1, 45); 
		while ( index <= 5 ) {
			n =  getRandomInteger(1, 45); 				 
			if( !isDuplicateLotto(lotto, n, index) ) 
				lotto[index++] = n;
		} // while

	}
	// days08.Ex07.java 
	private static void dispLotto(int[] lotto, int no) {
		System.out.printf("%d게임 : ", no+1);
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("[%d]", lotto[i]);
		} // for i
		System.out.println();
	}
	// days08.Ex07.java 
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
	// days08.Ex07.java 
	public static int getRandomInteger(int min, int max) {		
		return (int)( Math.random()*(max-min+1))+min;
	}

} // class

