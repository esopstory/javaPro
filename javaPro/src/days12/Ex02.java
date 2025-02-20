package days12;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author kenik
 * @date 2025. 2. 18. - 오전 9:20:29
 * @subject 배열 단점 - 배열크기 자동 증가X
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		int [] m = { 3,5,2,4,1 };
		System.out.println( m.length ); // 배열크기
		System.out.println( Arrays.toString(m) );
		// [1] 6 을 배열의 제일 뒤에 추가(append)
		m = Arrays.copyOf(m, m.length+1);
		m[5] = 6;
		System.out.println( Arrays.toString(m) );
		
		// [2] 2 가 있는 위치를 찾아서 100을 삽입
		/* 1.
		int index = -1;
		for (int i = 0; i < m.length; i++) {
			if( m[i] == 2 ) index = i;
		} // for i
		// if(index == -1 ) System.out.println("2는 없다.");
		System.out.println("> index = " + index );
		*/
		// 2. 배열의 단점 -> 컬렉션 클래스 사용( List ) + indexOf() 메서드
		/*
		List<Integer> list = List.of(3, 5, 2, 4, 1, 6);
		int index =  list.indexOf(2);
		System.out.println("> index = " + index );
		*/		
		// 3. (암기) 람다와 스트림
		//  배열 -> List 변환. indexOf() 메서드
		int index = Arrays.stream(m) // 배열 -> Stream 변환
		      .boxed()   // 기본형 int [] -> 래퍼클래스 Integer [] 변환
		      .collect(Collectors.toList()) // List 로변환
		      .indexOf(2);
		System.out.println("> index = " + index );
		// [3, 5, [100], 2, 4, 1, 6]
		// 1. 
		/*
		m = Arrays.copyOf(m, m.length+1);
		System.out.println( Arrays.toString(m) );
		//                m.length-2
		// [3, 5, 2, 4, 1, 6, 0]
		for (int i = m.length-2; i >= index; i--) {
			m[i+1] = m[i];
		} // for i
		*/
		// 2. 
		//[3, 5, 2, 4, 1, 6, 0]
		int [] temp = new int[m.length+1];
		System.arraycopy(m, 0, temp, 0, index);
		System.arraycopy(m, index, temp, index+1, m.length-index);
		m = temp;
		m[index] = 100;
		System.out.println( Arrays.toString(m) );
		// [3, 5, 100, 2, 4, 1, 6]
		
		// [문제]  다시 100 삭제
		// [3, 5, 2, 4, 1, 6]
		index = 2 ;  // 위치가 2인 100정수를 삭제 
		temp = new int[m.length-1];
		System.arraycopy(m, 0, temp, 0, index);
		System.arraycopy(m, index+1, temp, index, m.length-1- index);
		// System.arraycopy(m, index+1, temp, index, temp.length - index);
		m = temp;
		System.out.println( Arrays.toString(m) );
		
		


	} // main

} // class
