package days09;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @author kenik
 * @date 2025. 2. 13. - 오후 12:33:54
 * @subject 
 * @content
 */
public class Ex04_05 {

	public static void main(String[] args) { 
		 
		String rrn = "830412-2700001";
		
		// 2/3/4/5/6/7/8/9/10/11
		int tot = 0;
		int [] m = {2,3,4,5,6,7,0,8,9,2,3,4,5};
		for (int i = 0; i <= 12; i++) {			
			tot += (rrn.charAt(i)-'0')*m[i];
		} // for i		
		int ㅍ = Integer.parseInt( rrn.substring(13, 14) ); 		
		int checkSum = (11-((tot) % 11))%10;
		
		if (ㅍ == checkSum) {
			System.out.println("검증 주민번호 O");
		} else {
			System.out.println("검증 실패된 주민번호 X");
		} // if
		 
	} // main

	private static int getAmericanAge(String rrn) {	
		// 만나이 = 올해년도 - 생일년도   ( 생일지나지않은 경에만 -1  ) 
		int americanAge = getCountingAge(rrn)-1;
		// 생일의 월/일 - 0412
		// 올해의 월/일 - 3 13
		/*
		   if (!(올해월>=생일월  && 올해일>=생일일))   age--;
		*/      
		//  0412 
		int birthMD = Integer.parseInt( rrn.substring(2, 6) );
		// 올해 월일
		Date d = new Date();
		int currMD = ( d.getMonth()+1)*100 +   d.getDate();
		if( birthMD > currMD ) americanAge--;		 
		return americanAge;
	
	}

	private static int getCountingAge(String rrn) {
		// 자바에서 날짜/시간 다루는 기능이 구현된 클래스 : Date, Calendar
		//                                         LocalDate, LocalTime, LocalDateTime
		/* [1]
		Date d = new Date();
		System.out.println( d.getYear() + 1900 );
		*/
		
		/* [2]
		Calendar c = Calendar.getInstance();
		System.out.println(  c.get(Calendar.YEAR) );
		*/
		
		LocalDate d = LocalDate.now();
		int currentYear = d.getYear(); // 올해년도
		
		// int birthYear = Integer.parseInt(getBirthday(rrn).substring(0, 4));
		int birthYear = getYear(rrn);
		
		return currentYear - birthYear + 1;
	}
	
	private static int getYear(String rrn) {
		int year = getCentury(rrn) + Integer.parseInt( rrn.substring(0, 2) );
		return year;
	}

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


/*
for (int i = 0; i <=11; i++) {
	System.out.println(2+i%8);
} // for i
*/




