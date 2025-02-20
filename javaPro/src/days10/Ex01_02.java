package days10;

/**
 * @author kenik
 * @date 2025. 2. 14. - 오전 10:32:49
 * @subject 
 * @content
 */
public class Ex01_02 {

	public static void main(String[] args) {
		// 16진수로 변환 출력
		// 16진수 : 0 1 2 3 4 5 6 7 8 9 A(10) B(11) C(12) D E F(15)
		int n = 31;		
		// System.out.println( Integer.toHexString(n) ); // 1f
		
		int share = n, rest; // 몫, 나머지 변수
		// Ctrl + F
		String hex = "";
		while ( share != 0 ) {
			rest = share % 16; 
			share = share / 16;
			switch (rest) {
			case 10:
				hex = 'A' + hex;
				break;
			case 11:
				hex = 'B' + hex;
				break;
			case 12:
				hex = 'C' + hex;
				break;
			case 13:
				hex = 'D' + hex;
				break;
			case 14:
				hex = 'E' + hex;
				break;
			case 15:
				hex = 'F' + hex;
				break;
			default:
				hex = rest + hex;
				break;
			} // switch
						
		} // while 

        System.out.printf("%s", hex);
		

	} // main

} // class








