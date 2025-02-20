package days06;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kenik
 * @date 2025. 2. 10. - 오전 7:33:01
 * @subject 
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		// 로또 번호 6개를 출력하는 코딩을 하세요.
		// 10:01 수업 시작~ 
		// 1~45
		// 0~44   +1
		// 1 <= (int)( Math.random()*45)+1  <= 45
		/*
		for (int i = 1; i <= 6; i++) {
			int n = (int)( Math.random()*45)+1 ;
			System.out.println( n );
		} // for i
		*/
		
		// [풀이] 중복 제거 후 로또 번호 6개 출력..
		/*
		int lotto1, lotto2, lotto3, lotto4, lotto5, lotto6;
		int n ;// 
		n =  (int)( Math.random()*45)+1;
		// 1
		lotto1 = n;
		// 2
		n =  (int)( Math.random()*45)+1;
		if( lotto1 == n ) {
			n =  (int)( Math.random()*45)+1;
			if (lotto1 == n) {
				n =  (int)( Math.random()*45)+1;
				if (lotto1 == n) {
					n =  (int)( Math.random()*45)+1;
					if (lotto1 == n) {
						n =  (int)( Math.random()*45)+1;
						if (lotto1 == n) {
							
						} else {
							lotto2 = n;
						} // if
					} else {
						lotto2 = n;
					} // if
				} else {
					lotto2 = n;
				} // if
			} else {
				lotto2 = n;
			} // if
		}else {
			lotto2 = n;
		}
		*/
		
		// 배열 선언
		// Heap                               Stack
		//          2    index
		//          ↓ 
		// [12][11][0][0][0][0]                 [0x100]
		// lotto[0]~ lotto[5]                 lotto
		// 0x100
		int index = 0, n;
		int [] lotto = new int[6];
		lotto[index++] = (int)( Math.random()*45)+1;
		// 1
		while ( index <= 5 ) {
			n =  (int)( Math.random()*45)+1;
			// 중복 O		// 중복 X
			//  그 이전에 발생한 로또 번호와   n 값과 모두 체크해서
			//  중복이 되지 않으면 
			boolean flag = false;
			for (int i = 0; i < index; i++) {
				if( lotto[i] == n ) {
					System.out.println("*");
					flag = true;
					break;
				}
			} // for i	
			// flag == false   !flag
			if( !flag ) lotto[index++] = n;
		} // while
		
		// 11:05  수업시작~

		System.out.println( Arrays.toString(lotto) );
	} // main

} // class

/*
18
32
7
23  중복
23  중복
*/


// ┌ ┐└ ┘ │ ─ ┴ ┬ ┤├ ┼ 
/*
 *         사용자 - 컴퓨터 
 * 컴퓨터↓ 
 * ┌─────┬──────┬──────┬───┐
 * │     │ 가위1 │ 바위2 │보3│  사용자 ←
 * ├─────┼──────┼──────┼───┤
 * │가위1 │ 무0  │  사1 │ 컴2│
 * ├─────┼──────┼──────┼───┤
 * │바위2 │ 컴-1 │ 무0   │사1 │
 * ├─────┼──────┼──────┼───┤
 * │ 보3 │ 사-2  │ 컴-1 │무0 │
 * └─────┴──────┴──────┴───┘ 
 * */ 








