package days07;

import java.util.Scanner;

/**
 * @author kenik
 * @date 2025. 2. 11. - 오후 4:42:11
 * @subject 
 * @content  1) 알림 코딩 추가
 *           2) 3번 입력 잘못하면 프로그램 종료!!!
 */
public class Ex07_02 {

	public static void main(String[] args) {
		// 사용자의 가위 바위 보 입력값에 대한 유효성 검사...
		//          1 ~ 3
		int user;
		Scanner scanner = new Scanner(System.in);
		boolean isFirst = false;
		int count = 0;
		do {
			// 최종 3회 실패시 프로그램 종료!!
			if ( count == 3 ) {
				System.out.printf("[알림] 실패횟수:%d \n 프로그램 종료!!!\n", count);
				// break;
				return;
			} // if
			
			// [알림] 1~3 정수를 다시 입력!!!
			if (isFirst) {
				System.out.printf("[알림] 1~3 정수를 다시 입력(실패횟수:%d)!!!\n", count);				
			} // if
			isFirst = true;
			
			System.out.print("> user 가위(1)/바위(2)/보(3) 선택 ? ");
			user = scanner.nextInt();
			
			count++;
		// } while (  user != 1 && user !=2 && user != 3 ); 
		} while (  !( user == 1 || user ==2 || user == 3 ) );
		
		System.out.printf("> user=%d\n",  user	);
		

	} // main

} // class











