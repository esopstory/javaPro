package days07;

public class Ex_03 {
	public static void main(String[] args) {
		String data = "홍길동 , 장군미 ,강아지 ,버들";
		String regex = "\\s*,\\s*";
		System.out.println(data.split(",")[0]);
		String[] names = data.split(regex);
		
		for (String name : names) {
//			System.out.printf("[%s]\n", name.trim());
			System.out.printf("[%s]\n", name);
			
		} // foreach
		
	} // main
}
