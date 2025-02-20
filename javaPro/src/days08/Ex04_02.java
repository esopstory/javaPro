package days08;

/**
 * @author kenik
 * @date 2025. 2. 12. - 오후 12:09:14
 * @subject 
 * @content
 */
public class Ex04_02 {

	public static void main(String[] args) {
				
		//System.out.println("=--------------"); // 50줄 코딩
		drawLine(50, "*");
		System.out.println(" 부서명  : 사원명 ");
		//System.out.println("---------------"); // 50줄 코딩
		drawLine(10);
		System.out.println(" 영업부  : 이태규 ");
		System.out.println(" 총무부  : 신희민 ");
		System.out.println(" 생산부  : 박현주 ");
		System.out.println(" 기획부  : 김예지 ");
		System.out.println(" 기획부  : 하동호 ");
		//System.out.println("---------------"); // 50줄 코딩
		drawLine(); // 메소드 호출부
		
	} // main
	
	// 메소드 오버로딩(Overload)
	// 동일한 메소드명으로 중복 선언
	// 중복함수
	// 중복함수 조건 ? 매개변수 타입 X, 갯수 X
	//              리턴자료형은 조건에 해당되지 않는다.
	// [메소드 선언부]
	// 1) 기능(일) : 라인(선)을 긋는 메소드  drawLine
	// 2) 매개변수 : X
	// 3) 리턴값   : X
	//    리턴자료형 : void
	public static void drawLine() {
		System.out.println("=-------------="); // 50줄 코딩 
	}
	
	// Duplicate method drawLine() in type Ex04_02
	public static void drawLine(int length) {
		for (int i = 1; i <= length; i++) {
			System.out.print("=");
		} // for i
		System.out.println(); // 50줄 코딩 
	}
	
	public static void drawLine(int length, String style) {
		for (int i = 1; i <= length; i++) {
			System.out.print( style );
		} // for i
		System.out.println(); // 50줄 코딩 
	}
	
	/*
	public static int drawLine() {
		System.out.println("=-------------="); // 50줄 코딩 \
		return 0;
	}
	*/
	
	
	// 패키지명 + 클래스명 = 풀(full)네임
	// com.util.Graphic2D.java

} // class




