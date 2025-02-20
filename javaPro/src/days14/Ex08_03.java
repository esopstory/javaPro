package days14;

/**
 * @author kenik
 * @date 2025. 2. 20. - 오후 3:49:58
 * @subject 
 * @content
 */
public class Ex08_03 {

	public static void main(String[] args) {
		// [배열 초기화]
		/*
		int [] m = new int[3];
		m[0] = 1;
		m[1] = 2;
		m[2] = 3;		
		// int [] m = new int[] {1,2,3};		
		int [] m = {
				      1,
				      2,
				      3
				    };
		*/
		
		// [ 클래스 배열 초기화 ]
		/*
		Person [] pArr = new Person[3]; 
		pArr[0] = new Person();
		pArr[1] = new Person();
		pArr[2] = new Person();
		
		
		Person [] pArr = new Person[] {
				new Person(), 
				new Person(), 
				new Person()
		};
		*/
		
		Person [] pArr =   {
									new Person(), 
									new Person(), 
									new Person()
							};

	} // main

} // class

/*
		Person p = null;
		p.name ="홍길동";
		
		// 인스턴스 생성X
		// [X][]                        []p
 */
