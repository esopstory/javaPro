package days02;

/**
 * @author kenik
 * @date 2025. 2. 4. - 오전 11:22:04
 * @subject 
 * @content
 */
public class Ex03_04 {
	
	public static void main(String[] args) {
		
		String name = "홍길동";
		int age = 25;
		double height = 180.78;
		
		// (출력형식)   println() 메서드
		// System.out.println("이름은 \""+name+"\"이고, 나이는 \'"+age+"\'살이고, 키는 "+height+"cm이다.");
		
		// 12:03 수업시작~
		//            printf() 메서드 
		// 메서드 3가지 파악 : 기능, 매개변수, 리턴값
		//System.out.printf(String format, Object... args);
		// %conversion
		// String  s
		// int     d
		// double  f
		System.out.printf("이름은 \"%s\"이고, 나이는 '%d'살이고, 키는 %.2fcm이다."
				, name, 20, height);
		
		
		
		
	} // main

}











