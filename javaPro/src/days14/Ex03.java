package days14;

import java.util.Random;
import java.util.Scanner;

/**
 * @author kenik
 * @date 2025. 2. 20. - 오후 12:05:49
 * @subject 
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		
		// System s = new System(); 
		
		// m : 지역변수, 참조변수, 배열명
		int [] m = new int[3];
		// [0][0][0]         [주소]
		//                    m
		m[0]=12;
		
		// 변수 선언 형식
		// 자료형 변수명[=초기값];
		// myCar : 지역변수, 참조변수, 객체명
		
		// 클래스 ? 객체의 설계도            Car
		// 객체   ? 클래스로 선언된 참조변수 myCar
		// 인스턴스 ? new 연산자 클래스의 객체가 실제 힙 영역에 생성된 것.
		Car  myCar = null  ;
		 
		myCar = new Car();
		// 객체명.필드명
		// 객체명.메서드명();
		myCar.name = "K9";
		myCar.dispCarInfo();		 
		
		// = new Car()  인스턴스화 되지 않았기 때문에
		// *** NullPointerException
		System.out.println( myCar.name );
		
		/*                                          Car 클래스
		 * 
		 *                                          [0x100]
		 *   인스턴스                                 myCar
		 *   [name][speed][wc][메주소]                변수
		 *   0x100                                   지역변수
		 *                                          참조변수
		 *                                          객체명
		 *                                          
		 *                                          
		 *               [dispCarInto()]
		 *               주소                            
		 * */
		

		Scanner scanner = new Scanner(System.in);
		Random rnd = new Random();
		
	} // main

} // class










