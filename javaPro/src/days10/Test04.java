package days10;

import java.util.Random;

public class Test04 {

	public static void main(String[] args) {
		
		String card ="7655-8988-9234-5677";
		
		// 0~3 무작위 2개 발생
		int [] indexArr = new Random().ints(0, 4).distinct().limit(2).toArray();
		String [] cardArr = card.split("-");
		cardArr[indexArr[0]] = "****";
		cardArr[indexArr[1]] = "****";
		
		String result = String.join("-", cardArr);
		System.out.println(result);
		
		

	} // main

} // class
