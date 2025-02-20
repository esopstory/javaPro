package days07;

import java.util.Arrays;

/**
 * @author kenik
 * @date 2025. 2. 11. - 오전 11:11:43
 * @subject 
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		
		String data = "홍길동,이창익,서영학,정창기";
		String regex = ",";
		String [] names = data.split(regex);
		
		// [홍길동, 이창익, 서영학, 정창기]
		// System.out.println( Arrays.toString( names ) );
		
		// [for문]
		// 배열명.length => 배열크기
		/*
		int size = names.length;
		for (int i = 0; i < size; i++) {
			System.out.printf("names[%d]=\"%s\"\n", i, names[i]);
		} // for i
		*/
		
		// [foreach문] == 확장for문
		/*
		for (   :  배열 또는 컬렉션클래스 ) {
			
		} // for
		*/
		
		for(String name : names) {
			System.out.println( name );
		} // for

		 
		// 문자열(String) 메서드 
		// 1. charAt()
		// 2. equals() / equalsIgnoreCase()
		// 3. length()
		// 4. valueOf()
		// 5. toUpperCase()/ toLowerCase()
		// 6. format()
		// 7. toCharArray()
		// 8. repeat()
		// 9. split()
		// 10. trim()
	 
		

	} // main

} // class







