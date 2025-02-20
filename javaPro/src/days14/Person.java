package days14;

// default(package) 패키지 내부에서만 사용(상,참) 가능하다. 
// class Person {

// public           패키지 내부/외부 어디서든 사용(참,상) 가능하다.
public class Person {
	
	// 필드
	public String name;
	public int age;
	
	// public int [] mArr = null;
	public int [] mArr = new int[10];
	
	// 메서드
	public void work() {
		System.out.println( name + "이/가 일한다.");
	}
	public void run() {
		System.out.println( name + "이/가 달린다.");
	}

}
