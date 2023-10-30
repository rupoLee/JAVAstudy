package ex06_1;

public class O2_field_method2 {
	
	public O2_field_method2() {
		
		//패키지가 동일할 경우
		O2_field_method fm = new O2_field_method();
		
		fm.field1 = 1;
		fm.field2 = 1;
//		fm.field3 = 1;	//private 필드 접근 불가
		
		fm.method1();
		fm.method2();
//		fm.method3();	//private 메소드 접근 불가
	}
}
