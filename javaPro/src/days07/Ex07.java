package days07;

import java.io.IOException;
import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) throws IOException {
		int com, user = 0;
		char cOntinue = 'n';
		int iWinCom = 0, iWinUser = 0;
		int count = 0;
		final int COUNT = 3;
		boolean flag = false;

		String input = "", regex = "[1-3]";

		Scanner scanner = new Scanner(System.in);

		do {
			do {
				if (flag) {
					count++;
					if (count == COUNT) {
						System.out.printf("> 입력횟수 초과!(%d)\n프로그램을 종료합니다.", count);
						return;
					} else {
						System.out.printf("> [알림] 1~3 정수를 다시 입력!!!(%d)\n", count);
					}
				}
				flag = true;
				System.out.print("> user 가위(1)/바위(2)/보(3) 선택 ? ");
				input = scanner.next();
				if (input.matches(regex))
					user = Integer.parseInt(input);
				
			} while (!(user == 1 || user == 2 || user == 3));
			
			count = 0;
//			flag = false;
			com = (int) (Math.random() * 3) + 1;
			
			System.out.printf("> com=%s, user=%d\n", com == 1 ? "가위" : (com == 2 ? "바위" : "보"), user);

			// 승자 판단해서 출력...
			switch (user - com) {
			case 0:
				System.out.println("무승부");
				break;
			case 1:
			case -2:
				iWinUser++;
				System.out.printf("사용자 승리(%d : %d)\n", iWinCom, iWinUser);
				break;
			case -1:
			case 2:
				iWinCom++;
				System.out.printf("컴퓨터 승리(%d : %d)\n", iWinCom, iWinUser);
				break;
			} // switch

			if (iWinCom == 3 || iWinUser == 3)
				break;
			System.out.print("\n게임 한판더?");
			cOntinue = (char) System.in.read();

		} while (cOntinue == 'y' || cOntinue == 'Y');

		System.out.printf("\n%d : %d - %s 승!\n", iWinCom, iWinUser, (iWinCom > iWinUser ? "컴" : "유저"));
	} // main

}
