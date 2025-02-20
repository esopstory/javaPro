package javaPro;

public class Test250213 {
	public static void main(String[] args) {
		displaySimiPibo(10);
		displayPrimeNumber(100);
	} // main

//	1. 년도를 매개변수로 받아서 윤년, 평년을 boolean 형으로 반환하는 메서드만 선언하세요
//	 (  치윤법 사용 ) 
	private static boolean isLeapYear(int iYear) {
		boolean bLeapYear = false;

		if (iYear % 4 == 0 && iYear % 100 != 0 || iYear == 400)
			bLeapYear = true;

		return bLeapYear;
	}

//	2. 1 ~ n 까지의 합을 구해서 반환하는   [재귀함수]를 선언하세요.
	private static int sumRecu(int iNum) {
		if (iNum == 1)
			return 1;
		else
			return iNum + sumRecu(iNum - 1);
	}

//	4. 오버로딩( Overloading) 에 대해서 설명하세요 . 
//	함수의 파라메터 객수가 다르거나 파라메터의 Data Type 이 다른 동일 명의 함수를 선언하는
//	반환값은 달라도 해당되지 않음

//	5. ┌      10개 항의 합     ┐을 아래와 같이 출력하는 코딩을 하세요.    
//	   1+2+4+7+11+16+22+29+...=???     
	private static void displaySimiPibo(int iCount) {
		int iTerm = 1, iSum = 0;

		for (int i = 1; i <= iCount; i++) {
			iSum += iTerm;
			System.out.printf("%d+", iTerm);
			iTerm += i;
		}
		System.out.printf("\b=%d\n", iSum);
	}

//	6. 1~100 까지의 소수의 합
//	   2+3+5+7+...97=???   
	private static void displayPrimeNumber(int iLastNum) {
		int i = 0, iSum = 0;

		for (i = 2; i <= iLastNum; i++) {
			if (isPrimeNumber(i)) {
				System.out.printf("%d+", i);
				iSum += i;
			}
		}
		System.out.printf("=%d\n", iSum);
	}

	private static boolean isPrimeNumber(int iNum) {
		for(int i = 2; i < iNum; i++) {
			if(iNum % i == 0)
				return false;
		}
		
		return true;
	}
}
