package days02;

/**
 * @author kenik
 * @date 2025. 2. 4. - 오전 10:51:33
 * @subject 
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		
		// 1) 문자열 자료형 String
		// 2) 실수   자료형 double
		String name = "이창익";
		double avg = 98.87;
		// 3) 정수   자료형 int
		//    > 나이를 저장할 변수 선언
		// 자료형 변수명[=초기값];
		// int age = 26 + 1;
		int age = 26;
		// 3 * 5 + 2 = 17    *  +  우선 순위가 높다.
		// + 덧셈연산자
		// = 대입(할당)연산자  설명
		// 우측항의 값을 좌측기억공간에 대입(할당)하는 연산자
		System.out.println( age + 1 ); // 27
		
		// [ 출력형식 ]
		// 나이는 26살입니다.
		// 연산자 처리 방향    →     "나이는 26"
		System.out.println( "나이는 " + age +"살입니다." );
		

	} // main

} // class










