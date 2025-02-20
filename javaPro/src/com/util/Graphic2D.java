package com.util;

public class Graphic2D {
	
	public static void drawLine() {
		System.out.println("=-------------="); // 50줄 코딩 
	}
	
	public static void drawLine(int length) {
		for (int i = 1; i <= length; i++) {
			System.out.print("=");
		} // for i
		System.out.println(); // 50줄 코딩 
	}
	
	public static void drawLine(int length, String style) {
		for (int i = 1; i <= length; i++) {
			System.out.print( style );
		} // for i
		System.out.println(); // 50줄 코딩 
	}

}
