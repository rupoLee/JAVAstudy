package ex07_Inheritance;


/*

추상 메소드 : 메소드 선언만 있거 {}가 없음
자식 클래스는 반드시 추상메소드를 재정의(오버라이딩) 후 실행 내용 작성 해야함
ex) 컨트롤에서 service > serviceImpl

*/


public abstract class O11_Animal {	//추상 클래스
	
	public String kind;
	
	public void breath() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound();	//추상 메소드
}
