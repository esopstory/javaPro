package days09;

/**
 * @author kenik
 * @date 2025. 2. 13. - 오전 8:47:57
 * @subject 
 * @content
 */
public class Test05 {

	public static void main(String[] args) {
		// term 1+2+4+7+11+16+22+29+37+46+=175
		// inc   1 2 3 4  5  6  7  
		int sum = 0;
		int term = 1;
		int inc = 1;
		int count = 0;
		
		while (++count<=10) {
			System.out.printf("%d+", term);
			sum += term;
			term += inc++;
		} // while
		
		System.out.printf("=%d", sum);

	} // main

} // class
