package days07;

import java.io.IOException;

public class Ex09_02 {
	public static void main(String[] args) throws IOException {
		char one;		
		System.out.print("> 한 문자 입력 ? ");
	    one = (char) System.in.read();
	    System.out.printf("%c\n", one);
	   	
//	    while (System.in.available() > 0) {
//	        System.in.read();
//	    }
	    
		System.out.print("> 한 문자 입력 ? ");
	    one = (char) System.in.read();
	    System.out.printf("%c\n", one);
	    
	    /*
	    > 한 문자 입력 ? a엔터
	    a	
	    > 한 문자 입력 ? b엔터
	    b
	    */
	} // main

}
