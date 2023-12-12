package ex07_Inheritance;

public class O2_2_Student extends O2_1_People {
	public int studentNo;
	
	public O2_2_Student(String name, String ssn, int studentNo) {
		super(name, ssn);	//부모생성자 호출
		this.studentNo = studentNo;
	}
}
