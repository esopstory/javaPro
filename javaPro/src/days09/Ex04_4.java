package days09;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author kenik
 * @date 2025. 2. 13. - 오후 12:33:54
 * @subject 
 * @content
 */
public class Ex04_4 {

   public static void main(String[] args) { 
      // 830412-2700001
      Scanner scanner = new Scanner(System.in); 
      String rrn = getRrn(scanner);
      System.out.println( rrn );
      
      // rrn -> 생년월일     "1983년 4월 12일" 반환 메서드 선언
      String birthday = getBirthday(rrn);
      System.out.println( birthday );
      
      //만나이
      int iAge = getAmericanAge(rrn);
      System.out.println(iAge);
      
//      ‘ㅍ’은 주민등록번호에 오류가 없는지 확인하는 검증번호로, 아래와 같은 특수한 규칙으로 만든다.
//      ㅍ = 11-{(2×ㄱ+3×ㄴ+4×ㄷ+5×ㄹ+6×ㅁ+7×ㅂ+8×ㅅ+9×ㅇ+2×ㅈ+3×ㅊ+4×ㅋ+5×ㅌ) mod 11}
//
//      즉, 소괄호 안에 있는 것을 계산한 값을 11로 나눠서 나온 나머지를 11에서 뺀 값이 ㅍ이다. (단, 10은 0, 11은 1로 표기한다.)
       // 1*2 + 2*3 + 3*4 =20
      // 6 * 9 = 54
      String s = rrn.replace("-", "");
      int index = 0;
      int sum = 0;
      for(int i = 2; i <= 9;i++)
      {
    	  sum += i * Integer.parseInt(s.substring(index, index + 1));
    	  index++;
      }      
      
      index = 8;
      for(int i = 2; i <= 5;i++)
      {
    	  sum += i * Integer.parseInt(s.substring(index, index + 1));
    	  index++;
      }
      
      
      sum %= 11;
      sum = 11 -sum;
      
      if(sum == 10)
    	  sum = 0;
      else if(sum == 11)
    	  sum = 1;
      System.out.println("Check Sum : " + sum);
      
   } // main

   private static int getAmericanAge(String rrn) {   
	      // 만나이 = 올해년도 - 생일년도   ( 생일지나지않은 경에만 -1  ) 
	      int americanAge = 0;// getCountingAge(rrn)-1;
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

   private static String getBirthday(String rrn) 
   {
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
	   // String regex = "[0-9]{6}-[0-9]{7}";
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







