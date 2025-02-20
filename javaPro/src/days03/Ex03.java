package days03;

/**
 * @author kenik
 * @date 2025. 2. 5. - 오전 10:47:21
 * @subject 
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		// [시험] 두 기억공간의 값을 바꾸기
		int x = 10, y = 20;
		System.out.printf("> x=%d, y=%d\n", x, y);
		
		// 11:03 수업시작~ 
		{
			int temp = x; // 10
			x = y;        // 20
			y = temp;     // 10
		}
		
		System.out.printf("> x=%d, y=%d\n", x, y);

	} // main

} // class









