package days04;

import java.util.Scanner;

/**
 * @author kenik
 * @date 2025. 2. 6. - 오후 12:14:55
 * @subject 
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		// BufferedReader br   키보드로부터 입력...
		// [ Scanner 클래스 ] 
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("> 정수(n) 입력 ? ");
		int n = sc.nextInt();  // 1. 기능 2. 매개변수 3. 리턴값(리턴자료형)
		System.out.println( n );
		*/
		
		String name;
		byte kor, eng, mat;
		short tot;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("> 이름 국어 영어 수학 입력 ? "); // 홍길동 90 87 65
		name = sc.next();
		kor = sc.nextByte();
		eng = sc.nextByte();
		mat = sc.nextByte();
		
		tot = (short) (kor + eng + mat);
		avg = (double)tot/3;
		
		System.out.printf("이름=\"%s\", 국어=%d, 영어=%d, 수학=%d, 총점=%d, 평균=%5.2f\n"
				, name, kor, eng, mat, tot, avg);
		
	} // main

} // class







