package days03;

public class Ex01_03 {

	public static void main(String[] args) {
		/*
		int a = 10;
		int b = 10;
		int c = 10;
		int d = 10;
		
		// int a = 10, b = 10, c = 10, d = 10;
		// Duplicate local variable a
		int a, b, c, d;
		// <---------------
		// 모든 변수 10으로 초기화 의미..
		a = b = c = d = 10;
		*/
		
		/*
		 ㄱ. 3 + 5 + 0      
		 ㄴ. 3 + 5 + "0"  
		 ㄴ. 3 + 5 + '0' 
		*/
		// +  처리방향  ------------------->
		// System.out.println( 3 + 5 + 0 );  // 8
		// System.out.println( 3 + 5 + "0" );   // "80"
		
		//                          정수계열
		//                    8     48
		System.out.println( 3 + 5 + '0' );   // 56
		
		 
		// ">이름:"홍길동", 나이:20, 학점:'A', 성별:true"
		String name = "홍길동";
		byte   age = 20;
		char   grade = 'A';
		boolean gender = true;
		
		String result = String.format(">이름:\"%s\", 나이:%d, 학점:'%c', 성별:%b\n"
				, name, age, grade, gender);
		System.out.println( result );
		
		/*
		System.out.printf(">이름:\"%s\", 나이:%d, 학점:'%c', 성별:%b\n"
				, name, age, grade, gender);
		*/ 	

	}

}
