package ex07_Inheritance;

public class O9_Driver {	//O9_Vehicle 이용 클래스
	
	public void driver(O9_Vehicle vehicle) {	//O9_Vehicle > O9_Bus로 받아 옴
		vehicle.run();	//O9_Bus.run(); 실행됨
	}
}
