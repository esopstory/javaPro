package days08;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author kenik
 * @date 2025. 2. 11. - 오후 3:42:57
 * @subject  do~while 문
 * @content  가위/바위/보 게임 구현..
 *      > user 가위(1)/바위(2)/보(3) 선택 ? _
        > com=3, user=2
               컴퓨터 승리
 *          1) 게임을 계속 여부 ? y
 *          2) 3게임을 먼저 이기면 게임 종료 ... 
 *              3:1  컴퓨터가 최종 승리!!!
 */
public class Test04 {

	public static void main(String[] args) throws IOException {
		// 4:00 수업 시작~ 
		int com, user;
		Scanner scanner = new Scanner(System.in);
		char con = 'y';

		int comScore = 0, userScore = 0;
		// int [] winningRate = new int[2]; // [0] 컴승률, [1] 사승률
		//                   0      1     2     3
		String [] rpsArr = {"", "가위", "바위", "보"};

		String regex = "[1-3]"; // "[a-zA-Z0-9]"
		boolean isFirst = false;
		int count = 0;
		String input = null;

		do {
			count = 0;
			isFirst = false;
			
			com = (int) (Math.random() * 3) + 1;
			
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
				input = scanner.next();
				
				count++;  
			} while (  !input.matches(regex)  );
			
			user = Integer.parseInt(input);

			System.out.printf("> com=%s, user=%s\n"
					, rpsArr[com], rpsArr[user]);

			// 승자 판단해서 출력...
			switch (user - com) {
			case 0:
				System.out.print("무승부");
				break;
			case 1:
			case -2:
				System.out.print("사용자 승리"); 
				userScore++;
				// winningRate[1]++;
				break;
			case -1:
			case 2:
				System.out.print("컴퓨터 승리");
				comScore++;
				// winningRate[0]++;
				break;
			} // switch
			System.out.printf("( %d : %d )\n",comScore, userScore); 

			// 
			if (comScore == 2 || userScore == 2) {
				System.out.printf("최종 승리자: %s 입니다.\n"
						, comScore == 2 ? "컴퓨터" : "사용자" );
				break;
			} // if

			// 1) 게임을 계속 여부 ? y
			System.out.print("\n 게임 계속합니까 ? ");
			con = (char)System.in.read(); // y, n
		} while ( con == 'y' || con == 'Y' ); 

		System.out.println("end");
	} // main

} // class
