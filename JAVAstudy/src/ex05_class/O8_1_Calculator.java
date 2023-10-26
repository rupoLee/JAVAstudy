package ex05_class;

public class O8_1_Calculator {
	/*
	 * 정적 필드를 선언할 경우
	 * 
	 * 공용적인 데이터 > 변하지 않는 데이터
	 * */
	static double pi = 3.14159;
	
	
	/*
	 * 정적 메소드를 선언할 경우
	 * 
	 * 정적 필드를 사용
	 * 인스턴스 필드가 아닌 외부의 매개값을 사용
	 */
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}
}
