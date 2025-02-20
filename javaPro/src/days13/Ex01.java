package days13;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @author kenik
 * @date 2025. 2. 19. - 오전 7:01:34
 * @subject  days12.Ex01.java 복사-> days13.Ex01.java 붙여넣기.
 * @content  3반 30명 학생의 성적 처리.
 */
public class Ex01 {

	public static void main(String[] args) throws IOException {
		String name;
		int kor, eng, mat, tot, rank;
		double avg;

		final int CLASS = 3;
		final int STUDENT_COUNT = 30;

		//String [] names = new String[3*STUDENT_COUNT];
		String [][] names = new String[CLASS][STUDENT_COUNT];
		int [][] kors = new int[CLASS][STUDENT_COUNT];
		int [][] engs = new int[CLASS][STUDENT_COUNT];
		int [][] mats = new int[CLASS][STUDENT_COUNT];
		int [][] tots = new int[CLASS][STUDENT_COUNT];
		int [][] ranks = new int[CLASS][STUDENT_COUNT];  // 반등수
		int [][] wranks = new int[CLASS][STUDENT_COUNT]; // 전교등수
		double [][] avgs = new double[CLASS][STUDENT_COUNT];

		// int cnt1 = 0, cnt2 = 0, cnt3 = 0; // 입력받은 학생 수
		//     cnts[0]   cnts[1]  cnts[2]
		int [] cnts = new int[3]; // 배열은 int 자료형의 기본값 0로 초기화.
		
		char con = 'y';

		Scanner scanner = new Scanner(System.in);

		int ban ; 
		do {
			// "가변 배열" 처리
			// 1. 반 입력 ? 
            System.out.print("> 1. 반 입력 ? ");
            ban = scanner.nextInt();  // 2
            
			// 한 학생의 정보를 입력
			System.out.printf("> 2. %d반 [%d번] 학생 이름,국어,영어,수학 입력 ? "
					, ban, cnts[ban-1]+1);
			name = getName(); // scanner.next();
			kor = getScore(); // scanner.nextInt();
			eng = getScore(); // scanner.nextInt();
			mat = getScore(); // scanner.nextInt();

			tot = kor + eng + mat;
			avg = (double)tot/3;
			rank = 1;
			// 각 배열에 요소로 추가. ( 각 배열의 index ==> cnt 처리 )
			names[ban-1][cnts[ban-1]] = name;
			kors[ban-1][cnts[ban-1]] = kor;
			engs[ban-1][cnts[ban-1]] = eng;
			mats[ban-1][cnts[ban-1]] = mat;
			tots[ban-1][cnts[ban-1]] = tot;
			avgs[ban-1][cnts[ban-1]] = avg;
			ranks[ban-1][cnts[ban-1]] = rank;

			// 입력받은 학생수 1증가
			cnts[ban-1]++;
			// 입력 계속 여부 체크
			System.out.print("> 학생 입력 계속 ? ");
			con = (char)System.in.read();
			System.in.skip(System.in.available()); // 13, 10
		} while ( Character.toUpperCase(con) == 'Y' );

		// 등수처리.
		for (int i = 0; i < cnts.length; i++) {
			for (int j = 0; j < cnts[i]; j++) {
				wranks[i][j]=ranks[i][j] = 1;				
				//  tots[i][j] 등수처리할 학생의 총점
				//  ranks[i][j] 등수처리할 학생의 반등수
				//  wranks[i][j] 등수처리할 학생의 전교등수
				for (int i2 = 0; i2 < cnts.length; i2++) {
					for (int j2 = 0; j2 < cnts[i2]; j2++) {						
						//  tots[i2][j2] 비교할 학생의 총점
						if(tots[i][j]<tots[i2][j2]) {
							wranks[i][j]++;
							if (i == i2) {
								ranks[i][j]++;
							} // if
						} // 
					} // for j
				} // for i
				
			} // for j
		} // for i
		

		// 학생정보출력.
		// int totalCnt = cnts[0]+cnts[1]+cnts[2] ;
		int totalCnt = IntStream.of(cnts).sum();
		System.out.printf("[전체 학생 수 : %d명]\n", totalCnt);
		for (int i = 0; i < cnts.length; i++) {
			System.out.printf("[%d]반의 학생수 : %d명\n", i+1, cnts[i]);
			// 그 반 학생 정보 출력...
			for (int j = 0; j < cnts[i]; j++) {
				System.out.printf("  [%d]\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\t%d\n"
						, j+1
						, names[i][j]
						, kors[i][j], engs[i][j], mats[i][j], tots[i][j]
						, avgs[i][j], ranks[i][j], wranks[i][j]);
			} // for j
		} // for i
		

	} // main

	public static String getName() {
		// '가' ~ '힣'
		// 44032 ~ 55203

		// 5 ~ 13
		// 0 ~ 8                -5
		// 5 <=  (int)(Math.random()*9)+5 <= 13


		//char one = (char)(rnd.nextInt('힣'-'가'+1)+'가');

		char [] nameArr = new char[3];
		Random rnd = new Random();
		for (int i = 0; i < nameArr.length; i++) {
			nameArr[i] = (char)(rnd.nextInt('힣'-'가'+1)+'가');
		}

		// char[] -> String 변환
		String name = new String(nameArr);
		return name;
	}

	public static int getScore() {
		return  (int)( Math.random()*101 ) ;
	}

} // class 