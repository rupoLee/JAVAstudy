package ex06_1;

public class O2_FieldInit {
	
	//필드
	O2_FieldInit a1 = new O2_FieldInit(true);
	O2_FieldInit a2 = new O2_FieldInit(1);
	O2_FieldInit a3 = new O2_FieldInit("문자열");
	
	
	//생성자
	public O2_FieldInit(boolean b) {} 	//public 접근 제한
	O2_FieldInit(int n) {} 				//default 접근 제한
	private O2_FieldInit(String s) {}	//private 접근 제한
	
	
	
}
