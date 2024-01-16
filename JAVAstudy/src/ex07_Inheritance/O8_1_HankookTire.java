package ex07_Inheritance;

public class O8_1_HankookTire extends O8_1_Tire {
	
	//생성자
	public O8_1_HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	//메소드
	@Override
	public boolean roll() {
		++accumulatedPotation;
		if(accumulatedPotation < maxRotation) {
			System.out.println(location + "HankookTire 수명 : " + (maxRotation - accumulatedPotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + "HankookTire 펑크" + "***");
			return false;
		}
	}
}
