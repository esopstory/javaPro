package days10;

import java.io.IOException;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.IntStream;

import days08.Ex07;

/**
 * @author kenik
 * @date 2025. 2. 14. - 오후 3:12:16
 * @subject 배열의 가장 큰 단점 : 자동으로 크기가 증가 X
 * @content
 */
public class Ex04_02 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int [] korArr = new int[3];
		int index = 0;
		//               ↓
		//  [0] [0] [0]
		// k[0]k[1]k[2]
		String regex = "^(100|[1-9]?[0-9])$";
		int score;
		char con = 'y';
		do {
			// 1)
			System.out.printf("%d번 학생 점수 입력 ? ",  index+1);			
			// score = scanner.nextInt();
			score =  Ex07.getRandomInteger(0, 100);
			// 2) 
			if ( index == korArr.length) {				
				int[] temp = new int[korArr.length+2];
				for (int i = 0; i < korArr.length; i++) {
					temp [i] = korArr [i];
				}
				korArr = temp;
			} // if
			korArr[index++] = score;

			System.out.printf(" > 입력 계속 할래?");
			con = (char)System.in.read();
			System.in.skip( System.in.available() ); // 13(\r), 10(\n)
			// } while ( con == 'y' || con == 'Y'); 
		} while ( Character.toUpperCase(con) == 'Y' );

		dispScore(korArr, index); 
		
		// 최고점수/최저점수/점수평균 출력
		// 4:01 수업시작~

	} // main

	private static void dispScore(int[] korArr, int index) {
		System.out.printf("> 입력한 수 : %d 명\n", index);
		for (int i = 0; i < index; i++) {
			System.out.printf("[%d]번 학생의 점수 : %d점\n", i+1, korArr[i]);
		} // for i
		
		// days06.Ex04_06.java 
		IntStream stream = IntStream.of(korArr);
        OptionalInt oMax= stream.limit(index).max();
        int maxScore = oMax.getAsInt();        
        int minScore = IntStream.of(korArr).limit(index).min().getAsInt();
        double avgScore= IntStream.of(korArr).limit(index).average().getAsDouble();
        System.out.printf("최고점:%d, 최저점:%d, 평균:%.2f\n"
        		,maxScore, minScore, avgScore );

		
	}

} // class




