package days14;

public class Ex06 {
	public static void main(String[] args) {
		Tv t1 = new Tv();
		
		t1.power();
		t1.channelUp();
		System.out.println(t1.channel);
		t1.power();
		System.out.println("End");
	} // main
}

//The public type Tv must be defined in its own file
class Tv
{
	public String color;
	boolean power = false;
	public int channel = 11;
	
	public void power()
	{
		power = !power;
	}
	
	public void channelUp()
	{
		channel++;
	}
	
	public void channelDown()
	{
		channel--;
	}
}
