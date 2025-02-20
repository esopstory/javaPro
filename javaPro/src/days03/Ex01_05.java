package days03;

public class Ex01_05 {

	public static void main(String[] args) {
		// 대문자 + 32 = 소문자
		// System.out.println( 'A' - 'a' );
		
		char a = 'x';
	    char b;
	    
	    // Type mismatch: cannot convert from int to char
	    b = (char) (a - 32);
	    System.out.println( b );
	    // System.out.printf("%c\n", a-32  ); // X
	    
	    System.out.printf("a=%1$c, b=%1$C\n", a);
	    
	    // 'A'  65      'a' 97
	    // 'B'  66          98
	    // 'C'  67          99

	}

}
