package days08;

/**
 * @author kenik
 * @date 2025. 2. 12. - 오전 11:07:46
 * @subject 
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		// [정보처리 기사 실기] 피보나치 수열
		//       10항의 합
		// 1+1+2+3+5+8+13+...=???		
		// 11:03 수업 시작~
		// [2]
		int firstTerm = 1, secondTerm = 1, thirdTerm;
		int sum = firstTerm + secondTerm; // 2
		System.out.printf("%d+%d+", firstTerm, secondTerm);
		int termLength = 2;
		
		while (  termLength < 10 ) {
			thirdTerm = firstTerm + secondTerm;			
			System.out.printf("%d+", thirdTerm);
			sum += thirdTerm;
			
			firstTerm = secondTerm; 
			secondTerm = thirdTerm;			
			termLength++;
			
		} // while
		
		System.out.printf("=%d", sum);
		
		
		// [1] 1+1+2+3+5+8+13+21+34+55+=143
		/*
		int[] m = new int[10];
		m[0] = m[1] = 1;
		int sum = 2;
		System.out.printf("%d+%d+", m[0], m[1]);  // 1+1+		
		for (int i = 2; i < m.length; i++) {
			m[i] = m[i - 2] + m[i - 1]  ;
			sum += m[i];
			System.out.printf("%d+", m[i]);
		} // for
		System.out.printf("\b=%d", sum);
		*/

	} // main

}
