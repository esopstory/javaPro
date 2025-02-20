package days04;

/**
 * @author kenik
 * @date 2025. 2. 6. - 오전 11:14:40
 * @subject 
 * @content
 */
public class Ex02_02 {

	public static void main(String[] args) {
		// 두 문자열을 비교할 때는  String.equals() 메서드 사용 (암기)
		String n1 = "홍길동";
		String n2 = "홍길동";
		
		System.out.println( n1 == n2 );      // 왜 ? true 
		System.out.println( n1.equals(n2) );

		/*
		질문입니다.
		검색해보니 래퍼클래스가 
		Integer, Byte, Character 등등 종류가 많던데
		각각 어느 때 사용하는건가요?
		*/		
	} // main

} // class
