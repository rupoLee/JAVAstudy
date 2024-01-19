package ex07_Inheritance;

public class O11_SmartPhone extends O11_Phone {	//실체클래스
	//생성자
	public O11_SmartPhone(String owner) {
		super(owner);
	}
	
	//메소드
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}

}
