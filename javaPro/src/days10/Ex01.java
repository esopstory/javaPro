package days10;

import java.util.Arrays;
import java.util.Random;

/**
 * @author kenik
 * @date 2025. 2. 14. - 오전 7:11:07
 * @subject 
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		/*
		2. 10진수 정수를 입력받아서 2진수로 출력하는 메서드를 선언하세요. 
	   (조건: 제어문을 사용해서 직접 로직으로 처리하세요.) 
	   (2진수 출력형식: "00001010")
	   (메서드명 : binaryConvert)
		*/
	   int n = 10;
	   String result =  binaryConvert(n);
	   System.out.println( result );
	   
	   //System.out.println( Integer.toBinaryString(-10));
	} // main
	

	public static String binaryConvert(int n) {
		
		int share = n, rest; // 몫, 나머지 변수
		String binary = "";
		while ( share != 0 ) {
			rest = share % 2; 
			share = share / 2;
			binary = rest + binary;			
		} // while 
		return String.format("%s%s"
				, "0".repeat( 8- binary.length()), binary);
		
	}
	
	/*
	public static String binaryConvert(int n) {
		
		int share, rest; // 몫, 나머지 변수
		String binary = "";
		while ( n != 0 ) {
			share = n / 2;
			rest = n % 2;
			System.out.println( rest );
			binary = rest + binary;
			n = share;
		} // while
		
		// System.out.println( binary );
		//                  1010
		return String.format("%s%s"
				, "0".repeat( 8- binary.length()), binary);
	}
	*/
	
	/*
	public static String binaryConvert(int dec) {
		int [] bin = new int[8];
		int s = bin.length-1;
		int mok = 0, nmg = 0;
		do {
			mok = dec/2;
			nmg = dec%2;
			bin[s--] = nmg;
			dec = mok;
		} while ( mok != 0 );
		System.out.println( Arrays.toString(bin)  );
		// return String.join("", String [] bin);
		return null;
	}
	*/

} // class



//git branch -m master main
