package days04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author kenik
 * @date 2025. 2. 6. - 오전 10:53:04
 * @subject 
 * @content
 */
public class Ex02 {

	public static void main(String[] args) throws IOException {
		// 11:05 수업 시작~ 
		// [문제] 두 문자열을 비교
		// System.out.println( 3 == 5 );  // false
		String n1 = "홍길동";
		String n2 ;
		
		// 키보도드로 부터 이름을 입력받아서  n2  변수에 저장.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("> 이름(n2) 입력 ? ");
		n2 = br.readLine();
		System.out.printf("> n2 = [%s]\n", n2);
		
		// 두 문자열을 비교할 때는 == 비교연산자를 사용하지 않는다.
		// 두 문자열을 비교 ? String 클래스의 equals() 메서드를 사용한다. ( 암기 )
		// System.out.println( n1 == n2 ); // false
		System.out.println( n1.equals(n2) ); // true
		System.out.println( n1.equals(n2)?"같다":"다르다" ); // true

	} // main

} // class






