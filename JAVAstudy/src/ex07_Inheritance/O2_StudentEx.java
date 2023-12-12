package ex07_Inheritance;

public class O2_StudentEx {

	public static void main(String[] args) {
		O2_2_Student student = new O2_2_Student("홍길동", "123456-1234567", 1);
		
		//부모에게 물려받은 필드 출력
		System.out.println("name : " + student.name);
		System.out.println("ssn : " + student.ssn);
		
		System.out.println("studentNo : " + student.studentNo);
	}

}
