package days07;

import java.io.IOException;

/**
 * @author kenik
 * @date 2025. 2. 11. - 오전 10:47:57
 * @subject 
 * @content
 */
public class Ex02 {

	public static void main(String[] args) throws IOException {
		// 11:01 수업 시작~ 
		// [ 디버깅~~ ]
		char one;		
		System.out.print("> 한 문자 입력 ? ");
	    one = (char) System.in.read();
	    System.out.printf("%c\n", one);  // a 엔터('\r')
	   	// 엔터  =   CR '\r'  +  LF'\n'
	    // System.in.read();  // '\r'
	    // System.in.read();  // '\n'
	    
	    System.in.skip( System.in.available() );
	    
	    
		System.out.print("> 한 문자 입력 ? ");
	    one = (char) System.in.read();
	    System.out.printf("%c\n", one);
	    
	    System.out.println("end");
	} // main

} // class
