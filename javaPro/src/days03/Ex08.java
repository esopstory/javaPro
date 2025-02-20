package days03;

/**
 * @author kenik
 * @date 2025. 2. 5. - 오후 5:26:40
 * @subject 
 * @content
 */
public class Ex08 {

	public static void main(String[] args) {
		boolean b = true;
		
		// [ 연산자를 사용해서 수식으로 표현하는 연습. ]
		// 1. 정수 x 는 짝수(even number)이다.
		//   2로 나눠떨어지는 정수
		//    x % 2 == 0
		// 2.  홀수 :  x % 2 != 0   x % 2 == 1 
		
		// 3. 정수 x 는 2의 배수(multiple) 또는 3의 배수이다.
		//   ( x % 2 == 0 ) ||    x % 3 == 0
		
		/*
		 4. 정수 x 는 2의 배수이지만 6의 배수는 아니다. 
		 		x % 2 == 0  ||    x %  != 0	
		 					
		 5. 문자 ch는 숫자(0~9)이다.
		 		ch >= 0 && ch < 10
		 		
		 6. 문자 ch는 알파벳 대문자이다. 
		 		ch > 64 && ch < 91
		 		
		 7. 문자 ch는 알파벳 대문자 또는 소문자이다. 
		 		ch > 64 && ch < 91 || ch > 96 && ch < 123
		 		
		 */
		
		char ch = 'C';
		if(ch > 64 && ch < 91 || ch > 96 && ch < 123)
		{
			System.out.println(b);
		}
		else
		{
			System.out.println(!b);
		}
		
		System.out.println((ch > 64 && ch < 91 || ch > 96 && ch < 123) ? b : !b);
	} // main

} // class









