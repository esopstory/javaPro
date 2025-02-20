package days09;

/**
 * @author kenik
 * @date 2025. 2. 13. - 오전 7:04:09
 * @subject 
 * @content
 */
public class Test06 {
	
	public static void main(String[] args) {
		// 자연수 = 소수 + 합성수
		for (int i = 1; i <=50; i++) {
			if(isPrimeNumber(i)) System.out.println(i);
		} // for i
		
	} // main
	
	public static boolean isPrimeNumber(int number) {
		if (number <= 1) { 			// 1은 소수 X. 음수 소수 X
			return false;
		}else if ( number == 2) {	// 2는 소수 O
			return true;
		}else if ( number % 2 == 0) { // 2를 제외한 짝수는 소수 X
			return false;
		}else {
			//           3    9<=   11
			//           5   25<=   11
			//           9   81<=   11
			// [2]
			// https://ko.wikipedia.org/wiki/%EC%86%8C%EC%88%98_(%EC%88%98%EB%A1%A0)
			// 이유 ? 수가 수를 나누기 위해서는 그 몫이 항상 필요하며 
			//      나누는 수와 몫 중 어느 하나는 반드시 루트n 이하이기 때문이다. 
			for (int i = 3; i <= Math.sqrt(number) ; i+=2) {
				if (number % i == 0) {
					return false;
				} // if
			} // for i
			
			/* [1]
			for (int i = 3; i < number; i+=2) {
				if (number % i == 0) {
					return false;
				} // if
			} // for i
			*/
		} // if
		return true;
	}

}


/*
현재까지 알려진 가장 간단한 방법으로 "에라토스테네스의 체"가 있다. 방법은 다음과 같다.

찾고자 하는 범위의 자연수를 나열한다.
1은 지운다.
2부터 시작하여, 2의 배수를 지워나간다.
다음 소수의 배수를 모두 지운다.
이를 반복하여 마지막까지 지우면, 남는 수들이 소수가 된다. 이 과정은 사실 어떤 자연수 
n
{\displaystyle n}이 소수임을 판정하기 위해서 
⌊
n
⌋
{\displaystyle \lfloor {\sqrt {n}}\rfloor }까지만 진행하면 되는데[1], 수가 수를 나누기 위해서는 그 몫이 항상 필요하며 나누는 수와 몫 중 어느 하나는 반드시 
n
{\displaystyle {\sqrt {n}}} 이하이기 때문이다. 아래 표로 이 방법을 활용하면 다음과 같이 된다.(4, 6, 8, 10은 제외(무조건 합성수기에[2])) * 
 * */
