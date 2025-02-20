package days14;

/**
 * @author kenik
 * @date 2025. 2. 20. - 오후 4:30:13
 * @subject 
 * @content
 */
public class Ex11 {
	
	// [필드]
	//    ㄴ 1) 인스턴스 변수
	public String color;
	//    ㄴ 2) 클래스(static) 변수
	public static int number;

	// 메소드
	public static void main(String[] args) {  // 지역변수
		/*
		 * [ 자바 변수의 선언되는 위치에 따른 종류 ]
		 *                              <선언 위치>                       <생성시기> 
		 * 1. 인스턴스 변수                클래스 안                         인스턴스가 생성될 때
		 * 2. 클래스(static) 변수          클래스 안                        클래스가 메모리에 올라갈 때
		 * 3. 지역변수                   메소드 안, 초기화블럭, 생성자 안       변수 선언문 실행될 때. 
		 * 
		 * */
		int age; // 지역변수
		String name; // 지역변수
		
		//   i 지역변수 - for {} 블럭에서만 사용되는 지역변수
		for (int i = 0; i < args.length; i++) {
			
		} // for i

	} // main

} // class





