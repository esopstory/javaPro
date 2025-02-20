package days10;

/**
 * @author kenik
 * @date 2025. 2. 14. - 오전 10:31:53
 * @subject 
 * @content
 */
public class Ex02_02 {

	public static void main(String[] args) {
		
		int money = 125760;
		int unit = 50000;
		boolean sw = false;
		int num = 0;
		
		while (unit >= 1) {
			num = money / unit;
			System.out.printf("%d원 : %d 개\n", unit, num);
			money %= unit;
			unit /= ( sw  ?  2 : 5 );
			sw = !sw;
		} // while 
		 

	} // main

} // class


/*
5만원 : 2 개
1만원 : 2 개
5천원 : 1 개
1천원 : 0 개
5백원 : 1 개
1백원 : 2 개
5십원 : 1 개
1십원 : 1 개
5원 : 0 개
1원 : 0 개
*/











