package days06;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author kenik
 * @date 2025. 2. 10. - 오후 4:09:28
 * @subject 
 * @content
 */
public class Ex08 {

	public static void main(String[] args) throws IOException {
		String name = null;
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 이름 입력 ? ");
		// name = scanner.next();
		name = scanner.nextLine();		
		System.out.println(name);
		System.out.println("end");
	} // main

} // class






