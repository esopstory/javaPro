package days14;

/**
 * @author kenik
 * @date 2025. 2. 20. - 오후 12:34:19
 * @subject 
 * @content
 */
public class Ex03_02 {

	public static void main(String[] args) {

		//Car car = null;
		//car = new Car();
		//
		//		
		//dispCar(car);
		dispCar( new Car() );
		//
		//

	} // main
	
	// 전달되는 객체명과 매개변수명은 꼭 동일해야 하나요?
	// Car car = new Car();
	public static void dispCar( Car car ) {
		//
		//
		//
		car.dispCarInfo();
		//
		//
	}

} // class
