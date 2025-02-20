package days09;

/**
 * @author kenik
 * @date 2025. 2. 13. - 오전 9:13:07
 * @subject 
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		//  소주( prime number ) : 1보다 큰 자연수 중 1과 자기 자신만을
		//                        약수로 가지는 수.
		// 10:04 수업 시작~
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if( isPrimeNumber(i) ){
				System.out.printf("%d+", i);
				sum += i;
			} // if
		} // for i
		System.out.printf("=%d", sum);

	} // main
	
	public static boolean isPrimeNumber( int n ) {
		// 짝수는 2 제외하고 모두 소수 X
		if ( n == 1) {
			return false;
		}else if ( n== 2) {
			return true;
		}else if (  n % 2 == 0 ) {
			return false;
		}else {
			// for (int i = 3; i < n; i++) {
			for (int i = 3; i <= Math.sqrt(n) ; i+=2) {
				if( n % i == 0 ) return false;
			} // for i			
		} // if
		return true;
	}

} // class






