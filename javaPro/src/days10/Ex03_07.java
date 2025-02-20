package days10;

public class Ex03_07 {

	public static void main(String[] args) {
		// [마름모]
		// __*
		// _***
		// *****
		// _***
		// __*
		// [2]
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {				
				System.out.print( i+j>=4 && j-i<=2  ?"*":" ");
			} // for j
			System.out.println();
		} // for i 
		
		/* [1]
		for (int i = 1; i <= 5; i++) {
			// 공백 for
			for (int j = 1; j <= (i<=3?3-i:i-3); j++) {
				System.out.print("_");
			} // for j			
			// 별  for		
			for (int j = 1; j <= (i<=3?2*i-1:5-2*(i-3)); j++) {
				System.out.print("*");
			} // for j
			
			System.out.println(); // 개행
		} // for i
		*/

	}

}
