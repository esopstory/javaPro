package days07;

/**
 * @author kenik
 * @date 2025. 2. 11. - 오후 2:21:43
 * @subject   p 136 break 문 
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		// i=1
		//     d=2,3,4, 5  5<=9 T
		//              5==5 break
		// 2*1=2 3*1=3 4*1=4 개행
		// i=2
		//     d=2,3,4, 5  5<=9 T
		//              5==5 break
		// 2*1=2 3*1=3 4*1=4 개행
		// 2*2=2 3*2=3 4*2=4 개행
		// :
		라벨: for (int i = 1; i <= 9; i++) {
			for (int d = 2; d <= 9; d++) {  // 단
				if( d==5) break 라벨;
				System.out.printf("%d*%d=%2d ", d, i, d*i);
			} // for d
			System.out.println();
		} // for i	

	} // main

} // class
