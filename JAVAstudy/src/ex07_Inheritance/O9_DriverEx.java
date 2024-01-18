package ex07_Inheritance;

public class O9_DriverEx {
	public static void main(String[] args) {

		O9_Driver driver = new O9_Driver();
		
		O9_Bus bus = new O9_Bus();
		O9_Taxi taxi = new O9_Taxi();
		
		driver.driver(bus);	//O9_Vehicle vehicle = bus;
		driver.driver(taxi);
	}

}

/*
매개값 자동 타입변환, 메소드 오버라이딩으로 매개변수의 다향성 구현
*/