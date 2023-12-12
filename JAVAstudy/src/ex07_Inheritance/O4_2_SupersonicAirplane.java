package ex07_Inheritance;

public class O4_2_SupersonicAirplane extends O4_1_Airplane {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int fiyMode = NORMAL;
	
	/*
	 * 부모 클래스의 메소드를 오버라이딩 하면 부모클래스 메소드는 숨겨지고
	 * 오버라이딩된 메소드만 사용
	 * */
	
	@Override
	public void fly() {
		if(fiyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다.");
		} else {
			
			/*
			 * O4_1_Airplane 객체의 fly() 메소드 호출
			 * 
			 * 자식 쿨래스 내부에서 오버라이딩 된 부모클래스 메소드를
			 * 호출해야 한다면 면시적으로 super을 붙여 호출 가능
			 * super는 부모객체를 참조하기 떄문에 직접 접근 가능
			 * */
			super.fly();
		}
	}
	
}
