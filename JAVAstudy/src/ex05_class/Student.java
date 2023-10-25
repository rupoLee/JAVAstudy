package ex05_class;

public class Student {
	//라이브러리 class
	
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		
		Student s2 = new Student();
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
		
		//라이브러리인 동시에 실행가능하지만 대부분 분리
	}
}
