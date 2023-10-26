package ex05_class;

public class O5_1_Korean {
	String nation = "대한민국";
	String name;
	String ssn;
	
	//생산자
//	public Korean(String n, String s) {
//		
//		name = n;
//		ssn = s;
//		//n, s = 매개변수 > 필드와 동일한 이름으로
//		//name = name; >동일해서 생성자 내부에서 필드 접근 안됨 / 동일하면 매개변수가 사용 우선순위 높음
//	}
	//수정
	public O5_1_Korean(String name, String ssn) {
		
		this.name = name;
		this.ssn = ssn;
	}
}
