package days06;

import java.util.Scanner;

/**
 * @author kenik
 * @date 2025. 2. 10. - 오후 4:37:04
 * @subject 
 * @content
 */
public class Ex09 {

	public static void main(String[] args) {
		// Scanner
		Scanner scanner = new Scanner(System.in);
		
		char one = '\u0000';
		System.out.print("> 한 문자 입력 ? ");
		// scanner.next();  String -> 첫 번째 문자를 읽어가면..
		// scanner.nextLine();
		// scanner.nextInt();
		// scanner.nextBoolean();
		// XXX = scanner.nextXXX()
		//  ㄴ scanner.nextChar(); X
		
		/*
		String input = scanner.next();
		one = input.charAt(0);
		*/		
		one = scanner.next().charAt(0);
		
		// "A"          'A'
		// 'A'+'\0'

		System.out.printf("[%c]\n", one);
	} // main

} // class





