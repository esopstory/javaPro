package days13;

import java.util.Scanner;

public class My20250218 {
	public static void main(String[] args) {

		int [][] lotto = new int[3][6];
		int cnt = 0, gcnt = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.printf("> 게임 횟수 입력 ? ");
		gcnt = scanner.nextInt();
		
//		gcnt =3;
		do
		{
			fillLotto(lotto, cnt);
			cnt++;
		}while(cnt < gcnt);
		
		dispLotto(lotto);

	} // main


	private static void fillLotto(int[][] lotto, int cnt) {
		int index = 0, n;
		lotto[cnt][index++] = getRandomInteger(1, 45); 
		while ( index <= 5 ) {
			n =  getRandomInteger(1, 45); 				 
			if( !isDuplicateLotto(lotto, n, index, cnt) ) 
				lotto[cnt][index++] = n;
		} // while

	}

	private static boolean isDuplicateLotto(int[][] lotto, int n, int index, int cnt) {
		boolean flag = false;
		for (int i = 0; i < index; i++) {
			if( lotto[cnt][i] == n ) {
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

	private static void dispLotto(int[][] lotto) {
		for (int j = 0; j < lotto.length; j++) {
			System.out.printf("[%d게임] ", j + 1);
			for (int i = 0; i < lotto[0].length; i++) {
				System.out.printf("[%02d]", lotto[j][i]);
			} // for i
			System.out.println();
			
		} // for i3
		
	}
}
