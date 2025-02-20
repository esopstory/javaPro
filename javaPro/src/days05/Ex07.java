package days05;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		int user = 0, com = 0;
		String sResult = "";
		Scanner scanner =  new Scanner(System.in);
		
		while(true) {
			com =(int)(Math.random() * 3) +1 ;
			
			System.out.print("해당 숫자를 입력하세요:(1.가위, 2.바위, 3.보, 4.종료) ");
			if(scanner.hasNextInt()) {
				user = scanner.nextInt();
				if(user != 4) 
				{
					if(user < 0 || user > 3)
					{
						System.out.println("1에서 3 사이의 숫자를 입력하세요.");
					}
					else
					{
						if(com == user)
						{
							sResult = "무승부";
						}
						else
						{
							switch (com) {
								case 1://가위
									sResult = (user == 2 ? "유저승리" : "컴퓨터 승리");
									break;
								case 2://바위
									sResult = (user == 1 ? "컴퓨터승리" : "유저승리");
									break;
								case 3://보
									sResult = (user == 1 ? "유저승리" : "컴퓨터승리");
									break;
							} // switch
						}
						System.out.printf("com = %s, user = %s <%s>\n", (com == 1 ? "가위" : (com == 2 ? "바위" : "보"))
								, (user == 1 ? "가위" : (user == 2 ? "바위" : "보")), sResult);
					}
				}
				else
				{
					System.out.println("종료되었습니다.");
					break;
				}				
			}
		} // for i
	} // main
}
