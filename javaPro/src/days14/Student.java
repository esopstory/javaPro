package days14;

public class Student {
	
	// 필드
	public int no;
	public String name;
	public int kor, eng, mat, tot, rank;
	public double avg;
	
	// 메소드
	public String getInfo() {
		return String.format("[%d]\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n"
				, no
				, name 
				, kor , eng , mat, tot 
				, avg , rank);
	}

}
