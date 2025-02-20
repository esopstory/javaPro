package days08;

/**
 * @author kenik
 * @date 2025. 2. 12. - 오후 4:44:49
 * @subject   두 기억공간의 값을 바꾸기.
 * @content   days03.Ex03.java
 *            매개변수를 가지고 메서드를 호출하는 방법
 *            1) Call By Name    drawLine()
 *            2) Call By Value   sum(10)   isLeayYear(i)
 *            3) Call By Reference ***
 */
public class Ex10 {

	public static void main(String[] args) {
		/*
		 *  heap                        stack
		 *                             
		 *                              main(){
		 *                                [10] [20]
		 *                                 x    y      지역변수
		 *                              }
		 *                              
		 *                              swap(int x, int y){
		 *                                 [20] [10]
		 *                                  x    y   지역변수 
		 *                              }
		 * */
		
 
		int x = 10, y = 20;
		System.out.printf("> x=%d, y=%d\n", x, y);
 
		/*  swap 메서드 선언 + 호출
		{
			int temp = x;  
			x = y;         
			y = temp;      
		}
		*/
		
		// Call By Value
		swap(x, y);  // 원인 ?  swap(10, 20)

		System.out.printf("> x=%d, y=%d\n", x, y);

	} // main

	private static void swap(int x, int y) {
		System.out.printf("> swap x=%d, y=%d\n", x, y);
		int temp = x;  
		x = y;         
		y = temp;  		
		System.out.printf("> swap x=%d, y=%d\n", x, y);
	}

} // class
