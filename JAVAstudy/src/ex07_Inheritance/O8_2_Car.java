package ex07_Inheritance;

public class O8_2_Car {
	
	//필드
	/*
	O8_1_Tire frontLeftTire = new O8_1_Tire("앞왼쪽", 6);
	O8_1_Tire frontRightTire = new O8_1_Tire("앞오른쪽", 2);
	O8_1_Tire backLeftTire = new O8_1_Tire("뒤왼쪽", 3);
	O8_1_Tire backRightTire = new O8_1_Tire("뒤오른쪽", 4);
	*/
	O8_1_Tire[] tires = {
			new O8_1_Tire("앞왼쪽", 6),
			new O8_1_Tire("앞오른쪽", 2),
			new O8_1_Tire("뒤왼쪽", 3),
			new O8_1_Tire("뒤오른쪽", 4)
	};
	
	
	//메소드
	int run() {
		System.out.println("[자동차가 달립니다.]");
		/*
		if(frontLeftTire.roll() == false) {
			stop();
			return 1;
		}
		if(frontRightTire.roll() == false) {	//.roll()은 O8_1_KumhoTire의 .roll()로 실행
			stop();
			return 2;
		}
		if(backLeftTire.roll() == false) {
			stop();
			return 3;
		}
		if(backRightTire.roll() == false) {
			stop();
			return 4;
		}
		return 0;
		*/
		for(int i=0; i<tires.length; i++) {
			if(tires[i].roll() == false) {
				stop();
				return i+1;
			}
		}
		return 0;
	}
	
	void stop() {
		System.out.println("[차가 멈춥니다.]");
	}
}
