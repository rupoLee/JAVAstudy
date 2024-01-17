package ex07_Inheritance;

public class O7_Promotion_Child {
	public static void main(String[] args) {
		//자동타입 변환 후 멤버 접근
		
		O7_2_Child child = new O7_2_Child();
		
		O7_1_Parent parent = child;	//자동 타입 변환
		parent.method1();
		parent.method2();	//재정의 된 메소드 호출
//		parent.method3();	//호출 불가능
	}

}
