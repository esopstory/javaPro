package days13;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kenik
 * @date 2025. 2. 19. - 오후 12:15:52
 * @subject  검색(Search)                          -> 수정, 삭제, 보기 등등
 * @content     
 */
public class Ex05_04 {

	public static void main(String[] args) {
		// 30개      0~20 정수
		int [] m = { 0, 2, 12, 16, 7, 9, 2, 9, 0, 13, 7, 13, 3, 14, 10
				, 15, 11, 6, 19, 5, 2, 0, 16, 18, 15, 18, 0, 9, 13, 16 };
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 배열에서 찾을 정수 입력 ? ");
		int n = scanner.nextInt(); // 12	
		
		int fromIndex = 0 ;
		int index = -1;
		while (  ( index = sequenceSearch(m, n, fromIndex) ) != -1     ) {
			 System.out.println(index);
			 fromIndex = index + 1;
		} // while		 
		
	} // main
	
	private static int sequenceSearch(int[] m, int n, int fromIndex) {
		int index = -1; 
		for (int i = fromIndex; i < m.length; i++) {
			if( m[i] == n ) return i;			
		} // for i		
		return  index;
	} 
	
	 

} // class
