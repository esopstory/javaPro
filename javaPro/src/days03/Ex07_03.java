package days03;

/**
 * @author kenik
 * @date 2025. 2. 5. - 오후 3:44:07
 * @subject 비교연산자 : 크고 작음, 같고 다름을 비교
 * @content  ㄴ 결과값  boolean (true/false)
 */
public class Ex07_03 {

	public static void main(String[] args) {
		int i = 10, j = 3;
		
		System.out.println(  i > j ); // true
		System.out.println(  i < j ); // false
		System.out.println(  i >= j ); // true
		System.out.println(  i <= j ); // false
		
		// i  j  같다
		// System.out.println(  i = j ); //  3
		System.out.println(  i == j ); // false
		System.out.println(  i != j ); // false
		
		// The operator ! is undefined for the argument type(s) int
		// System.out.println(  i = !j ); // false

	} // main

} // class
