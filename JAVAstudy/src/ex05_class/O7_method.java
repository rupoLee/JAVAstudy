package ex05_class;

public class O7_method {

	public static void main(String[] args) {
		
		O7_1_Calculator myCalc = new O7_1_Calculator();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1: " + result1);
		
		byte x = 10;
		byte y = 4;
		//byte는 int로 자동 타입 변환이 됨
		double result2 = myCalc.divide(x, y);
		System.out.println("result2: " + result2);
		
		myCalc.powerOff();
		
		System.out.println("---------------------------");
		
		//매개 변수의 수를 모를 경우
		O7_2_Comouter myCom = new O7_2_Comouter();
		
		int[] values1 = {1, 2, 3};
		int result01 = myCom.sum1(values1);
		System.out.println("result01: " + result01);
		
		int result02 = myCom.sum1(new int[] {1, 2, 3, 4, 5});
		System.out.println("result02: " + result02);
		
		int result03 = myCom.sum2(1, 2, 3);
		System.out.println("result03: " + result03);
		
		int result04 = myCom.sum2(1, 2, 3, 4, 5);
		System.out.println("result04: " + result04);

		
		System.out.println("---------------------------");
		
		//return문
		O7_3_Car myCar = new O7_3_Car();
		myCar.setGas(5);
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입해주세요.");
		}

		
		System.out.println("---------------------------");
		
		//클래스 내부에서 메소드 호출 작업을 위한 실행
		O7_1_Calculator calc = new O7_1_Calculator();
		calc.excute();

		System.out.println("---------------------------");
		
		//클래스 외부에서 메소드 호출
		O7_3_Car car = new O7_3_Car();
		car.keyTurnOn();
		car.carRun();
		int speed = car.getSpeed();
		System.out.println("현재속도 : " + speed + "km/h");

		System.out.println("---------------------------");
		
		//메소드 오버로딩
		O7_1_Calculator cal = new O7_1_Calculator();
		
		//정사각형 넓이 구하기
		double result11 = cal.areaRectangle(10);
		
		//직사각형 넓이 구하기
		double result22 = cal.areaRectangle(10, 20);

		//결과
		System.out.println("정사각형 넓이= " + result11);
		System.out.println("직사각형 넓이= " + result22);
		
		System.out.println("---------------------------");
		
		//인스턴스 멤버와 this
		O7_4_Car mycar = new O7_4_Car("포르쉐");
		O7_4_Car yourcar = new O7_4_Car("벤츠");
		
		mycar.run3();
		yourcar.run3();
	}
}
