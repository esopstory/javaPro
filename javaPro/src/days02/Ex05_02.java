package days02;

/**
 * @author kenik
 * @date 2025. 2. 4. - 오후 2:25:40
 * @subject 
 * @content
 */
public class Ex05_02 {
	
	public static void main(String[] args) {
		
		// 기본형 - 논리형(boolean)
		boolean gender ;
		//   [       ] 1바이트  true/false 저장
		//     gender
		
		// Type mismatch: cannot convert from int to boolean
		// gender = 100;
		
		gender = true;
		
		// The local variable gender may not have been initialized
		System.out.println( gender );
		// 출력형식 : 성별은 true이다.
		System.out.println( "성별은 " + gender + "이다." );
		// sysf
		System.out.printf("성별은 %1$b(%1$B)(%1$s)이다.", gender);
		
	} // main

} // class
