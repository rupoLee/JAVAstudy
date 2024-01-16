package ex07_Inheritance;

public class O8_CarEx {
	public static void main(String[] args) {
		O8_2_Car car = new O8_2_Car();
		
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();
			
			/*
			switch(problemLocation){
			case 1 :
				System.out.println("앞왼쪽 HankookTire로 교체");
				car.frontLeftTire = new O8_1_HankookTire("앞왼쪽", 15);
				break;
			case 2 :
				System.out.println("앞오른쪽 KumhoTire로 교체");
				car.frontRightTire = new O8_1_KumhoTire("앞오른쪽", 13);	//재정의(오버라이딩)되어 roll() 실행
				break;
			case 3 :
				System.out.println("뒤왼쪽 HankookTire로 교체");
				car.backLeftTire = new O8_1_HankookTire("뒤왼쪽", 14);
				break;
			case 4 :
				System.out.println("뒤오른쪽 KumhoTire로 교체");
				car.backRightTire = new O8_1_KumhoTire("뒤오른쪽", 17);
				break;
			}
			*/
			
			if(problemLocation != 0) {
				System.out.println(car.tires[problemLocation-1].location + "HankookTire로 교체");
				car.tires[problemLocation-1] = new O8_1_HankookTire(car.tires[problemLocation-1].location, 15);
				//HankookTire로만 대입함
			}
			
			System.out.println("---------------------------------------");
		}
	}

}
