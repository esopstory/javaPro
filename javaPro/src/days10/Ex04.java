package days10;

import java.util.Arrays;

/**
 * @author kenik
 * @date 2025. 2. 14. - 오후 2:45:03
 * @subject 
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		/*
		 * [ 배열 ]
		 * 1. 자료형
		 *     ㄴ 기본형
		 *     ㄴ 참조형 - 배열, 클래스, 인터페이스 
		 *   국어점수를 1000명 저장
		 *     int kor = 90;
		 *     syso(kor);
		 *   [] 인덱스연산자  
		 * 2. 정의 ? 동일한 자료형을 메모리상에 연속적으로 놓이게 한 것.
		 * 3. 선언 ?  자료형 [] 배열명 = new 자료형[배열크기];
		 *                    변수
		 *                    지역변수
		 *                    참조변수
		 *                    배열명
		 * 4. 참조타입 그림(기억)
		 *   3:03 수업 시작  
		 * 5. 배열의 크기 = 배열명.length
		 *               "문자열".length() 메소드  
		 * 6. 첨자값(index)  0 1 2 3
		 *    
		 *    0번째 요소           아랫첨자값(lowerBound)
		 *    1번째 요소
		 *    2번째 요소 
		 *    배열크기-1 번째 요소  윗첨자값(upperBound)
		 * 7. ArrayIndexOutofBoundException    
		 * 8. 배열은 초기화 하지 않아도 각 자료형의 기본값으로 초기화 되어져 있다.
		 *  [false, false, false, false, false]
		    boolean [] bArr = new boolean[5];
		    System.out.println( Arrays.toString(bArr) );
		 * 9. 배열 초기화
		 *    int [] m = new int[100];
		 *    m[0] = 1;
		 *    m[1] = 1;
		 *    m[2] = 1;                               
		 * */
		 /* [1]
		 int [] m = new int[3];
		 m[0]=1;
		 m[1]=2;
		 m[2]=3;
		 */
		// [2] int [] m = new int[] {1,2,3};
		// [3] 배열 초기화
		int [] m =  {1,2,3};
		 /*
		 for (int i = 0; i < m.length; i++) {
			 m[i] = 1;
		 } // for i
		 */
		 Arrays.fill(m, -1);
		 System.out.println( Arrays.toString(m ));
		 
		 dispArr(m);
		 
		 
	} // main

	private static void dispArr(int[] m) {
		 
	}

} // class







