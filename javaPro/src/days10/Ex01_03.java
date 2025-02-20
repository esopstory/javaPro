package days10;

/**
 * @author kenik
 * @date 2025. 2. 14. - 오전 10:32:49
 * @subject 
 * @content
 */
public class Ex01_03 {

	public static void main(String[] args) {
		// 16진수로 변환 출력
		// 16진수 : 0 1 2 3 4 5 6 7 8 9 A(10) B(11) C(12) D E F(15)
		int n = 31;		
		// System.out.println( Integer.toHexString(n) ); // 1f
		
		int share = n, rest; // 몫, 나머지 변수
		// Ctrl + F
		String hex = "";
		// 
		final char[] hexArr = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};		
		while ( share != 0 ) {
			rest = share % 16; 
			share = share / 16;
			hex = hexArr[rest] + hex;			
		} // while 

        System.out.printf("%s", hex);
		

	} // main

} // class








