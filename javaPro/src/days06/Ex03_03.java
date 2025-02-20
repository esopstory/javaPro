package days06;

public class Ex03_03 {
	
	public static void main(String[] args) {
		// 1~10 홀수의 합
		/*
		int sum = 0;
		for (int i = 1; i <= 10 ; i+=2) {
			// if( i % 2 != 0)   break;
			System.out.printf("%d+", i);
			sum += i;
		} // for i
		System.out.printf("\b=%d\n", sum);
		*/
		
		int sum = 0 , i = 1;
		while ( i<= 10 ) {
			System.out.printf("%d+", i);  // 1+
			sum += i; // 1
			i+=2;      // 2
		} // while
		System.out.printf("\b=%d\n", sum);
	} // main

}
