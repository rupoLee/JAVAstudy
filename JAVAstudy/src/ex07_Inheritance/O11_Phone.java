package ex07_Inheritance;




/*


추상 클래스 : 클래스 선언 시 abstract 추가
실체 클래스가 공통으로 가져야 할 필드, 메소드를 정의 해 놓는 클래스
실체 클래스 통일화 목적

new로 직접 생성자를 호출할 수는 없다
자식 객체가 생성될 때 super(...)를 호출해서 추상클래스 객체를 생성하기에 생성자 필수


*/


public abstract class O11_Phone {	//추상클래스
	//필드
	public String owner;
	
	//생성자
	public O11_Phone(String owner) {
		this.owner = owner;
	}
	
	//메소드
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}
