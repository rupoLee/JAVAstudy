package ex07_Inheritance;

public class O8_1_Tire {
	
	//필드
	public int maxRotation;				//최대 회전수(타이어 수명)
	public int accumulatedPotation;		//누적 회전수
	public String location;				//타이어 위치
	
	//생성자
	public O8_1_Tire(String location, int maxRotation) {
		//초기화
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//메소드
	public boolean roll() {
		++accumulatedPotation;		//누적 회전수 1증가
		if(accumulatedPotation < maxRotation) {
			System.out.println(location + "Tire 수명 : " + (maxRotation - accumulatedPotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + "Tire 펑크" + "***");
			return false;
		}
	}
}
