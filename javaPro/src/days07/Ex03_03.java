package days07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author kenik
 * @date 2025. 2. 11. - 오전 11:39:48
 * @subject
 * @content
 */
public class Ex03_03 {

	public static void main(String[] args) throws IOException {
		
		// Ctrl + A -> Ctrl + I  
		// Ctrl + Shift + F
 
		String name;
		byte kor, eng, mat;
		short tot;
		double avg;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//                  홍길동,90,78,97
		System.out.print("> 이름,국어,영어,수학 입력 ? ");
	    String data = br.readLine(); // "홍길동,90,78,97"
	    
	    // 12:01 수업시작~ split()  + 배열   연습
	    String [] dataArr = data.split(",");
		name = dataArr[0]; 
		kor = Byte.parseByte(dataArr[1]); 
		eng = Byte.parseByte(dataArr[2]); 
		mat = Byte.parseByte(dataArr[3]);
 
		tot = (short) (kor + eng + mat);
		avg = (double) tot / 3;

		System.out.printf("이름=\"%s\", 국어=%d, 영어=%d, 수학=%d, 총점=%d, 평균=%5.2f\n", name, kor, eng, mat, tot, avg);

	} // main

} // class
