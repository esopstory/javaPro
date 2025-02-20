package days07;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @author kenik
 * @date 2025. 2. 11. - 오후 2:36:12
 * @subject 
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {

		// 1 <=   <= 100 임의의 정수를 중복되지 않게 배열에 채워넣기.
		// days06.Ex01.java 복사 + 붙이기.
		/*
		int index = 0, n;		
		int [] m = new int[10];
		m[index++] = (int)( Math.random()*100)+1;
		// 1
		while ( index < m.length ) {
			n =  (int)( Math.random()*100)+1; 
			boolean flag = false;
			for (int i = 0; i < index; i++) {
				if( m[i] == n ) {
					System.out.println("*");
					flag = true;
					break;
				}
			} // for i	 
			if( !flag ) m[index++] = n;
		} // while
		*/

		// new Random().ints(1, 101).distinct().limit(10)
		//   .forEach(System.out::println);
		
		int [] m = new Random().ints(1, 101).distinct().limit(10).toArray();		
		System.out.println( Arrays.toString(m) );
		// 3:03 수업시작~
		// m = [81, 86, 98, 77, 10, 97, 99, 9, 93, 39]
		System.out.print("> 정수(n) 입력 ? ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();  // 76
		
		// [문제] n과 가장 가까운 수(근사치)를 구해서 출력..
		int [] m2 = new int[m.length];
		for (int i = 0; i < m.length; i++) {
			int diff= m[i] - n;
			//m2[i] = diff < 0 ? -diff: diff;
			m2[i] = Math.abs(diff);			
		} // for i

		System.out.println( Arrays.toString(m2) );
		
		int minDiff = IntStream.of(m2).min().getAsInt();
		System.out.println(minDiff);
		
		for (int i = 0; i < m2.length; i++) {
			if( m2[i] == minDiff ) {
				System.out.printf("%d 위치값: %d \n ", i, m[i] );
			}
		} // for i

	} // main

} // class









