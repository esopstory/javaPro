package days03;

public class Ex01_04 {

	public static void main(String[] args) {
		// [생각] 소수점 3자리에서 절삭
		double money = 1234569.7089;
		
		String strMoney = String.format("\\%,.2f \n",  money);
		System.out.println( strMoney );
		
		// Invalid escape sequence (valid ones are  \b  \t  \n  \f  \r  \"  \'  \\ )
		System.out.printf( "\\%,.2f \n",  money );
				
				
		
		
		//   '\t'
		//	 '\b'
		//   '\n'
		//   '\"'
		//   '%%'
		System.out.printf("%%n\tame=\b%s\nage=%d\n", "홍길동", 20);

	}

}
