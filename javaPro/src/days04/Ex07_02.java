package days04;

import java.util.Scanner;

/**
 * @author kenik
 * @date 2025. 2. 6. - 오후 4:35:16
 * @subject 
 * @content
 */
public class Ex07_02 {

   public static void main(String[] args) {
      int kor = -1 ;       
      Scanner scanner = new Scanner(System.in);
      System.out.print("> 국어 점수 입력 ? ");  
       
      if (!scanner.hasNextInt()) {
         System.out.println("[알림] 국어 점수 0~100 !!!");
         return ;
      } // if
    
      kor = scanner.nextInt(); 
      // int 정수            0~100 체크X
      char grade = '수';
      
      // 수/우/미/양/가 출력         switch문 사용~
      // 5:00 수업 시작~~ 
      // 100  수
      // 90 91 92   99/10 = 9 수
//      case 90: case 91: case 99:
      // 80 81 82 ~ 89/10 = 8 우
      
      // Cannot switch on a value of type boolean. 
      // Only convertible int values, strings or enum variables are permitted
      int key = 0 <= kor && kor <= 100 ? 1 : 0;
      // String key = 0 <= kor && kor <= 100 ? "o" : "x";
      switch ( key ) {
      case 1: 
         switch ( kor/10 ) {
         case 10: 
         case 9:         
            grade = '수';
            break;
         case 8:
            grade = '우';
            break;
         case 7:
            grade = '미';
            break;
         case 6:
            grade = '양';
            break;   
         default: // 0~5
            grade = '가';
            //break;
         } // switch
         
         System.out.printf("%d => %c\n", kor, grade);
         break; 
      default:  // 0 "x"
         System.out.println("[알림] 국어 점수 0~100 !!!");
         break;
      } // switch
      
      
      
   } // main

} // class






