package days13;

import java.util.Scanner;

/**
 * @author kenik
 * @date 2025. 2. 19. - 오전 11:20:49
 * @subject 로또 출력 예제 days08.Ex07.java
 * @content
 *    입력형식
 *    > 게임 횟수 입력 ? 3
 *    
 *    출력형식
 *      [1 게임]		[42][36][21][38][6][26]
		[2 게임]		[11][7][19][2][25][15]
		[3 게임]		[36][33][44][42][18][10]
 */
public class Ex04 {

	public static void main(String[] args) {
		// int [] lotto = new int[3*6];		
		// int [][] lotto = new int[3][6];  2차원 배열 ...
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 게임 횟수 입력 ? ");
		int gameNumber = scanner.nextInt();
		
		int [][] lotto = new int[gameNumber][6];
		
		// lotto.length 행 크기 == 게임횟수
		fillLotto(lotto, gameNumber);
		dispLotto(lotto, gameNumber);

	} // main

	private static void dispLotto(int[][] lotto, int gameNumber) {
		
		for (int i = 0; i < gameNumber; i++) {
			System.out.printf("%d게임 : ", i+1);
			for (int j = 0; j < lotto[i].length; j++) {
				System.out.printf("[%d]", lotto[i][j]);
			} // for i
			System.out.println();
		} // for i
		
	}

	private static void fillLotto(int[][] lotto, int gameNumber) {
		
		int index = 0, n;
		
		// 게임 횟수만큼 반복으로 로또 번호 6개씩 발생...
		for (int i = 0; i < gameNumber ; i++) {
			index = 0;
			lotto[i][index++] = getRandomInteger(1, 45);
			 
			while ( index <= 5 ) {
				n =  getRandomInteger(1, 45); 				 
				if( !isDuplicateLotto(lotto, n, index, i) ) 
					lotto[i][index++] = n;
			} // while
			 
		} // for i
		
		
		
	}
	
	private static boolean isDuplicateLotto(int[][] lotto, int n, int index, int row) {
		boolean flag = false;
		for (int i = 0; i < index; i++) {
			if( lotto[row][i] == n ) {
				System.out.println("*");
				flag = true;
				break;
			}
		} // for i
		return flag;
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

} // class







