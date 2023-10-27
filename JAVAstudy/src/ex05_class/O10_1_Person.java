package ex05_class;

public class O10_1_Person {
	
	/*
	 * final 필드는 초기값이 저장되면 프로그램 실행도중 수정 불가
	 * 
	 * */
	
	final String nation = "korea";
	final String ssn;
	String name;
	
	public O10_1_Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
