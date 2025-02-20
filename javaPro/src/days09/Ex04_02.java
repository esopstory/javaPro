package days09;

import java.util.Scanner;

/**
 * @author kenik
 * @date 2025. 2. 13. - 오후 12:33:54
 * @subject 
 * @content
 */
public class Ex04_02 {

	public static void main(String[] args) { 
		// 830412-2700001
		Scanner scanner = new Scanner(System.in); 
		String rrn = getRrn(scanner);
		System.out.println( rrn );
		
		// rrn -> 생년월일     "1983년 4월 12일" 반환 메서드 선언
		String birthday = getBirthday(rrn);
		System.out.println( birthday );
		 
	} // main

	//  "1983년 4월 12일"
	private static String getBirthday(String rrn) {
		// 3:05 풀이~
		// 830412-2700001
		int year = getCentury(rrn) + Integer.parseInt( rrn.substring(0, 2) );
		int month = Integer.parseInt( rrn.substring(2, 4) );
		int day = Integer.parseInt( rrn.substring(4, 6) ); 
		String birthday = String.format("%d년 %d월 %d일", year, month, day);
		return birthday;
	}

	private static boolean getNationality(String rrn) {
		char gender = rrn.charAt(7) ;
		switch (gender) {  
		case '9': case '0': 
		case '1': case '2': case '3': case '4':	
			return true;
		// case '5': case '6': case '7': case '8':
		default:
		    return false; 			
		} // switch
	}

	private static int getCentury(String rrn) {
		char gender = rrn.charAt(7) ;
		switch (gender) {  
		case '9': case '0':
			return 1800; 
		case '1': case '2': case '5': case '6':	
			return 1900;
		// case '3': case '4': case '7': case '8':
		default:
		    return 2000; 			
		} // switch
	}
	
	private static boolean getGender(String rrn) {
		// [2]  String rrn.substring(0, 0)
		String strGender = rrn.substring(7, 8); // "2"
		int gender = Integer.parseInt(strGender); // 2
		return  gender%2==1 ? true:false;
		
		/* [1]
		// char   rrn.charAt(index); 
		// 830412-[2]700001
	    char gender = rrn.charAt(7) ;
		switch (gender) { // '2' => 2
		case '9': case '1': case '3': case '5': case '7':
			return true; // 남자			
		default:
		    return false; // 여자			
		} // switch
		*/		
	}

	private static String getRrn(Scanner scanner) {
		// 유효성 검사   숫자6-숫자7
//		String regex = "[0-9]{6}-[0-9]{7}";
		String regex = "\\d{6}-\\d{7}";
		String rrn ;
		
		// [알림], 실패횟수
		do {
			System.out.print("> 주민등록번호 14자리 입력( 예: 000000-000000) ? ");
			rrn = scanner.next();
		} while ( !rrn.matches(regex) );
		
		return rrn;
	}

} // class







