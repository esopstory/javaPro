package days04;

/**
 * @author kenik
 * @date 2025. 2. 6. - 오후 5:26:04
 * @subject  반복문 : for문/ foreach문
 * @content
 */
public class Ex08 {

	public static void main(String[] args) {
		// 동일한 작업을 10번 반복 -> 반복문
		/*
		System.out.println("이창익");
		System.out.println("이창익");
		System.out.println("이창익");
		System.out.println("이창익");
		System.out.println("이창익");
		System.out.println("이창익");
		System.out.println("이창익");
		System.out.println("이창익");
		System.out.println("이창익");
		*/
		// for ( 초기식 ;  조건식 ; 증감식) {}
		
		//  i=10      10<10 t
		/*
		 * 1 2 3 4 5 6 7 8 9 10
		 */
		for (int i = 1; i <= 10 ; i++) {
			System.out.printf( "홍길동-%d\n",  i );
		} // for i

		// System.out.println("홍길동-1");
		System.out.println("end");
		
	} // main

} // class







