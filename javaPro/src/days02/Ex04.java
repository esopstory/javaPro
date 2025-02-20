package days02;

/**
 * @author kenik
 * @date 2025. 2. 4. - 오후 12:37:47
 * @subject 
 * @content  System.out.println() 출력 + 개행 O
 *           System.out.print()   출력 + 개행 X
 *                            
 *           System.out.printf() 출력
 *           
 *           (문제) 개행하는 방법에 대해서 설명하세요.
 */
public class Ex04 {
	
	public static void main(String[] args) {
		
		System.out.println("이창익");
		System.out.println("변상호");
		System.out.println("김예지");
		// System.out.println("----------------------------");
		System.out.println("-".repeat(50));
		System.out.print("이창익\n");
		System.out.print("변상호" + '\n');
		System.out.print("김예지");
		System.out.println(); // 개행 
		System.out.println("-".repeat(50));
		
	} // main
	
} // class







