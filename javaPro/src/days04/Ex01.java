package days04;

/**
 * @author kenik
 * @date 2025. 2. 6. - 오전 7:01:46
 * @subject 
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		
		// 연산자 : instanceof 연산자
		//         >> >>>  <<  쉬프트(shift)연산자
		//                           방향을 바꾸다, 이동시키다, 옮기다. 
		//         >>=     <<= 복합대입연산자.
		
		System.out.println( 15 >> 2 );  // 00001111>>2
		//                                 00000011
		System.out.println( 15 >>> 2 ); // 00000011
		System.out.println( 15 << 2 );  // 00111100
	 
		/*
		// 00001111
		String b = Integer.toBinaryString(15) ;  // "1111" -> 1111				
		//System.out.printf("%08d", 1111);
		System.out.printf("%08d", Integer.parseInt(b) );
		*/
		
		System.out.println( Integer.toOctalString(15) ); // 8진수 문자열
		System.out.println( Integer.toHexString(15) ); // 16진수 문자열
		
	} // main

} // class













