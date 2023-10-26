package ex05_class;

public class O8_2_Television {
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	
	int num;
	
	 /*
	  * 초기화 작업을 위한 정적 블록
	  * 내부에 여러개 선언되도 상관없음
	  * 객체가 없어도 실행
	  * 인스턴스 필드, 메소드 사용 불가
	  * this 사용 불가
	  * 
	  * */
	static {
		info = company + "-" + model;
		//info의 초기값 설정
		
		O8_2_Television te = new O8_2_Television();
		te.num = 0;
		//정적 블록에서 인스턴스 멤버를 사용하고 싶으면 객체 먼저 생성 후 참조 변수로 접근
	}
}
