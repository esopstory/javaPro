package days08;

import java.util.Scanner;

/**
 * @author kenik
 * @date 2025. 2. 12. - 오후 3:49:21
 * @subject 
 * @content
 */
public class Ex09 {

	public static void main(String[] args) {
		// [문제] 년도를 입력받아서 윤년/평년 출력		
		// 4:01 수업 시작~ 
		/*
		 * 태음력/태양력 -> 오차를 보정하기 위해 추가되는 일/주/월 => 윤년
		 *                       치윤법
		 * 지-태  공전 :       365.2422일   
		 * 그레고리력   : 1년은 365.2425일
		 * 
		 * [치윤법]
		 * 400년      97일    
		 * 
		 *               4 배수년 + 1일 추가          100일 
		 *                                         -3일
		 *              100 배수년  -1일 빼기         +1일
		 *              400 배수년  1일 추가          0일                            
		 * */
		
		/*      [치윤법]  && ||
		 *      ① 서력 기원 연수가 4로 나누어 떨어지는 해는 우선 윤년으로 하고, 
		 *           year % 4  == 0 
		 *      ② 그 중에서 100으로 나누어 떨어지는 해는 평년으로 하며,
		 *          year % 100  != 0 
		 *      ③ 다만 400으로 나누어 떨어지는 해는 다시 윤년으로 정하였다
		 *          year % 400  == 0 
		 */
		
		int year;
		Scanner scanner = new Scanner(System.in);
		year = getYear(scanner);

		if (  isLeapYear(year) ) {
			System.out.println("윤년(leap year)");
		} else {
			System.out.println("평년(common year)");
		} // if		

	} // main

	public static boolean isLeapYear(int year) {
		//              &&     >    ||
		return year % 4  == 0 && year % 100  != 0 || year % 400  == 0 ;
	}

	private static int getYear(Scanner scanner) {
		// 년도 유효성 검사 리턴~  1년 ~>
		String regex = "\\d+"; //
		String strYear ;
		do {
			System.out.print("> 년도 입력 ? ");
			strYear = scanner.next();
		} while ( !strYear.matches(regex) );
		
		return Integer.parseInt(strYear);
	}

} // class
