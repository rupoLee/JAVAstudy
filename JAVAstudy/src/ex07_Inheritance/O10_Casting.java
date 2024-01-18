package ex07_Inheritance;

public class O10_Casting {	//강제 타입 변환
	public static void main(String[] args) {
		/*
		 자동 타입 변환
		 
		 byte byten = 10;
		 int intn = byten;	> 컴파일 시 byten이 int형으로 변환 됨
		 
		 O10_Parent parent = new O10_Child();
		 > 자식클래스가 부모클래스로 변환 됨
		 이때 부모클래스의 필드와 메소드만 접속 가능
		 다만 메소드가 자식클래스에서 오버라이딩 됐을 경우 자식클래스의 메소드가 호출 됨
		 
		 */
		
		
		
		O10_Parent parent = new O10_Child();	//자식이 부모 타입이 됨
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		/*
		부모클래스의 필드와 메소드만 접속 가능
		
		parent.field2 = "data2";
		parent.method3();
		*/
		
		O10_Child child = (O10_Child) parent;	//자식 타입 원래대로 강제 변환
		child.field2 = "data2";
		child.method3();
		child.method2();
		
		/*
		강제 타입 변환은 자식이 부모 타입으로 변환 됐을 때만 가능
		O10_Parent parent1 = new O10_Parent();
		O10_Child child1 = (O10_Child) parent1;	> 강제 타입 변환 불가 / ClassCastException 발생
		child1.field1();	> 안됨
		*/
	}

}
