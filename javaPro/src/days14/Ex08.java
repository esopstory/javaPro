package days14;

import java.util.Iterator;

public class Ex08 {
	public static void main(String[] args) {

		Person[] pArr = new Person[5];
		
		for (int i = 0; i < pArr.length; i++) {
			pArr[i] = new Person();
		} // for i
		
		pArr[0].name = "p1";
		pArr[1].name = "p2";
		pArr[2].name = "p3";
		pArr[3].name = "p4";
		pArr[4].name = "p4";
		
		for (int i = 0; i < pArr.length; i++) {
			pArr[i].work();
		} // for i
	} // main
}
