package days09;

/**
 * @author kenik
 * @date 2025. 2. 13. - 오전 11:53:02
 * @subject  indexOf()
 * @content  split()
 *           substring()
 *           repeat()
 *           length()
 *           concat()
 *           join() 
 */
public class Ex03_03 {

	public static void main(String[] args) { 
		// 주민등록번호(Resident registration number)
		String rrn = "830412-1700001";
		
		// [문제] 주민등록번호 뒷자리 7개 출력.
		// System.out.println( rrn.split("-")[1] );
		// System.out.println( rrn.indexOf("-") );
		int beginIndex = rrn.indexOf("-") + 1 ; // <=
		int endIndex = rrn.length();   //  <
		System.out.println(  rrn.substring(beginIndex, endIndex) );
		System.out.println(  rrn.substring(beginIndex) );
		
		/*
		//         01234567   
		// 1)      830412-*******
		int beginIndex = 0; // <=
		int endIndex = 7;   //  <
		String s = rrn.substring(beginIndex, endIndex);
		int count = rrn.length() - s.length();
		System.out.println( s + "*".repeat(count));
		
		// 2)      830412-1******
		beginIndex = 0; // <=
		endIndex = 8;   //  <
		s = rrn.substring(beginIndex, endIndex);
		count = rrn.length() - s.length();
		System.out.println( s + "*".repeat(count));
		*/
		
	} // main

} // class







