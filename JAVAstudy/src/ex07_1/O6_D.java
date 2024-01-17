package ex07_1;

import ex07_Inheritance.*;

public class O6_D extends O6_A {
	
	public O6_D() {
		//접근 제한자 테스트
		super();	//O6_A 생성자 호출
		this.field = "value";
		this.method();
		
		//전체 접근 가능
	}
}
