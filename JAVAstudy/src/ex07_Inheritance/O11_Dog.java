package ex07_Inheritance;

public class O11_Dog extends O11_Animal {

	public O11_Dog() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {	//추상 메소드 재정의
		System.out.println("멍멍");
	}
}
