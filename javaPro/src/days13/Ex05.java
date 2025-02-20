package days13;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kenik
 * @date 2025. 2. 19. - 오후 12:15:52
 * @subject  검색(Search)
 * @content   ㄴ 항목의 집합 중에 특정 항목을 찾아내는 것.
 *            1) 순차 검색( Sequence Search )
 *            2) 이진 검색( Binary Search )
 */
public class Ex05 {

	public static void main(String[] args) {
		// 30개      0~20 정수
		int [] m = { 0, 2, 12, 16, 7, 9, 2, 9, 0, 13, 7, 13, 3, 14, 10
				, 15, 11, 6, 19, 5, 2, 0, 16, 18, 15, 18, 0, 9, 13, 16 };
		
		// Arrays.binarySearch(m, 9);
		// Arrays.sort(m);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 배열에서 찾을 정수 입력 ? ");
		int n = scanner.nextInt(); // 12
		
		// 만약에 찾는 값이 배열 속에 없다면   -1 반환
		int index = sequenceSearch(m, n);
		
		if (index != -1 ) {
			System.out.printf("찾는 정수 %d는 %d 위치에 있다.", n, index);
		} else {  // X
			System.out.println("찾는 정수는 없다.");
		} // if

	} // main

	private static int sequenceSearch(int[] m, int n) {
		int index = -1;
		// 검색 작업 -> index = 찾은위치값
		for (int i = 0; i < m.length; i++) {
//			if( m[i] == n ) {
//				index = i;
//				break;
//			}
			if( m[i] == n ) return i;
			
		} // for i
		
		return  index;
	}

} // class
