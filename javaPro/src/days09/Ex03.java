package days09;

import java.util.Random;

import days08.Ex07;

/**
 * @author kenik
 * @date 2025. 2. 13. - 오전 11:19:39
 * @subject 
 * @content
 */
public class Ex03 {
	
	public static void main(String[] args) {
		
		//              0    1   2    3 
		String card ="7655-8988-9234-5677";
		
		// String.split() 메서드 기억
		String [] cardArr = card.split("-");
		
		// days08.Ex07.java
		// int index = Ex07.getRandomInteger(0, 3);
		// 1) Math.random() 메서드 사용
		// 2) Random 클래스 사용  ***
		Random rnd = new Random();
		// rnd.nextBoolean();
		// int rnd.nextInt();
		// double rnd.nextDouble();
		int index = rnd.nextInt(4);  // 0<=  int   <bound		
		//int index = new Random().nextInt(4);		
		cardArr[index] = "****";
		
		// 각각의 cardArr 배열의 요소들을  - 으로 연결해서 출력.
		/*
		System.out.printf( "%s-%s-%s-%s"
				, cardArr[0],cardArr[1], cardArr[2], cardArr[3]); 
		*/
		
		// String.join() 메서드 ( 자주 사용한다. )
	    String result = String.join("-", cardArr);
	    System.out.println( result );
		
		/*  결재할 때 마다 영수증보면 임의의 숫자 4개가 ****로  출력.
			"7655-****-9234-5677"
			"7655-8988-9234-****"
			"****-8988-9234-5677"
			"7655-8988-****-5677"
		 * */
	} // main

} // class








