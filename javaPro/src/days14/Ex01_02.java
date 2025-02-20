package days14;

/**
 * @author kenik
 * @date 2025. 2. 20. - 오전 7:46:45
 * @subject 
 * @content
 */
public class Ex01_02 {

	public static void main(String[] args) throws InterruptedException {

		int [][] m = new int[5][5];	
		// 마방진		
		magicSquare(m);
		dispM(m);

	} // main

	private static void magicSquare(int[][] m) throws InterruptedException {
		
		// 1 숫자의 위치
		int v = 1;
		int row, col;
		int nextRow, nextCol;
		row = 0; // 첫 번째 행
		col = m[0].length/2; // 가운 데 열
		m[row][col] = v++;	
		
		
		while (v<=m.length*m[0].length) {
			
			Thread.sleep(1000); // 1초 현재 스레드(일꾼) 일시 정지
			dispM(m);
			
			// 1. 열 증가 , 행 감소
			nextCol = col + 1;
			nextRow = row - 1;
			// 2. 행 벗어난 경우  row=0   감소  row=-1
			if( nextRow == -1 ) nextRow = m.length-1; // 4
			// 3. 열 벗어난 경우
			if( nextCol == m[0].length	) nextCol = 0; 
			// 4. 그 다음 위치에 값이 있는 경우
			if( m[nextRow][nextCol] != 0) {
				nextRow = row + 1;
				nextCol = col;
			}
			
			row = nextRow;
			col = nextCol;
			
			m[row][col] = v++;	
			
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

