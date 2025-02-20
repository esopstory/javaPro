package javaPro;

import java.util.Random;
import java.util.Scanner;

public class Text20250214 {
	public static void main(String[] args) {
//		1. 카드번호(String card ="7655-8988-9234-5677" )를
//		   임의의 2곳을 * 로 바꿔서 출력하는 코딩을 하세요 .
//		   출력형식:
//		           7655-****-****-5677
//		           ****-8988-9234-****
		String card ="7655-8988-9234-5677";	
		Scanner scanner = new Scanner(System.in);
		
		displayRandomCardNum(scanner, card);
		
//		2. 10진수 정수를 입력받아서 2진수로 출력하는 메서드를 선언하세요. 
//		   (조건: 제어문을 사용해서 직접 로직으로 처리하세요.) 
//		   (2진수 출력형식: "00001010")
//		   (메서드명 : binaryConvert)
		binaryConvert(scanner);
		
//		3. 주민등록번호를 매개변수로 입력받아서 검증해서 boolean형으로 반환하는 메서드를 선언하세요.
//		   ( 메서드명 :  isRrnCheck )
//		  
//			‘ㅍ’은 주민등록번호에 오류가 없는지 확인하는 검증번호로, 아래와 같은 특수한 규칙으로 만든다.
//			ㅍ = 11-{(2×ㄱ+3×ㄴ+4×ㄷ+5×ㄹ+6×ㅁ+7×ㅂ+8×ㅅ+9×ㅇ+2×ㅈ+3×ㅊ+4×ㅋ+5×ㅌ) % 11}
//			즉, 소괄호 안에 있는 것을 계산한 값을 11로 나눠서 나온 나머지를 11에서 뺀 값이 ㅍ이다. 
//			(단, 10은 0, 11은 1로 표기한다.)
		String rrn = inputRRN(scanner);
		boolean bCheck = isRrnCheck(rrn);
		
//		4. 주민등록번호를 매개변수로 입력받아서 만나이를 계산해서 반환하는 메서드를 선언하세요.
//	    ( 만나이 = 올해년도-생일년도     생일이지나지않으면 -1 )
		
	} // main

	private static boolean isRrnCheck(String rrn) {
		int[] iCheckValue = {2,3,4,5,6,7,8,9,2,3,4,5};
		int sum = 0;
		String rrn_ = rrn.replace("-", "");
		
		for(int i = 0; i < iCheckValue.length; i++)
		{
			sum += Integer.parseInt((String) rrn_.subSequence(i, i + 1)) * iCheckValue[i];
		}
		int i = (11 - (sum % 11)) % 10;
		return (i == rrn.charAt(rrn.length() - 1));
	}

	private static String inputRRN(Scanner scanner) {
		String regex = "[0-9]{6}-[0-9]{7]";
		String rrn = "";
		boolean bCheckFormat = false;
		int count = 0;
		
		do
		{
			if(bCheckFormat)
			{
				//잘못된 입력!!!
				//count++ > 3
			}			
			bCheckFormat = true;
			rrn = scanner.next();
		}while(rrn.matches(regex));
		
		return rrn;
	}

	private static void binaryConvert(Scanner scanner) {
		System.out.printf("10진수 정수: ");
		//do -- 입력 유효성검사
		String n = scanner.next();
		//while
		
		int quotient = Integer.parseInt(n);
		String remainder  = "";
		String sBin = "";
		
		do
		{
			quotient = quotient / 2;
			remainder  += quotient % 2;
		}while(quotient != 0);
		
		System.out.printf("%s\n", "0".repeat(8 - remainder .length()) + remainder );		
	}

	private static void displayRandomCardNum(Scanner scanner, String card) {
//		System.out.println();
//		String n = scanner.next();
		String[] cards = card.split("-");
//		int n = (int)(Math.random() * 3) + 1;
		int[] n = new Random().ints(0 , 4).distinct().limit(2).toArray();
		
		cards[n[0]] = "****";
		cards[n[1]] = "****";
		System.out.println(String.format("%s-%s-%s-%s", cards[0], cards[1], cards[2], cards[3]));	
		System.out.println(String.format("%s", String.join("-", cards)));	
	}
	
	public static void aaa() {
		// __*
	    // _***
	    // *****
	    // _***
	    // __*
		int m = 5;
		int l = 0, n = 0;
		for(int i = 1; i <= m / 2 + 1; i++)
		{
			if(m / 2 + 1 < i)
			{
				l = i - (m / 2 + 1);
			}
			else
			{
				l = 3 - i;
				n = i * 2  - 1;
			}
			for(int j = 1; j <= l; j++)
			{				
				System.out.printf("_");
			}
			for(int k = 1;k <= n; k++)
			{
				System.out.printf("*");
			}
			
			
			
			System.out.println();
		}
	} // main
	
}
