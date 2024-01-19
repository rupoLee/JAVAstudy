package ex07_Inheritance;

public class O11_abstractEx {
	public static void main(String[] args) {
		/*
		
		추상클래스의 생성자는 new로 직접 생성자를 호출할 수는 없다
		자식 클래스 smartPhone로 객체를 생성 해 추상클래스의 메소드 사용 가능
		
		*/
//		O11_Phone phone = new O11_Phone("홍길동");
		
		O11_SmartPhone smartPhone = new O11_SmartPhone("홍길동");
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
}
