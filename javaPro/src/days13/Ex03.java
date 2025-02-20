package days13;

/**
 * @author kenik
 * @date 2025. 2. 19. - 오전 11:12:44
 * @subject    가변 배열 
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		// 3반 30명 학생 성적 처리
		// 1반 25명, 2반 28명, 3반 20명
		// int [][] m = new int[3][30];
		int [][] m = new int[3][];
		m[0] = new int[25];
		m[1] = new int[28];
		m[2] = new int[20];
		
		dispM(m);

	} // main
	
	private static void dispM(int[][] m) {
		for (int i = 0; i < m.length; i++) { // 행 크기  m.length
			for (int j = 0; j < m[i].length; j++) { // 열 크기 m[i].length
				System.out.printf("m[%d][%d]=%d ", i, j, m[i][j]);
			} // for j
			System.out.println(); // 개행
		} // for i
		
	}

} // class
















