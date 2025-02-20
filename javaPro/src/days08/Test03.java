package days08;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// 				홍길동 ,  이창익,	서영학 , 정창기
		Scanner scanner = new Scanner(System.in);
		String data = null;
		
		System.out.print("> 이름을 입력하세요 ? ");
		data = scanner.nextLine();
		
		String regex = "\\s*,\\s*";
		String [] names = data.split(regex);
		
		int no = 1;
		for (String name : names) {
			System.out.printf("[%d] : %s\n",  no++, name);
		}

	}

}
