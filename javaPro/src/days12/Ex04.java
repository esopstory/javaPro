package days12;

import java.util.Arrays;
import java.util.Iterator;

/**
 * @author kenik
 * @date 2025. 2. 18. - 오전 10:42:47
 * @subject 
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		/*
		 * [ 정렬(Sort) ]
		 * - 특정 기준에 맞게 데이터를 열거하는 알고리즘
		 * - 오름차순 정렬( [Asc]ending Sort )
		 *    예) 작은 값 ---> 큰값 순으로 정렬
		 *    1 2 3 4 5
		 *    a b c d e
		 *    가나다라마  
		 * 
		 *   내림차순 정렬( [Desc]ending Sort )
		 *    5 4 3 2 1
		 *    e d c b a
		 *    마라다나가
		 *  - [버블], 선택, 삽입, 쉘, 병합 정렬 등등   
		 * */ 

		// ASC    (a,b)   a>b 자리바꿈.
		int[] m = { 3, 5, 2, 4, 1 };

		System.out.println(Arrays.toString(m));
		
		// bubbleSort(m);
		// selectionSort(m);
		// selectionSort2(m);
		insertionSort(m); // 삽입정렬
		
		// Arrays.sort(m);
		
		System.out.println(Arrays.toString(m));
	} // main

	private static void insertionSort(int[] m) {
		/*     ↓     
		 *   0 1 2 3 4   index 
		 *   1 2 3 4 5   value
		 *   
		 *   삽입정렬방식
		 *   ㄴ 두 번째 위치부터 시작해서 왼쪽의 값들과 비교해서 
		 *      삽입될 위치를 지정한 후, 뒤로 값을 밀고
		 *      삽입될 위치에 값을 삽입해서 정렬하는 방법.
		 *   ㄴ  작은 값을 찾는 검색 과정이 필요없다.     
		 * */
		int key; // 삽입할 값
		for (int i = 1, j; i < m.length; i++) {
			System.out.printf("%d - ", i);
			key = m[i];
			// while 조건반복문 좋을 듯 ..
			for (j = i-1; j >= 0 && m[j] > key ; j--) { 
				m[j+1] = m[j];
			} // for j
			m[++j] = key;
			System.out.println(Arrays.toString(m));
		} // for i
	}

	private static void selectionSort2(int[] m) {
		/*     ↓    minIndex
		 *   0 1 2 3 4   index 
		 *   1 2 3 4 5   value
		 * */
		for (int i = 0, minIndex; i < m.length-1; i++) {
			minIndex = i;
			for (int j = i+1; j < m.length; j++) {
				if (m[minIndex] > m[j] ) {
					minIndex = j;
				} // if
			} // for j
			if (i != minIndex) {
				int temp = m[i];
				m[i] = m[minIndex];
				m[minIndex] = temp;
			} 
		} // for i
		
	} // selectionSort2

	private static void selectionSort(int[] m) {
		/*   0 1 2 3 4   index 
		 *   3 5 2 4 1   value
		 *   
		 *   0-1 0-2 0-3 0-4 1회전
		 *   1-2 1-3 1-4     2회전
		 *   2-3 2-4         3회전
		 *   3-4             4회전
		 * */
		
		for (int i = 0; i < 4; i++) {  // 행
			for (int j = i+1; j <= 4; j++) {	
				System.out.printf("(%d,%d) ", i,  j );
				if ( m[i] > m[j]) {
					System.out.print(" *** ");
					int temp = m[i];
					m[i] = m[j];
					m[j] = temp;
				} // if
				System.out.println(Arrays.toString(m));
			} // for j
			System.out.println();
		} // for i
		
		
	}

	private static void bubbleSort(int[] m) {
		/*      0 1 2 3 4  index
		 * 		3 5 2 4 1  value
		 * 
		 * (0,1) (1,2) (2,3) (3,4)   1회전  0    4
		 * (0,1) (1,2) (2,3)         2회전  1    3
		 * (0,1) (1,2)               3회전  2    2
		 * (0,1)                     4회전  3    1
		 */
		for (int i = 0; i < 4; i++) { // 행
			for (int j = 0; j < 4-i; j++) { // 열 
				System.out.printf("(%d,%d)", j, j+1);
				if ( m[j] > m[j+1]) {
					System.out.print(" *** ");
					int temp = m[j];
					m[j] = m[j+1];
					m[j+1] = temp;
				} // if
				System.out.println(Arrays.toString(m));
			} // for j
			System.out.println();
			
		} // for i
		
	}

} // class
