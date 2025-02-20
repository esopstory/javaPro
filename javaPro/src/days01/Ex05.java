package days01;

// The type days14.Person [is not visible] 접근지정자의 접근 범위.
import days14.Person;
import days14.Time;

public class Ex05 {

	public static void main(String[] args) {
		// [ 패키지 외부에서 클래스의 접근지정자 테스트]
		// days14.Person
		// days01.Ex05  클래스 안에서 사용(참조, 상속) 가능 테스트
		// Person p1 = new Person();
		
		
		// [패키지 외부에서 멤버의 접근지정자 테스트]
		// days14.Time.java
		// day01.Ex05.java  상속관계X
		Time t = new Time();
		// t.hour

	} // main

} // class
