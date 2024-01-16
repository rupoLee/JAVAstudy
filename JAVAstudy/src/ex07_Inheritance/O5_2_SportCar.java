package ex07_Inheritance;

public class O5_2_SportCar extends O5_1_Car {
	
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	//오버라이딩 할 수 없음
	@Override
	public void stop() {
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}
}
