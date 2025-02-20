package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author kenik
 * @date 2025. 2. 5. - 오후 2:11:09
 * @subject 
 * @content // Type Convert( 형 변환 )
		    // 1) 자동 형 변환
		    // 2) 강제 형 변환	 
		     int  -> byte
		     byte -> long
 */
public class Ex06_02 {

	public static void main(String[] args) throws IOException {
		// [문제]
		// 이름, 국어, 영어, 수학 점수를 입력받아서
		// 총점
		// 평균
		// [ 출력 ]
		// 이름="홍길동", 국어=90, 영어=89, 수학=77, 총점=256, 평균=85.33
		String name;
		byte kor, eng, mat;
		short tot;
		double avg;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
				
		System.out.print("> 이름 입력 ? ");		
		name = br.readLine();
					 
		System.out.print("> 국어 입력 ? ");
		// Cannot cast from String to byte
		//kor = (byte)br.readLine();
		kor = Byte.parseByte(br.readLine());
		System.out.print("> 영어 입력 ? ");
		eng = Byte.parseByte(br.readLine());
		System.out.print("> 수학 입력 ? ");
		mat = Byte.parseByte(br.readLine());
		
		// Type mismatch: cannot convert from int to short
		// short       int
		tot = (short) (kor + eng + mat);
		avg = (double)tot/3;
		
		System.out.printf("이름=\"%s\", 국어=%d, 영어=%d, 수학=%d, 총점=%d, 평균=%5.2f\n"
				, name, kor, eng, mat, tot, avg);
		

	} // main

} // class








