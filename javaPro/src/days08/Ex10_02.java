package days08;

/**
 * @author kenik
 * @date 2025. 2. 12. - 오후 4:44:49
 * @subject   두 기억공간의 값을 바꾸기.
 * @content    
 */
public class Ex10_02 {

	public static void main(String[] args) {
		/*
		 *  heap                        stack
		 *                             
		 *                              main(){
		 *                                [10] [20]
		 *                                 x    y      지역변수
		 *  m[0] m[1]                             
		 *  [10][20]                          [ 0x100 ] 
		 *  0x100                              m  배열선언
		 *                              }
		 *                              
		 *                              swap(int [] m){
		 *                                 [0x100]
		 *                                   m
		 *                              }
		 * */ 
		int x = 10, y = 20;
		int [] m = { x, y };
		
		System.out.printf("> x=%d, y=%d\n", m[0], m[1]);
        swap( m ); // Call By Reference
		System.out.printf("> x=%d, y=%d\n", m[0], m[1]);

	} // main

	private static void swap(int[] m) {
		System.out.printf("> swap x=%d, y=%d\n",  m[0], m[1]);
		int temp = m[0];  
		m[0] = m[1];         
		m[1] = temp;  	
		System.out.printf("> swap x=%d, y=%d\n",  m[0], m[1]);
	}

	private static void swap(int x, int y) {
		System.out.printf("> swap x=%d, y=%d\n", x, y);
		int temp = x;  
		x = y;         
		y = temp;  		
		System.out.printf("> swap x=%d, y=%d\n", x, y);
	}

} // class
