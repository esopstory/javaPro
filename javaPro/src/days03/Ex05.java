package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author kenik
 * @date 2025. 2. 5. - 오전 11:45:44
 * @subject 
 * @content
 */
public class Ex05 {

	public static void main(String[] args) throws IOException {	
		
		// [문제] 키보드로 부터 이름을 입력받아서 출력.
		
		
		/*
		 * 표준입력장치
		 * [키보드]   ->  [System.in] -> InputStreamReader -> BufferedReader
		 * 이창익 엔터       
		 * 
		 * String name = br.readLine();
		 * */
		
		// 12:03 수업시작~
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		// Scanner 클래스
		String name = null ;
		System.out.print("> 이름 입력 ? ");
		// Unhandled exception type IOException
		name = br.readLine();
		
		System.out.printf("이름=%s\n", name);


	} // main

} // class







