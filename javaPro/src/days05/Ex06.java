package days05;

public class Ex06 {
	public static void main(String[] args) {
		int i = 0, sum = 0;
		
		while (10 > i++) {
			System.out.printf("%d+", i);
			sum += i;
			
		}
		System.out.printf("\b= %d", sum);
	} // main

}
