package days07;

import java.util.Scanner;

/**
 * @author kenik
 * @date 2025. 2. 11. - 오후 4:42:11
 * @subject 
 * @content   숫자 유효성 검사 , 숫자 X  
 */
public class Ex07_03 {

	public static void main(String[] args) {

		// boolean 입력한문자열.matches(regex) 
		
		int user;
		String input;
		Scanner scanner = new Scanner(System.in); 

		System.out.print("> user 가위(1)/바위(2)/보(3) 선택 ? ");
		input = scanner.next();
		// user == 1 || user ==2 || user == 3
		String regex = "[1-3]"; // "[a-zA-Z0-9]"
		
		if ( input.matches(regex) ) {
			user = Integer.parseInt(input);
			System.out.printf("> user=%d\n",  user	);
		} else {
			System.out.println("[알림]입력잘못!!!");
		} // if
		
		
        


	} // main

} // class











