package days04;

/**
 * @author kenik
 * @date 2025. 2. 6. - 오전 11:19:15
 * @subject [문제] 연산자
 * @content    [] 인덱스(index) 연산자
 */
public class Ex03 {

	public static void main(String[] args) {  // String 배열 args
		// 한 학생의 국어점수를 저장할 변수를 선언.
		int kor = 0;
		kor = 100;
		System.out.println( kor );
		// 100명  학생의 국어점수를 저장할 변수를 선언.
//		int kor001;
//		int kor002;
//		int kor003;
//		:
//		int kor100;
		
		
		// 1. 배열(array) : 동일한 자료형을 메모리상에 연속적으로 놓이게 한 것(정의)
		//  ㄴ 참조형(Referecne Type)
		// 2. 배열 선언 및 생성 형식
		//    자료형 [] 배열명 = new 자료형[배열크기];
		// 
		
		int [] kors;  // int 배열 kors
		kors = new int[3];
		// 배열 크기
		// 배열명.length
		int size = kors.length;
		System.out.println( size );
		
	    kors[0] = 90;
	    kors[1] = 67;
	    
	    System.out.println( kors[0] );
	    System.out.println( kors[1] );
		
		/*
		   heap                          stack
		     0  1     2     3    9     첨자값(index)
		    아랫첨자값            윗첨자값
		    LowerBound          UpperBound
		                        kors.length-1                    
		   [90][67][4바이트]...[4바이트]
		   0번째 요소(Element)    배열명[첨자값]
		   1번째 요소
		   0x100번지
		   시작주소
		                               [  0x100  ]
		                                kors 변수, 참조변수, 배열명  
		 */


	} // main

} // class






