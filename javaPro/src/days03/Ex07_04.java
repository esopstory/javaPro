package days03;

/**
 * @author kenik
 * @date 2025. 2. 5. - 오후 4:06:21
 * @subject 논리연산자 
 * @content
 */
public class Ex07_04 {

	public static void main(String[] args) {
		/*
		 * 1. 일반 논리 연산자
		 *   1) !   부정연산자 또는 Not 연산자
		 *   2) &&  일반 논리 AND 연산자 ( 논리곱 )
		 *      true  &&  true   => true
		 *      false &&  true   => false
		 *      true  &&  false  => false
		 *      false &&  false  => false
		 *      
		 *   3) ||  일반 논리 OR 연산자 ( 논리합 )
		 *      true  ||  true   => true
		 *      false ||  true   => true
		 *      true  ||  false  => true
		 *      false ||  false  => false
		 *   
		 *   연산자 우선 순위  : !  >   &&   >    ||   
		 *   
		 * 2. 비트 논리 연산자
		 *   1) ~  비트 부정 연산자 또는 틸트 연산자
		 *   2) &  비트 논리 AND연산자
		 *   3) |  비트 논리 OR 연산자
		 *   4) ^  e[X]clusive   OR 연산자,   XOR 연산자
		 *         베타적인
		 *   
		 *         논리연산자의 우선 순위만큼은 기억(암기)
		 *   ~ !   >        &       >    ^   >     |      >  &&   >  ||
		 * */
		
		System.out.println( 10 & 3 );  // 2
		//    0000 1010
		//  & 0000 0011
		//    0000 0010
		
		System.out.println( 10 | 3 );  // 9
		//    0000 1010
		//  | 0000 0011	
		//    0000 1001
		
		System.out.println( 10 ^ 3 );  // 11
		//    0000 1010
		//  ^ 0000 0011
		
//		System.out.println( 10 );  // 10
//		System.out.println( ~10 ); // -11        1111 0101
		
		//                  ~0000 1010
		//                   1111 0101
		//                   1111 0100
		//                   0000 1011
		//                        8+0+2+1
		//                        -11
		
		
		/*
		// 연산자 우선 순위 파악        [!]        >
		// The operator ! is undefined for the argument type(s) int
		// System.out.println(  !5 > 3  );  // false
		System.out.println(  !true  );  // false
		System.out.println(  !false  ); // true
		
		System.out.println(  3>5 && 5<7    ); // true
		//                   false &&
		//                   효율적 연산( short circuit evaluation ) 
		System.out.println(  13>5 || 5<7    ); // true
		*/
	}

}
