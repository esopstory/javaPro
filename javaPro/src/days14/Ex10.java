package days14;

/**
 * @author kenik
 * @date 2025. 2. 20. - 오후 4:21:08
 * @subject 
 * @content
 */
public class Ex10 {

	public static void main(String[] args) {
		/*
		 * [멤버(필드,메서드) 앞에 붙는 접근지정자 설명]
		 *  1. public        - 패키지 내/외부 어디서나 접근(참조) 가능.
		 *  2. protected     - default + 상속(패키지 외부에서 자식클래스에 접근 가능)
		 *  3. default(package) - 패키지 내부에서만 접근(참조) 가능.
		 *  4. private       - 같은 클래스 내에서만 접근(참조) 가능.  
		 *  
		 *   public > protected > defalut > private
		 * */
		
		// days14.Time.java
		// days14.Ex10.java
		// (패키지 내부에서 테스트)
		Time t = new Time();
		// 가비지
		// [][][][][]                      [null]t
		t = null;
		
		// t.   public , protected, default 필드,메서드 접근 가능
		
		// The field Time.milisecond [is not visible]
		// t.milisecond = 100;

	}  // main

} // class



