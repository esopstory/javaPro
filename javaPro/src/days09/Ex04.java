package days09;

import java.util.Scanner;

/**
 * @author kenik
 * @date 2025. 2. 13. - 오후 12:33:54
 * @subject 
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		/* [주민등록번호]
		 * 1. Resident Registration Number, RRN
		 * 2. ㄱㄴㄷㄹㅁㅂ - ㅅㅇㅈㅊㅋㅌㅍ
		 *    1) ㄱㄴㄷㄹㅁㅂ  생년월일
		 *    2) ㅅ - 18세기, 19세기, 20세기    성별
		 *    
		 *    3) ㅇㅈ - 출생등록지
		 *       ㅊㅋ - 읍,동,면 주민센터 
		 *    4) ㅌ - 주민센터 등록 순번   
		 *    5) ㅍ - 검증번호
		 *    ㅍ = 11-{(2×ㄱ+3×ㄴ+4×ㄷ+5×ㄹ+6×ㅁ+7×ㅂ+8×ㅅ+9×ㅇ+2×ㅈ+3×ㅊ+4×ㅋ+5×ㅌ) mod 11}

              즉, 소괄호 안에 있는 것을 계산한 값을 11로 나눠서 나온 나머지를 11에서 뺀 값이 ㅍ이다. (단, 10은 0, 11은 1로 표기한다.)
		 * */
		// 830412-2700001
		Scanner scanner = new Scanner(System.in); 
		String rrn = getRrn(scanner);
		System.out.println( rrn );
		
		// 1. 성별  ㄱㄴㄷㄹㅁㅂ - [ㅅ]ㅇㅈㅊㅋㅌㅍ
		boolean gender = getGender( rrn );
		System.out.println( gender ? "남자" : "여자" );
		
		// 2. 1800/1900/2000 Centry(세기) 반환하는 메서드
		int century = getCentury(rrn);
		System.out.println( century );
		
		// 3. 국적 - 외국인 false /내국인 true 
		boolean nationality = getNationality(rrn);
		System.out.println( nationality ? "Koreans" : "Foreigners" );

	} // main
	

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

	// 남자:true,  여자:false
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







