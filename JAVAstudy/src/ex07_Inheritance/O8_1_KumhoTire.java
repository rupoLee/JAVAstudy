package ex07_Inheritance;

public class O8_1_KumhoTire extends O8_1_Tire {

	//생성자
	public O8_1_KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	//메소드
	@Override
	public boolean roll() {
		++accumulatedPotation;
		if(accumulatedPotation < maxRotation) {
			System.out.println(location + "KumhoTire 수명 : " + (maxRotation - accumulatedPotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + "KumhoTire 펑크" + "***");
			return false;
		}
	}
}
