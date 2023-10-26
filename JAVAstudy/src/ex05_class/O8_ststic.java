package ex05_class;

public class O8_ststic {
	
	int speed;
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	public static void main(String[] args) {
		/*
		 * static은 클래스에 고정된 멤버 > 클래스 멤버라고도 함
		 * 
		 * 정적 필드, 메소드는 원칙적으로 클래스 이름으로 접급
		 * 객체 참조로도 접근 가능
		 * */
		O8_1_Calculator c = new O8_1_Calculator();
		double result1 = 10 * 10 * O8_1_Calculator.pi;
		int resulr2 = c.plus(10, 5); //참조로 접근해 수정하라 뜸
		int resulr3 = O8_1_Calculator.minus(10, 5);
		
		System.out.println("result1 : " + result1);
		System.out.println("resulr2 : " + resulr2);
		System.out.println("resulr3 : " + resulr3);
		
		System.out.println("-----------------------");
		
		System.out.println(O8_2_Television.info);
		
		System.out.println("-----------------------");
		
		O8_ststic st = new O8_ststic();
		st.speed = 60;
		st.run();
	}
}
