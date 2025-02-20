package days04;

import java.util.Scanner;

/**
 * @author kenik
 * @date 2025. 2. 6. - 오후 3:33:53
 * @subject 
 * @content
 */
public class Ex06_04 {
	
	public static void main(String[] args) { 
		int kor = -1 ;		 
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 국어 점수 입력 ? ");  
		 
		if (!scanner.hasNextInt()) {
			System.out.println("[알림] 국어 점수 0~100 !!!");
			return ;
		} // if
	 
		kor = scanner.nextInt();   
		char grade = '수'; 
		if ( 0 <= kor && kor <= 100 ) {
			if ( 90 <= kor ) {   
				// System.out.println("수");
				grade = '수';
			}else if ( 80 <= kor ) {
				//System.out.println("우");
				grade = '우';
			}else if ( 70 <= kor  ) {
				//System.out.println("미");
				grade = '미';
			}else if ( 60 <= kor) {
				//System.out.println("양");
				grade = '양';
			}else {
				//System.out.println("가");
				grade = '가';
			} // if
			
			System.out.printf("%d => %c\n", kor, grade);
		} else {
			System.out.println("[알림] 국어 점수 0~100 !!!");
		} // if
		
		System.out.println(" end ");
	} // main

} // class








