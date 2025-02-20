package days10;

public class Test02 {

	public static void main(String[] args) {
		int n = 10;
		
		String binary = binaryConvert(n);
		
		System.out.println( binary );

	}

	private static String binaryConvert(int n) {
		int share, remainder; // the rest
		String binary = "";
		while (n != 0) {
			share = n/2;
			remainder = n%2;
			System.out.println( remainder );
			binary = remainder + binary;
			n = share;
		} // while
		
		return String.format( "%s%s", "0".repeat(8-binary.length()),  binary );
		
		// [ 고려사항  -10 일 경우 ]
		// 절대치
		// 2진수
		// 1의 보수
		// +1
		
		// -128 ~ 127
		// String regex = "^(-?([1-9]?[0-9]|1[01][0-9]|12[0-7]))$";
	}

}
