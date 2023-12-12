package ex07_Inheritance;

public class O3_2_Computer extends O3_1_Calculator {
	
	@Override	//메소드 재정의(오버라이딩)
	double areaCircle(double r) {
		System.out.println("O3_2_Computer 객체의 areaCircle() 실행");
		
		return Math.PI * r * r;
	}
}
