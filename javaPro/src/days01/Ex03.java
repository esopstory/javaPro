package days01;

import java.io.BufferedReader;
import java.util.Date;

// Ctrl + Shift + O
 

// import java.lang.System;
// import java.lang.*;

// 1. 반드시 시작개체  클래스 선언
//   ㄴ 클래스 선언 형식
public class Ex03{
	
	// 진입점 (기능) -> main() 메서드
	// 메서드 == 어떤 물건(부품, 객체, 개체, Object, 클래스)이 가지는 기능(일)
	// 함수
	// [메서드 3가지 파악]
	// 1) 기능
	// 2) 매개변수(파라미터)
	// 3) 리턴값( 리턴자료형 )
	
	public static void main(String [] args) {
		// 1) 기능 : 프로그램의 시작, 종료
		// 2) 매개변수 : String [] args
		// 3) 리턴값 : 없다  (  리턴자료형을 보니 void  )
		
		// 본인의 이름을 출력.
		// 표준출력장치(모니터)에 출력 물건(클래스) ? System 클래스
		System.out.println("이창익"); 
		System.out.println("홍길동"); 
		System.out.println("서영학"); 
		
		System.out.println("이름");
		
		// 예) 집    벽 + 못 친다. 
		//    망치(물건)   == System
		//        1)  A 못 치는 부분         +  망치질하다( "못" )
		//        2)  B 못 빼는 부분
		// 창고.망치.A부분.망치질하다("못");
		
		BufferedReader br;
		Date d;
		
	}
}

/*
한 패키지 안에 main 메서드를 가진 클래스가 여러 개일 수도 있나요? 
여러 개일 수 있다면 클래스 간 실행 순서는 어떻게 정해지나요?
*/