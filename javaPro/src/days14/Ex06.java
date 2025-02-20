package days14;

/**
 * @author kenik
 * @date 2025. 2. 20. - 오후 2:33:09
 * @subject 
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		// [ 지역변수 선언 형식 ]
		// 자료형 변수명[=초기값];
		// final 자료형 상수명=초기값;
		
		// 지역변수는 접근지정자를 붙일 수 없다. 
		// public String name = "홍길동";  X
		
		// 객체 선언 및 생성
		Tv t1  = new Tv();
		t1.power();
		t1.channelUp();
		System.out.println( t1.channel );
		t1.power();
		System.out.println(" end ");
	} // main

} // class

// The public type Tv must be defined in its own file
// Ex06.java 자바 파일을 생성하면 자바 파일 안에는 반드시 1개의 
// public 선언된 클래스( class 자바파일명 )가 있어야 한다. 
//public class Tv{
class Tv{
	
	// [필드 선언 형식]
	// [접] [기] 자료형 필드명[=초기값];
	public String color;
	       boolean power = false;
	public int channel = 11;       
	
	// 메서드 
	public void power() {
		power = !power;
	}
	public void channelUp() {
		channel++;
	}
	public void channelDown() {
		channel--;
	}
} // Tv class







