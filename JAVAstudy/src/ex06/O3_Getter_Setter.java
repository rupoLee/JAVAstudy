package ex06;

import ex06_2.*;

public class O3_Getter_Setter {

	public static void main(String[] args) {
		O3_car myCar = new O3_car();
		
		//잘못된 속도 변경
		myCar.setSpeed(-50);
		
		System.out.println("현재속도: " + myCar.getSpeed());
		
		//올바른 속도 변경
		myCar.setSpeed(60);
		
		//멈춤
		if(!myCar.isStop()) { //!false
			myCar.setStop(true);
		}
		
		System.out.println("현재속도: " + myCar.getSpeed());
	}

}
