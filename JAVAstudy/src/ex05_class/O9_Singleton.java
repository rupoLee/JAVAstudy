package ex05_class;

public class O9_Singleton {

	public static void main(String[] args) {

//		O9_1_Singleton obj1 = new O9_1_Singleton(); //생산자 호출 에러
		
		O9_1_Singleton obj1 = O9_1_Singleton.getInstance(); //메소드 호출
		O9_1_Singleton obj2 = O9_1_Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 singleton 객체입니다.");
		} else {
			System.out.println("다른 singleton 객체입니다.");
		}

	}

}
