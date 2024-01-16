package ex07_Inheritance;

public class O6_B {
	public void method() {
		//접근 제한자 테스트
		O6_A a = new O6_A();
		a.field = "value";
		a.method();
		
		//전체 접근 가능
	}
}
