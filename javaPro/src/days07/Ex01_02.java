package days07;

/**
 * @author kenik
 * @date 2025. 2. 11. - 오전 10:41:33
 * @subject 
 * @content
 */
public class Ex01_02 {

	public static void main(String[] args) {
		// 44032(가)
		System.out.printf("%d(%c)\n", (int)'가' , '가' );
		// 55203(힣)
		System.out.printf("%d(%c)\n", (int)'힣' , '힣' );

		for (int i = '가'; i <='힣'; i++) {
			System.out.printf("%d(%c)\n", i ,  i );
		} // for i
		
	}

}
