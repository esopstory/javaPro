package days08;

import com.util.MyCalendar;

/**
 * @author kenik
 * @date 2025. 2. 12. - 오후 4:27:44
 * @subject 
 * @content
 */
public class Ex09_02 {
	
	public static void main(String[] args) {
		
		// [문제] 1년 ~ 2025년 까지 총 몇 번의 윤년이 있는지 ?
		int leapYearCount = 0;
		// com.util.MyCalendar.java
		
		// [1]
		/*
		for (int i = 1; i <= 2025; i++) {
			if( MyCalendar.isLeapYear(i) ) leapYearCount++;
		} // for i
		System.out.println(leapYearCount); // 491
		*/
		
		// [2] *** 기억
		leapYearCount = 2025/4 - 2025/100 + 2025/400;
		System.out.println(leapYearCount); // 491 
		
	} // main

} // class









