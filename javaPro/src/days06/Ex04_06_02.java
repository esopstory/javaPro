package days06;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author kenik
 * @date 2025. 2. 10. - 오후 2:13:16
 * @subject 
 * @content
 */
public class Ex04_06_02 {

	public static void main(String[] args) {
		// 람다식과 스트림(Stream)
		int [] m = {10, 31, 98, 38, 68, 91, 95, 76, 27, 29};
		
		// int[] -> int스트림 변환
		OptionalInt max = IntStream.of(m).max();
		
		// getAsInt() : OptionalInt -> int
		if (max.isPresent()) {
			System.out.println(max.getAsInt());			
		} // if
		
		// [2]
		// max = new Random().ints(0, 101).limit(10).max();
		 
	} // main

} // class




