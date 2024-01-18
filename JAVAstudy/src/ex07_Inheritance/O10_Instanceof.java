package ex07_Inheritance;

public class O10_Instanceof {
	
	public static void method1(O10_Parent parent) {
		if(parent instanceof O10_Child) {	//변환 가능 확인
			O10_Child child = (O10_Child) parent;
			System.out.println("method1 O10_Child로 변환 성공");
		} else {
			System.out.println("method1 O10_Child로 변환 실패");
		}
	}
	
	
	public static void method2(O10_Parent parent) {
		O10_Child child = (O10_Child) parent;	//ClassCastException 발생 가능성 있음
		System.out.println("method2 O10_Child로 변환 성공");
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		/*
		O10_Parent parent = new O10_Child();
		O10_Child child = (O10_Child) parent;
		
		강제 타입 변환은 자식이 부모 타입으로 변환 됐을 때만 가능
		O10_Parent parent1 = new O10_Parent();
		O10_Child child1 = (O10_Child) parent1;	> 강제 타입 변환 불가 / ClassCastException 발생
		child1.field1();	> 안됨
		
		parent나 parent1가 참조하는 객체가 부모인지 자식인지 확인

		instanceof 연산자는 강제타입변환이 필요할 경우 어떤개체인지 확인 후 안전하게 변환하는 용도로 사용
		사용 법 : boolean result = 객체 instanceof 타입
		*/
		
		O10_Parent parentA = new O10_Child();
		method1(parentA);
		method2(parentA);
		
		O10_Parent parentB = new O10_Parent();
		method1(parentB);
		method2(parentB);	//예외 발생
	}

}
