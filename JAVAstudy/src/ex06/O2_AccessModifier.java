package ex06;

import ex06_1.*;

public class O2_AccessModifier {
	//패키지가 다른 경우
	
	
	//default 클래스 접근 제한
	O2_default_public pu;
//	Default_default de; //클래스 접근 불가 > 같은 패키지에서만 사용 가능
	
	
	//생성자 접근 제한
	//필드
	O2_FieldInit a1 = new O2_FieldInit(true);
//	O3_FieldInit a2 = new O3_FieldInit(1);		//default 생성자 접근 불가
//	O3_FieldInit a3 = new O3_FieldInit("문자열"); //private 생성자 접근 불가
//	>> 동일 패키지든 다른 패키지든 생성자 호출 못하제 제한
	
	
	//필드, 메소드 접근 제한
	public O2_AccessModifier() {
		O2_field_method fm = new O2_field_method();
		
		fm.field1 = 1;
//		fm.field2 = 1;	//default 필드 접근 불가
//		fm.field3 = 1;	//private 필드 접근 불가
		
		fm.method1();
//		fm.method2();	//default 메소드 접근 불가
//		fm.method3();	//private 메소드 접근 불가
	}
}
