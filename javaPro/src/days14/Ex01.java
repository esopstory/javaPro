package days14;

/**
 * @author kenik
 * @date 2025. 2. 20. - 오전 7:46:45
 * @subject 
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {

		int [][] m = new int[5][5];		
		// 골뱅이
		whelk(m);
		// 마방진		
		dispM(m);

	} // main

	private static void whelk(int[][] m) {
		int n = 5; // 수행 횟수
		int row = 0, col = -1; // 행, 열 인덱스 
		int v = 1; 
		int sw = 1;

		while(true) {
			// 행 고정     열증가 +1/열감소 -1  for문  (수행횟수)
			for (int i = 0; i < n; i++) {
				col+= sw; // -1
				System.out.printf("가로 %d,%d\n", row,col );
				m[row][col] = v++;
			} // for i	 
			n--; // 수행횟수 1감소
			if( n == 0 ) break;
			// if( v == 26 ) break;
			// 열 고정   행증가 / 행감소  for문
			for (int i = 0; i < n; i++) {
				row+=sw; // row--;
				System.out.printf("세로 %d,%d\n", row,col );
				m[row][col] = v++;
			} // for i

			sw = -sw;
			
		} // while

	}

	private static void dispM(int[][] m) {
		System.out.println("     0열 1열 2열 3열 4열");	    
		for (int i = 0; i < m.length; i++) {           // 행크기
			System.out.printf("%d행 " , i);
			for (int j = 0; j < m[i].length; j++) {    // 열크기
				System.out.printf("[%2d]", m[i][j]);
			} // for j
			System.out.println(); // 개행
		} // for i
	}

} // class











/* [김예지]
 public static void main(String[] args) {
      int[][] m = new int[5][5];
      boolean sw1, sw2;
      sw1 = sw2 = false;
      int num, row, col, limit, count, round;
      num = 1;
      row = col = count = round = 0;
      limit = m.length; // 5

      while (num<=25) {
         // 숫자 대입
         m[row][col] = num++;
         count++;

         // 행/열 스위치
         if (count == limit) {
            sw1 = !sw1;
            count = 0;
            round++; // 몇회전
            if (round % 2 == 1) {
               sw2 = !sw2;
               limit--;
            }
         }

         // 행/열 증가/감소
         if (!sw1) {
            col += (!sw2) ? 1 : -1;
         }
         else {
            row += (sw2) ? 1 : -1;
         }
      }

      dispM(m); 

   } // main

 * */

