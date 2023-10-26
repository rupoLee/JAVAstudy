package ex05_class;

public class O7_4_Car {
	//인스턴스 멤버와 this
	
	//필드
	int speed;
	String model;
	
	
	//생성자
	O7_4_Car(String model){
		this.model = model;
	}
	
	//메소드 void나 return타입이 없는 메소드는 인스턴스 멤버
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run3() {
		for(int i=10; i<=50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model + "가 달립니다.(시속 : " + this.speed + "km/h)");
		}
	}

}
