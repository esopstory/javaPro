package days06;

/**
 * @author kenik
 * @date 2025. 2. 10. - 오전 11:10:32
 * @subject 
 * @content
 */
public class Ex03_02 {

	public static void main(String[] args) {
		 
		int sum = 0 , i = 0;
		while ( i++ <= 10 ) { 
			if( i % 2 == 0 )  continue; 			
			System.out.printf("%d+", i);   
			sum += i;  
		} // while
		System.out.printf("\b=%d\n", sum);
		 
		
		/*
	      int sum = 0, i = 0;
	      while (i < 10) {   // 0 < 10
	         if (i++ % 2 != 0) {
	            continue;
	         }
	         System.out.printf("%d+", i);
	         sum += i;
	      } // while
	      System.out.printf("\b=%d\n", sum);
		*/
	} // main

} // class









