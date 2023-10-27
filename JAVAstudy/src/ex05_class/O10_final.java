package ex05_class;

public class O10_final {

	public static void main(String[] args) {
		O10_1_Person p1 = new O10_1_Person("123456-1234567", "계백");

		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
//		p1.nation = "usa";
//		p1.ssn = "654321-7891234";
		//final 핃드 수정 불가
		p1.name = "을지문덕";
		System.out.println("-----------------------");
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		
		System.out.println("-----------------------");
		
		//상수 사용
		System.out.println("지구의 반지름: " + O10_2_Earth.EARTH_RADIUS);
		System.out.println("지구의 표면적: " + O10_2_Earth.EARTH_SURFACE_AREA + " km^2");
	}

}
