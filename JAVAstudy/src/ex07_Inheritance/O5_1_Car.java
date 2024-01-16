package ex07_Inheritance;

public class O5_1_Car /* extends O5_0_final */ {	//final클래스는 상속할 수 없음
	
	public int speed;
	
	//메소드
	public void speedUp() {
		speed += 1;
	}
	
	//final 메소드
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}
}
