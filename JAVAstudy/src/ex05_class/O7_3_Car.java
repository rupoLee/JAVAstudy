package ex05_class;

public class O7_3_Car {
	//필드
	int gas;
	int speed;
	
	//메소드
	void setGas(int gas) {
		this.gas = gas;
		//필드값 변경
	}
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다.(gas잔량: "+ gas +")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다.(gas잔량: "+ gas +")");
				return; //메소드 강제 종료, while문 뒤에 실행문이 있으면 break문 사용
			}
		}
	}
	
	int getSpeed() {
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("키를 돌립니다.");
	}
	
	void carRun() {
		for(int i=10; i<=50; i+=10) {
			speed = i;
			System.out.println("달립니다.(시속 : " + speed + "km/h)");
		}
	}
	
}
