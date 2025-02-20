package days08;

import java.util.Arrays;
import java.util.Random;

/**
 * @author kenik
 * @date 2025. 2. 12. - 오후 3:37:26
 * @subject   
 * @content
 */
public class Ex08 {

	public static void main(String[] args) { 
		// [람다식과 스트림]
		new Random().ints(1, 46).distinct().limit(6)
		  .sorted().mapToObj(i -> i+",").forEach(System.out::print);
		
		// -> 화살표(람다)연산자
		// i -> i+","  람다식

	} // main
 
} // class










