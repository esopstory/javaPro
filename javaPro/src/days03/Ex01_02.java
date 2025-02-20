package days03;

public class Ex01_02 {
	
	int a = 20; // 지역변수 X , 인스턴스 변수 
	
	public static void main(String[] args) {
		int a = 10;  // 지역변수
		
		{
			// int a = 10;  // 지역변수			
			System.out.println( a );
		} 
		
		// a cannot be resolved to a variable
		System.out.println( a );
		
	} // main

}
